package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		 FileReader fr = new FileReader("C:\\Users\\Lenovo\\New workspace\\TestAutomationframework\\src\\test\\resources\\configfiles\\config.properties");
      
		 Properties p = new Properties();
		 p.load(fr);
		 System.out.println(p.getProperty("Browser"));
		 System.out.println(p.getProperty("TestUrl"));
		 
		 
		 
	}

}
