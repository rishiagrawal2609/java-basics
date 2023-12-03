package Lecture2;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,34,4,5,6,3,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void insertionSort(int[] arr){
        for (int index = 0; index < arr.length-1; index++) {
            for (int prev = index+1; prev>0 ; prev--) {
                if(arr[prev]<arr[prev-1]){
                    swap(arr,prev,prev-1);
                }else {
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
