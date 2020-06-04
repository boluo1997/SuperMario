package cn;

import java.util.Arrays;

public class Test02_selectSort {
    public static void main(String[] args) {
        int[] nums = {5,9,63,78,96,51,26,74,99,13,25,37};

        selectSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

}
