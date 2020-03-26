package cn;

//找出数组中只出现了一次的元素

public class Test20_Single_Number {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        boolean[] br = new boolean[nums.length];

        for(int i=0;i<br.length;i++){
            if(!br[i]){     //如果br[i]为false
                for(int j=i+1;j<br.length;j++){
                    if(nums[i] == nums[j]){
                        br[i] = true;
                        br[j] = true;
                        break;
                    }
                }
            }
        }

        int x = 0 ;
        for(int i=0;i<br.length;i++){
            if(!br[i]){
                x = nums[i];
            }
        }
        return x;
    }

}
