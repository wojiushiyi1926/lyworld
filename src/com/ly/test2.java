package com.ly;

public class test2 {
	public static void main(String[] args) {
	int[] arr={1,2,3,43,4,4};
	wm(arr);
	System.out.print("-----------------------------------");
	fm(arr);
	System.out.print("dm"+dm(arr,0));
	
}
	public static void whileMethod(int x) {
	    int sum = 0;	    
	    while (x>=1) {
	        sum += x;
	        x--;
	    }
	    System.out.println("while:"+sum);
	}
	//计算数组，用while
	public static void wm(int[] aar){
		if (aar == null || aar.length<1){
			return;
		}
		int sum=0;
		int i=0;
		while(i<aar.length){
			sum+=aar[i];
			i++;
		}
		System.out.print(sum);	
		}
	
//for
public static void fm(int[] aar){
	if (aar == null || aar.length<1){
		return;
	}
	int sum1=0;
	int i=0;
	for(i=0;i<aar.length;i++){
		sum1+=aar[i];
		i++;
	}
	System.out.print(sum1);	
	}

public static int dm(int[] aar,int i){
	if (aar == null || aar.length<1){
		return 0;
	}

	if(i<aar.length){
		return aar[i]+dm(aar,i+1);
	}
	return 0;	
	}
}


