package cn;

/**
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *
 */
public class Test25_findNumbers {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
            if(str.length()%2 == 0){
                count++;
            }
        }

        return count;
    }
}
