package com.mit.searching;

public class SelectionSort {

	    public static void main(String[] args) {

	        int[] arr = {30, 70, 20, 80, 10};

	        for (int i = 0; i < arr.length - 1; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }

	        System.out.println("Sorted Array:");

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
