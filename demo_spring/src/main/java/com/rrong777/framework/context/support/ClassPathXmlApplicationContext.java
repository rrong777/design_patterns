package com.rrong777.framework.context.support;

import com.rrong777.framework.beans.BeanDefinition;
import com.rrong777.framework.beans.MutilablePropertyValues;
import com.rrong777.framework.beans.PropertyValue;
import com.rrong777.framework.beans.factory.support.BeanDefinitionRegistry;
import com.rrong777.framework.beans.factory.support.XmlBeanDefinitionReader;
import com.rrong777.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * IOC容器的具体子实现类
 * 加载类路径下的XML配置文件生成容器
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    public ClassPathXmlApplicationContext(String configLocation) {
        // 这个配置文件路径是定义在父类中的。
        this.configLocation = configLocation;
        // 构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据bean对象的名称获取bean对象
    @Override
    public Object getBean(String name) throws Exception {
        // 判断对象容器中是否包含指定名称的bean对象，如果包含直接返回即可。如果不包含，要去创建
        Object obj = singletonObjects.get(name);// 能获取到的话说明已经存在了
        if(obj != null) {
            return obj;
        }
        // 如果null 不存在，自己去创建
        // 获取be'anDefinition对象  先获取注册表对象，再去获取具体的be'anDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        // 获取bean信息中的classname
        String className = beanDefinition.getClassName();
        // 通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        // 进行依赖注入操作
        // 获取property的容器，这是迭代器模式，所以可以用迭代器去遍历 。可以用迭代器遍历的都可以用增强for循环去遍历
        MutilablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for(PropertyValue propertyValue : propertyValues) {
            // 获取name属性值，
            String propertyName = propertyValue.getName();
            // 获取property标签的value属性
            String value = propertyValue.getValue();
            // 获取ref属性
            String ref = propertyValue.getRef();
            // ref和value属性，对于property标签来说只能存在一个。
            // ref为空或者空串/
            // 如果ref不为空或空串，证明这个property标签是指向一个对象
            if(ref != null && !"".equals(ref)) {
                // 如果是ref 证明已经有这个对象了，在配置文件中已经有了，现在是引用过来
                // 获取依赖的bean对象。
                Object bean = getBean(ref); // 递归操作
                // 拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                // 通过字节码对象，获取所有方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if(methodName.equals(method.getName())) {
                        // 执行该setter方法 beanObj.methodName(bean); 相当于是这样，一个是调用者一个是参数method.invoke()的两个方法。
                        // 所以判断完之后通过反射去调用。而不是我们写死的 bean.setXxx();
                        method.invoke(beanObj, bean);
                    }
                }
            }
            // 如果value不为空或空串，证明这个property（属性）是基本数据类型数据或者字符串
            if(value != null && !"".equals(value)) {
                // 拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                // 获取method对象 参数:方法名，参数类型，我们这里只针对字符串进行操作
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj, value);
            }
        }


        // 在返回BeanObj对象之前将该对象存储到Map容器中
        singletonObjects.put(name, beanObj);

        return beanObj;
    }

    // 重载的getBean
    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        // 获得一个bean对象
        Object bean = getBean(name);
        if(bean == null) {
            return null;
        }
        // 这个方法就是进行一个类型强转。
        return clazz.cast(bean);
    }
}
