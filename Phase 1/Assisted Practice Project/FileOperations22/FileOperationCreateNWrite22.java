package com.AssistedProjects3;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperationCreateNWrite22 {

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
