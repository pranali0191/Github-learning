package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) throws IOException
	{
		//To create a file
		File f1=new File(System.getProperty("user.dir")+"\\MyFile.txt");		
		f1.createNewFile();
		System.out.println("new file created");
		
		//to write
		
		FileWriter wr=new FileWriter("MyFile.txt");
		wr.write("hello all, how are you");
		wr.close();
		
		//To read
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
		f1.delete();
		System.out.println("File is deleted");
	}

}
