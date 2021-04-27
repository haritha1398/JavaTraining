package com.mphasis.java.day1;

public class CtoK {
	public void calc(double c) {
		double f = (c+273.15);
		System.out.println("Kelvin value  " +f);
	}
	public static void main(String[] args) {
		double c=37;
		CtoK obj = new CtoK();
		obj.calc(c);
	}

}
