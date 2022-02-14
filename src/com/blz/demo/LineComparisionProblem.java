package com.blz.demo;

import java.util.Scanner;

public class LineComparisionProblem {
	public static int LineLengthCal() {
		/*
		 * Asking User To Calculate The Lengths Of Two Lines Enter Values Of Point To
		 * Calculate The Lengths
		 */
		int x1;
		int x2;
		int y1;
		int y2;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of : x1,x2,y1,y2");
		x1 = src.nextInt();
		y1 = src.nextInt();
		x2 = src.nextInt();
		y2 = src.nextInt();
		int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return lineLength;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program on master branch ");
		int lineLength = LineLengthCal();
		System.out.println("The length of line is: " + lineLength);

	}
	// TODO Auto-generated method stub

}
