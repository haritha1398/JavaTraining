package com.mphasis.java.day1;

public class Calc {
	public void cal(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Sum is " +c);
			
	}

public static void main(String[] args) {
	int a,b;
	a=8;
	b=1;
	Calc obj=new Calc();
	obj.cal(a,b);
	
}
}
