package com.chen.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
    private static final Properties properties;

    static {
        properties = new Properties();
        try(InputStream is = ConfigUtil.class.getClassLoader().getResourceAsStream("application.conf")) {
            properties.load(is);
        }catch (IOException exc){
            throw new RuntimeException(exc);
        }
    }

    public static Properties getProperties(){
        return properties;
    }
}
