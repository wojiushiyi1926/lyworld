package com.ly;

public class ss {

	/**m
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1=new People();
		p1.setName("winner");
		People p2=p1;
		p2.setName("bfm");
		System.out.print(p1.getName());
		System.out.print(p2.getName());
		
	}

}
