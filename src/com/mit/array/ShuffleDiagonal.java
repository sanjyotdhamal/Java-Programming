//wap to shuffle diagonal element by next position and make it on diagonal ocation 2*2
//op should be 10 20 30 40

package com.mit.array;

public class ShuffleDiagonal {

    public static void main(String[] args) {

        int[][] arr = {
            {10, 20},
            {30, 40}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {
                    if (j + 1 < arr[i].length) {
                        arr[i][j + 1] = arr[i][j];
                        arr[i][j] = 0;
                    }
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}