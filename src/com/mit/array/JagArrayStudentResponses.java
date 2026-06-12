package com.mit.array;

public class JagArrayStudentResponses {

    public static void main(String[] args) {

        String[][] initializationarr = {
            {"Yes", "Good", "Bad"},
            {"No", "Excellent", "Excellent", "Not Disclosed"},
            {"Yes", "Bad"},
            {"Yes"},
            {"Yes", "Good"}
        };

        for (int i = 0; i < initializationarr.length; i++) {
            System.out.println("Student " + (i + 1) + " Data");

            for (int j = 0; j < initializationarr[i].length; j++) {
                System.out.println(initializationarr[i][j]);
            }

            System.out.println();
        }
    }
}