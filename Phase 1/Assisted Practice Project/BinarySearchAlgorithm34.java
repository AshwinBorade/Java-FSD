package com.AssistedProjects4;

public class BinarySearchAlgorithm34 {
	public static void BinarySearch(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
		     first=mid+1;
		     
			}else if(arr[mid]==key) {
				System.out.println("Element is found at index:" +" "+mid);
				break;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
			
		}
		if(first>last) {
			System.out.println("Element is found");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []arr= {23,34,35,78,89,99};
       int key=34;
       int last=arr.length-1;
       BinarySearch(arr,0,last,key);  
	}

}
