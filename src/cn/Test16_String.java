package cn;

//最长公共前缀

public class Test16_String {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {

        if(strs == null){return null;}
        if(strs.length == 0){return "";}

        String ans = strs[0];

        for(int i=1;i<strs.length;i++){

            int j;
            for(j=0;j<ans.length() && j<strs[i].length();j++){
                if(ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }

            ans = ans.substring(0,j);

        }

        return ans;

    }
}


