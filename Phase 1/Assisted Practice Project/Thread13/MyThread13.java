package com.AssistedProjects2;

public class MyThread13 extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread13 mt = new  MyThread13();
  		mt.start();


	}

}
