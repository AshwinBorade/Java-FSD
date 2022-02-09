package com.AssistedProjects;

public class AccessSpecifier2 {
	 public String name="ashwin";
	 private String name2="vijay";
	 protected String name3="pravin";
	 int i=10;

	public static void main(String[] args) {
		AccessSpecifier2 as=new AccessSpecifier2();
		as.firstmethod();
		System.out.println(as.name);
		System.out.println(as.name3);
		System.out.println(as.i);
	}// TODO to-generated method stub
       
	
	  void firstmethod() {
		  System.out.println(name);
		  System.out.println(name2);
		  System.out.println(name3);
		  System.out.println(i);
  }
	}


