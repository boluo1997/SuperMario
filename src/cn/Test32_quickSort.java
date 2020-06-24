package cn;

import java.util.Arrays;

//快速排序
public class Test32_quickSort {
    public static void main(String[] args) {
        int[] nums = {5,9,63,78,96,51,26,74,99,13,25,37};

        quickSort(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums,int low,int high) {
        if(low < high){
            int index = partition(nums,low,high);
            quickSort(nums,low,index-1);
            quickSort(nums,index+1,high);
        }
    }

    public static int partition(int[] nums,int low,int high){
        int i = low;
        int j = high;

        int x = nums[i];

        while(i<j){

            //j从右往左移,找比x小的值
            while(nums[j]>=x && i<j){
                j--;
            }

            if(i<j){
                nums[i] = nums[j];
                i++;
            }


            while(nums[i]<=x && i<j){
                i++;
            }

            if(i<j){
                nums[j] = nums[i];
                j--;
            }
        }

        nums[i] = x;
        return i;
    }

}
