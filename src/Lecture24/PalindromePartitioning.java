package Lecture24;

public class PalindromePartitioning {
    public static void main(String[] args) {
        rec("nitin","");
    }
    public static void rec(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String left = ques.substring(0,i);
            if (isPalindrome(left)){
                rec(ques.substring(i),ans+left+" | ");
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
