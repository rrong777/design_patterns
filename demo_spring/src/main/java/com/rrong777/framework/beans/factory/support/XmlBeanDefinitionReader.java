package com.rrong777.framework.beans.factory.support;

import com.rrong777.framework.beans.BeanDefinition;
import com.rrong777.framework.beans.MutilablePropertyValues;
import com.rrong777.framework.beans.PropertyValue;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * 针对xml配置文件进行解析的类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader{
    // 声明注册表对象 解析器是用来解析xml配置文件的。解析到的xml配置文件，并且把里面的bean封装成。BeanDefinition对象。这些对象注册到注册表对象里面。符合迪米特法则
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }


    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    // 加载BeanDefinitions ，
    // configLocation类路径的配置文件的路径

    /**
     * // 解析的是下面这种类型的配置文件
     * <beans>
     *     <bean id="userService" class="com.xxx.service.impl.UserServiceImpl">
     *         <property name="userDao" ref="userDao"></property>
     *     </bean>
     *     <bean id="userDao" class="com.xxx.dao.impl.userDaoImpl">
     * </beans>
     * @param configLocation
     * @throws Exception
     */
    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j进行xml文件的解析
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件 这个配置文件怎么获取？ 获得当前类的字节码文件(class) 再去获取类加载器，通过类加载器再去获取对应的字节输入流对象.
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        // 根据document对象获取根标签对象（beans）
        Element rootElement = document.getRootElement();

        // 获取根标签(<beans>) 下的所有<bean>标签
        List<Element> beanElements = rootElement.elements("bean");
        // 遍历bean标签
        for (Element beanElement : beanElements) {
            // 获取id属性
            String id = beanElement.attributeValue("id");
            String className = beanElement.attributeValue("class");
            // 获取class属性

            // 将两个属性封装到BeanDefinition当中
            // 1. 创建BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            // 创建MutilablePropertyValues容器对象
            MutilablePropertyValues mutilablePropertyValues = new MutilablePropertyValues();


            // 获取<bean>标签下的所有<property>标签
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutilablePropertyValues.addPropertyValue(propertyValue);
            }
            // 将MutilablePropertyValues封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(mutilablePropertyValues);

            // 将beanDefinition对象注册到注册表。
            // id就是bean标签的id 其实就是bean的name
            registry.registerBeanDefinition(beanDefinition.getId(), beanDefinition);
        }
    }
}
