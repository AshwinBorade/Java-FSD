package com.AssistedProjects;

public class CallMethod4Point1 {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return (val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethod4Point1 d = new CallMethod4Point1();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);

	}

}
