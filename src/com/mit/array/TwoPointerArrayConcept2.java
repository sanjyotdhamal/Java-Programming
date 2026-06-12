//ap to find pair of sum which matches the target value {3,6,7,9,10} 
//target =10and op should be 3,7

package com.mit.array;
public class TwoPointerArrayConcept2 {
	
	public static void main(String[] args) {

        int arr[] = {3, 6, 7, 9, 10};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " , " + arr[right]);
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}


