package Lecture21;

public class Subsequence {
    public static void main(String[] args) {
        String s = "ab";
        subseq(s,"");
    }
    public static void subseq(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);

        subseq(ques.substring(1),ans+ch);  //inclusion
        subseq(ques.substring(1),ans);  //exclusion
    }
}
