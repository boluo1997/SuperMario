package cn;

public class Test49_cui {
    public static void main(String[] args) {
        System.out.println(method("1010"));
    }

    public static int method(String str){

        int[] nums = new int[str.length()];

        for(int i=0;i<str.length();i++){
            nums[i] = Integer.parseInt( String.valueOf(str.charAt(i)));
        }

        int sum = 0;

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] !=0 && nums[i]*10 + nums[j] <= 26){
                    System.out.println(nums[i]*10 + nums[j]);
                    sum += 1;
                    break;
                }
            }
        }

        return sum;

    }

}

















