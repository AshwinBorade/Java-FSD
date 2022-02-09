package com.AssistedProjects3;

import java.io.File;

public class FileOperationDelete22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File myFile=new File("one.copied.txt");
     
     if(myFile.delete()) {
    	 System.out.println("file deleted"+myFile.getName()+"sucessfully");
     }
     else {
    	 System.out.println("file is not deleted");
     }
	}

}
