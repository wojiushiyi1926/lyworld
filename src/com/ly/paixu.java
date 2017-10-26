package com.ly;

import java.util.Arrays;

public class paixu {
	public static void main(String[] args) {
		int[] arr={5,8,62,3,75,90};
		/*Arrays.sort(arr);
		for(i=0;i<arr.length;i++){
			
		}	
		 System.out.println("ÉýÐòÅÅÁÐ£º");
		  for (int i=0;i<arr.length ;i++ )
		  {   
		   System.out.print(arr[i]+" ");   
		  }*/
		 
			shengxu(arr);
	}
	public static void shengxu(int[]a){
		int i=0;
		int j=0;
		int temp =0;
		for(i=0;i<a.length-1;i++)
			for(j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}	
}
