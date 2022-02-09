package com.AssistedProjects2;

public class InheritanceOverloadNOverriding20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Eagle e =new Eagle();
    e.eat();
    e.transport();
    
    Penguine P =new Penguine();
    P.eat();
    P.transport();
    
    MyOverride mo=new MyOverride();
    System.out.println( mo.add(7, 9));
    System.out.println( mo.add(3, 8, 78));
    System.out.println( mo.areaOfCircle(3.3f));
    System.out.println( mo.areaOfSquare(5.4f));
	}
}

	
