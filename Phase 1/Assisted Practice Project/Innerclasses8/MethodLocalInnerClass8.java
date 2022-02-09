package com.AssistedProjects;

public class MethodLocalInnerClass8 {
	public void display() {
		class Inner{
			void myMethod() {
			System.out.println("welcome to programming");
		}
		}			
		Inner inner=new Inner();
		inner.myMethod();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClass8 mlic=new MethodLocalInnerClass8();
		mlic.display();


	}

}
