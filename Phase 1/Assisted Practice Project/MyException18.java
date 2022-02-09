
package com.AssistedProjects2;

public class MyException18 extends Exception {
	String str1;
	   MyException18(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	class Example1{
	public static void main(String[] args) {
	
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException18("This is My error Message");
		}
		catch(MyException18 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}

		   }
		}

	}


