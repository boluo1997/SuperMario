package cn;

import java.util.ArrayList;

public class Test29_decompressRLElist {
    public static void main(String[] args) {

        System.out.println(Math.round(-3.0));

    }

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length/2;i++){
            for(int j=0;j<nums[2*i];j++){
                list.add(nums[2*i+1]);
            }
        }

        int[] target = new int[list.size()];
        for(int j=0;j<target.length;j++){
            target[j] = list.get(j);
        }

        return target;
    }

}

























