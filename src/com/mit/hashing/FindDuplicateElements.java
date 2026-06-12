//WAp to find the duplicate element from the bellow array 
//arr=[10,2,40,80,90,20,80,10]

package com.mit.hashing;

import java.util.HashSet;

public class FindDuplicateElements {

    public static void main(String[] args) {

        int arr[] = {10, 2, 40, 80, 90, 20, 80, 10};

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (set.add(arr[i]) == false) {
                System.out.println("Duplicate Element: " + arr[i]);
            }
        }
    }
}