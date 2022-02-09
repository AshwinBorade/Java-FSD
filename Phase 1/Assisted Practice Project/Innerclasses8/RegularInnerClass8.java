package com.AssistedProjects;

public class RegularInnerClass8 {
	private int a=33;
	
	 class Inner{
		 void display() {
			 System.out.println("welcome to innerclass");
			 System.out.println("variable assign "+a);
		 }

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    RegularInnerClass8 outer=new RegularInnerClass8();
	        RegularInnerClass8.Inner inner=outer.new Inner();
	         inner.display();
	}

}
