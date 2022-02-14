package calculator;

import java.io.File;

public class FileHandlingProject3Delete3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File myfile=new File("one.txt");
       if(myfile.delete()) {
    	   System.out.println("file deleted sucessfully");
       }
       else {
    	   System.out.println("file not found");
       }
	}

}
