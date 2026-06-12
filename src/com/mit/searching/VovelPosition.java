package com.mit.searching;

public class VovelPosition {

    public static void main(String[] args) {

        String str = "my name is sanjyot";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                System.out.println("First vowel is " + ch);
                System.out.println("Position is " + i);
                break;
            }
        }
    }
}