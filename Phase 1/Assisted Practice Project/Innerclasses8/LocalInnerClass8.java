package com.AssistedProjects;

public class LocalInnerClass8 {
	void validate(int age) {
		if(age>18) {
			class Inner{
				void test() {
					System.out.println("authenticated for vote");
				}
			}
			Inner inner =new Inner();
			inner.test();
		}
		else {
			System.out.println("no need to authenticate");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass8 licd=new LocalInnerClass8();
        licd.validate(12);
	}

}
