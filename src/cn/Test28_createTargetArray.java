package cn;

import java.util.ArrayList;

public class Test28_createTargetArray {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        //因为数组在不断变化,所以新建一个列表list,作为存储不断变化的"数组"

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }

        int[] target = new int[nums.length];

        for(int i=0;i<list.size();i++){
            target[i] = list.get(i);
        }


        return target;
    }
}
