package Lecture2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] nums = {1,4,5,3,4,6,3,7,4,9,3};
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = findMaxIndex(arr,0,(arr.length - i- 1));
            swap(arr,index,arr.length-i-1);
            }
        }
    public static int findMaxIndex(int[] arr, int start,int end){
        int maxByIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxByIndex]){ //provide the last occurrence just make > to >=
                maxByIndex = i;
            }
        }
        return maxByIndex;
    }
    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
