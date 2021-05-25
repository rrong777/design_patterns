package com.rrong777.framework.utils;

import java.util.Locale;

public class StringUtils {
    public StringUtils() {
    }

    /**
     * userDao -> setUserDao
     * @param filedName
     * @return
     */
    public static String getSetterMethodByFieldName(String filedName) {
        String methodName = "set" + filedName.substring(0,1).toUpperCase() + filedName.substring(1);
        return methodName;
    }
}
