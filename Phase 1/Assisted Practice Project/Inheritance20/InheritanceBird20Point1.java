package com.AssistedProjects2;
//Overriding
public class InheritanceBird20Point1 {
     public void eat() {
    	System.out.println("Eat through beak");
    }
    public void transport() {
    	System.out.println("Transport using wings");
    }
    
}
class Eagle extends InheritanceBird20Point1{
	
}
class Penguine extends InheritanceBird20Point1{
	public void transport() {
		System.out.println("Transport using walking");
	}
}
class MyOverride{
	
	public int add(int a,int b) {
		int c1=a+b;
		return c1;
		
		
	}
	public int add(int a,int b,int c) {
		int c2=a+b+c;
		return c2;
		
	}
	public  double areaOfCircle(float r) {
		double m1=Math.PI*r*r;
		return m1;
	
	}
	public double areaOfSquare(float side) {
		double m2=side*side;
		return m2;
		
	}
	
}
