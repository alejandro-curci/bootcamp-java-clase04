package integrador;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) {
        Properties properties= new Properties();
        Object obj = new Object();
        try {
            properties.load(new FileInputStream(new File("MiFactory.properties")));
            String name = properties.getProperty(objName);
            obj = Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
