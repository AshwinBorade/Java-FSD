package com.AssistedProjects2;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FilehandlingWrite19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello.friends welcome to java files");
       
		try {
			  FileWriter writer = new FileWriter("one.txt");
			  writer.write("hey everyone ");
		      writer.write(" "+"GTA vicecity is a gaming platform");
		      writer.flush();
		      writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        	
	}

}
