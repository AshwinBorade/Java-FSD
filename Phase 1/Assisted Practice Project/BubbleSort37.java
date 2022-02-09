package com.AssistedProjects4;

public class BubbleSort37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {22,23,12,45,36,78,88,90};
      bubbleSort(arr);
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(i);
      }
	}
    	  public static void bubbleSort(int[] arr) {
    		  int len=arr.length;
    		  int temp=0;
    		  for(int i=0;i<arr.length-1;i++) {
    			  for(int j=1;j<arr.length;i++) {
    				  if(arr[j]>arr[j-1]) {
    					 temp=arr[j-1];
    					 arr[j-1]=arr[j];
    					 arr[j]=temp;
    				  }
    			  }
    		  }
    	 
	}

}
