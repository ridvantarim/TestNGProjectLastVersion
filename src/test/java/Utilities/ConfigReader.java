package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class reads the configuration.properties file
    //Create Properties instance
    private static Properties properties;
    static {
        //path of the configuration file
        //        data cekmek istedigim dosyaninin path i
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream
            //            configuration.property dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);
            //            properties objesini instantiate ediyoruz
            properties = new Properties();
            //            configuration.property dosyasindaki datalari yukler
            properties.load(fileInputStream);
            //close the file
            //            file input steam i kapatilir
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file

    //    ConfigReader.getProperty("browser"); -> chrome
//    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
//    ConfigReader.getProperty("username"); -> ali
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
