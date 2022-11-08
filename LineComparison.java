package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public float length() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x1 and y1 co-ordinates");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		System.out.println("Enter x2 and y2 co-ordinates");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float length = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
		return length;
	}

	public float equalityCheck(Float len1, Float len2) {

		System.out.println("Java Equals Method");
		// Java Equals
		if (len1.equals(len2)) {
			System.out.println("Length of two lines are Equal");
		}

		System.out.println("Java Compare Method");
		// Java Compare
		float comp = Float.compare(len1, len2);
		if (comp > 0) {
			System.out.println("Length of line1 is greater than line 2");
		} else if (comp < 0) {
			System.out.println("Length of line1 is smaller than line 2");
		} else {
			System.out.println("Length of two lines are equal");
		}

		System.out.println("Java Compareto Method");
		// java CompareTo
		float compare = len1.compareTo(len2);
		if (compare > 0) {
			System.out.println("Length of line1 is greater than line 2");
		} else if (compare < 0) {
			System.out.println("Length of line1 is smaller than line 2");
		} else {
			System.out.println("Length of two lines are equal");
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		LineComparison dist = new LineComparison();
		Float length1 = dist.length();
		Float length2 = dist.length();
		System.out.printf("Length of the line 1 is %.2f", length1);
		System.out.printf("\nLength of the line 2 is %.2f\n", length2);
		dist.equalityCheck(length1, length2);
	}

}
