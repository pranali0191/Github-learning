package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Properties {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File(System.getProperty(("User.dir")+"Test.properties"));
		FileInputStream fs= new FileInputStream(f1);
		
		//to read
		Properties p1=new Properties();
		
		

	}

}
