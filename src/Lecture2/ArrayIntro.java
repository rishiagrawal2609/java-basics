package Lecture2;

import java.util.Arrays;
import java.util.SortedMap;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] num = new int[4];
        num[0] =10;
        System.out.println(num);
        System.out.println(Arrays.toString(num));

        int[] nums = {10,11,23,45};
        System.out.println(Arrays.toString(nums));
        nums[0] = 200;
        System.out.println(Arrays.toString(nums));
        System.out.println(num.length);

        int[] another = Arrays.copyOfRange(nums,1,3);
        System.out.println(Arrays.toString(another));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
