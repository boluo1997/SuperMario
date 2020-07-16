package cn;

public class Test49_cui {
    public static void main(String[] args) {
        System.out.println(method("2 2 6 7 9 7 8 9 4 5 3 4 5 6"));
    }

    public static int method(String str){

        int[] nums = new int[str.length()];

        for(int i=0;i<str.length();i++){
            nums[i] = Integer.parseInt( String.valueOf(str.charAt(i)));
        }

        int sum = 1;        //先把个位的数量加上

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]*10 + nums[j] <= 26){
                    sum += 1;
                    break;
                }
            }
        }

        return sum;

    }

}

















