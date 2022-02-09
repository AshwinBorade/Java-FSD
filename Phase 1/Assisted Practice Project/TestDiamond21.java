package com.AssistedProjects3;

  

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  

default void show() 
{ 
    System.out.println("Default Second"); 
} 
} 

public class TestDiamond21 implements First,Second {
	
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestDiamond21 ob = new TestDiamond21(); 
        ob.show(); 

	}

}
