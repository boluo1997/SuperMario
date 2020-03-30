package cn;

import java.util.HashSet;
import java.util.Set;

public class Test27_numJewelsInStones {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String J, String S) {
        //遍历每块石头,检查是不是宝石,检查的步骤用哈希集合
        Set<Character> Jset = new HashSet<>();

        //遍历每块石头
        for(char c : J.toCharArray()){
            Jset.add(c);
        }

        int count = 0;
        //检查它是不是宝石
        for(char s : S.toCharArray()){
            if(Jset.contains(s)){   //如果Jset中包含s(宝石),宝石数量就+1
                count++;
            }
        }

        return count;
    }

}
