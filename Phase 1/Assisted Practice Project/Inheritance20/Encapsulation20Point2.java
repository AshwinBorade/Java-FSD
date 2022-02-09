package com.AssistedProjects2;

public class Encapsulation20Point2 {
	private String name;
	private int Age;
	private int Rollno;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public int getRollno() {
		return Rollno;
	}


	public void setRollno(int rollno) {
		Rollno = rollno;
	}

}
class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Encapsulation20Point2 ep=new Encapsulation20Point2();
        ep.setAge(12);
        ep.setName("ashwin");
        ep.setRollno(17);
        
        System.out.println(ep.getAge());
        System.out.println(ep.getName());
        System.out.println(ep.getRollno());
	}
}

