//there are 5 student in class and 3 subjedct phy,maths, marathi they secured below marks 
//1=> 59,49,39 2 => 90, 44, 36 3=> 45,34,67, 4=

package com.mit.array;

public class StudentMarks {

	public static void main(String[] args) {

		int[][] marks = {
				{59, 49, 39},
				{90, 44, 36},
				{45, 34, 67},
				{40, 35, 78},
				{46, 99, 56}
		};

		int maxPhysics = marks[0][0];
		int maxMaths = marks[0][1];
		int maxMarathi = marks[0][2];

		for (int i = 1; i < marks.length; i++) {

			if (marks[i][0] > maxPhysics) {
				maxPhysics = marks[i][0];
			}

			if (marks[i][1] > maxMaths) {
				maxMaths = marks[i][1];
			}

			if (marks[i][2] > maxMarathi) {
				maxMarathi = marks[i][2];
			}
		}

		System.out.println("Highest Marks in Physics : " + maxPhysics);
		System.out.println("Highest Marks in Maths   : " + maxMaths);
		System.out.println("Highest Marks in Marathi : " + maxMarathi);
	}
}