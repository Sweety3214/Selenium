package TestNgFetchPropertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile
{

	@Test
	public void DemoTest() throws IOException {
		//1.Convet the physical file into java understandable file(.FileUnputStream class)
	FileInputStream fileInputStream=new FileInputStream("./Data/CommonData1.properties");
	
	//2.Create an obj for Properties Class
	Properties property= new Properties();
	
	//3.Load all Property
	property.load(fileInputStream);
	
	//4.Read /Get the data
	String data1=property.getProperty("URL");
	String data2=property.getProperty("UserName");
	String data3=property.getProperty("Password");
	
	
	//print in console
	System.out.println(data1);
	
	System.out.println(data2);
	
	System.out.println(data3);
	
	
	//Write the data from the property--updating
	//1.write the data (Using put(key,value))
	property.put("name", "Banu");
	property.put("Hname", "Jo");
	property.put("Dname", "Ly");
	
	
	//1.Convet the physical file into java understandable file(.FileOutputStream class)
		FileOutputStream fileOutputStream=new FileOutputStream("./Data/CommonData.properties");

		
		//2.Store/save the data
	property.store(fileOutputStream,"Updated New Key-name");
	
	System.out.println("Execution Completed");
	
	}
	
	
	
	
}
