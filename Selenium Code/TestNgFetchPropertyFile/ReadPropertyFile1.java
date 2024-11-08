package TestNgFetchPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile1 {

@Test
public void propertyFile() throws IOException {
	///1.Convet the physical file into java understandable file(.FileUnputStream class)
		FileInputStream fileInputStream=new FileInputStream("./Data/CommonData1.properties");
		
		//Create ob for property class
		Properties property =new Properties();
		
		//Load all the property
		property.load( fileInputStream);
		
		//Get/Read the data
		String data1=property.getProperty("Word");
		String data2=property.getProperty("Institute");
		String data3=property.getProperty("Place");
		
		//print in the console
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		//Updating the data
		
		property.put("YOP","2019");
		property.put("College","MACET");
		property.put("College Venue","KK");
		
		///1.Convet the physical file into java understandable file(.FileUnputStream class)
				FileOutputStream fileOutputStream =new 	FileOutputStream ("./Data/CommonData1.properties");
		//Store the dataa
				property.store(fileOutputStream,"updated" );
				System.out.println("Completed");
}

}
