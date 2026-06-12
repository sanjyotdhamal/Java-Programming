package com.mit.array;
public class MaxWatcherCount {

    public static void main(String[] args) {

        int arr[] = {25, 45, 74, 80,90, 40, 60,80, 40, 50, 40};

        int k = 3;

        int sum = arr[0] + arr[1] + arr[2];
        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum watchers for 3 consecutive days = " + maxSum);
    }
}