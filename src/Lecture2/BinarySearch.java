package Lecture2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,23,46,78,123};
        System.out.println(binarySearch(nums,46));
        System.out.println(binarySearch(nums,233434));

    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
