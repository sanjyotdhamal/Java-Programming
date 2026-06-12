//WAP to reverse the alternative substring
//ip:- India is my country

package com.mit.searching;

public class ReverseSubstring {

    public static void main(String[] args) {

        String str = "India is my country";

        String[] splitArr = str.split(" ");

        int i = 1;

        while (i < splitArr.length) {

            String rev = "";

            for (int j = splitArr[i].length() - 1; j >= 0; j--) {
                rev = rev + splitArr[i].charAt(j);
            }

            splitArr[i] = rev;

            i = i + 2;
        }

        for (String word : splitArr) {
            System.out.print(word + " ");
        }
    }
}

