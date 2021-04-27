package com.mphasis.java.day1;

public class Circle {
	public void calc(double radius) {
		double area, circ;
		area = 3.14*radius*radius;
		circ = 2*3.14*radius;
		System.out.println("Area of Circle  " +area);
		System.out.println("Circumference  " +circ);
	}
	public static void main(String[] args) {
		double radius=5.2;
		Circle obj = new Circle();
		obj.calc(radius);
	}

}
