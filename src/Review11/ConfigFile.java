package Review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args){
        //location of the file we want to access
        String path="Files/Config.properties";
//when we have to read the data from a file, we want to use fileinputstream
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("userName"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("URL"));
            System.out.println(properties.getProperty("browser"));

        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong");
        }catch(NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
