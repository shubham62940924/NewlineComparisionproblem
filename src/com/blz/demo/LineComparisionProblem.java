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

	public static void equalityCheck(int line1Length, int line2Length) {
		if (line1Length == line2Length) {
			System.out.println("two lines are equal");
		} else {
			System.out.println("two lines are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program on master branch ");
		int line1Length = LineLengthCal();
		int line2Length = LineLengthCal();
		equalityCheck(line1Length, line2Length);

	}
	// TODO Auto-generated method stub

}
