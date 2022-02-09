package com.AssistedProjects2;

public class MyRunnableThread13 implements Runnable {
	   public static int myCount = 0;
	    public MyRunnableThread13(){
	         
	    }

	    public void run() {
	        while(MyRunnableThread13.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++MyRunnableThread13.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread");
        MyRunnableThread13 mrt = new MyRunnableThread13();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnableThread13.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread13.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread");
    }

	}


