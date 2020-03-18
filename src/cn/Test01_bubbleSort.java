package cn;

import java.util.Arrays;

public class Test01_bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,9,63,78,96,51,26,74,99,13,25,37};

        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums){
        for(int i=nums.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}






















