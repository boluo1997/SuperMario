package cn;

/**
 *  给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
 *  如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 */
public class Test21_to_zero {
    public static void main(String[] args) {

    }

    public int numberOfSteps (int num) {

        int count = 0;
        while(num != 0){
            if(num%2 == 0){
                num = num/2;
                count++;

            }else {
                num = num - 1;
                count++;

            }
        }

        return count;
    }
}
















