package com.gqt.fstrainings.arrays;

public class minmax {

	/**
	 * @param args
	 * @param 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,15,20,35,65,19};
		int min=arr[0];
		int max=arr[0];
		// finding min in the array
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("min:"+min);
		System.out.println("max : "+max);
}
}
