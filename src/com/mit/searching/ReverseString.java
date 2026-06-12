package com.mit.searching;

public class ReverseString {
	    public static void main(String[] args) {

	        String str = "Sanjyot";

	        reverse(str);
	    }

	    public static void reverse(String str) {

	        if (str.length() == 0) {
	            return;
	        }

	        System.out.print(str.charAt(str.length() - 1));

	        reverse(str.substring(0, str.length() - 1));
	    }
	}
