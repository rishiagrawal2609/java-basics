package Lecture2;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10,34,76,54,58,3,5,46,3,76};
        System.out.println(linearSearch(nums,76));
        System.out.println(linearSearch(nums,259));
        System.out.println(lastOccLinearSearch(nums,76));
        System.out.println(lastOccLinearSearch(nums,3948));
        System.out.println(countLinearSearch(nums,3));
        System.out.println(countLinearSearch(nums,3920));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == target) {
                return i;
            }
        }
        return -1;
    }
    //find the last occurrence index
    public static int lastOccLinearSearch(int[] arr, int target){
        int lastOcc = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                lastOcc = i;
            }
        }
        return lastOcc;
    }

    // number of occurrence in an array
    public static int countLinearSearch(int[] arr, int target){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;
    }
}