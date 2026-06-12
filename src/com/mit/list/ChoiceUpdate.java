package com.mit.list;

public class ChoiceUpdate {
	 public static void main(String[] args) {

	        Student s1 = new Student(10, "Python");
	        Student s2 = new Student(12, "Python");
	        Student s3 = new Student(15, "C++");

	        s1.next = s2;
	        s2.next = s3;

	        Student temp = s1;

	        while (temp != null) {

	            if (temp.rollNo == 12) {
	                temp.course = "Java";
	            }

	            temp = temp.next;
	        }

	        temp = s1;

	        while (temp != null) {
	            System.out.println("Roll No: " + temp.rollNo);
	            System.out.println("Course: " + temp.course);
	            System.out.println();

	            temp = temp.next;
	        }
	    }
	}

	class Student {

	    int rollNo;
	    String course;
	    Student next;

	    Student(int rollNo, String course) {
	        this.rollNo = rollNo;
	        this.course = course;
	    }
	}


