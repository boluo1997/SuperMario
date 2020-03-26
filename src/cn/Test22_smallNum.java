package cn;

/**
 * 给你一个数组 nums，对于其中每个元素 nums[i]，
 * 请你统计数组中比它小的所有数字的数目。
 * 以数组形式返回答案。
 */
public class Test22_smallNum {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] temp = new int[nums.length];
        for(int i=0;i<temp.length;i++){
            temp[i] = 0;
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    temp[i]++;
                }
            }
        }

        return temp;
    }
}
