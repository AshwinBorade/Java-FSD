package com.AssistedProjects;

public class OverloadMethod4Point2 {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMethod4Point2 ob=new OverloadMethod4Point2();
	       ob.area(13,17);
	       ob.area(7);  


	}

}
