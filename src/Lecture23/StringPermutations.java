package Lecture23;

public class StringPermutations {
    public static void main(String[] args) {
        rec("abc","");
    }
    public static void rec(String ques, String ans){
        if (ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i)+ques.substring(i+1);
            rec(ros,ans+ch);
        }
    }
}
