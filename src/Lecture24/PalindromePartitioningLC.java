package Lecture24;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningLC {
    static List<List<String>> list = new ArrayList<>();
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        rec("nitin",ans);
    }
    public static void rec(String ques, List<String> ans){
        if (ques.length()==0){
            List<String> temp = new ArrayList<>(ans);
            list.add(temp);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String left = ques.substring(0,i);
            if (isPalindrome(left)){
                ans.add(left);
                rec(ques.substring(i),ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
