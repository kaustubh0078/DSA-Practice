package Lecture21;

public class SubsequenceCount {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subseq(s,""));;
    }
    public static int subseq(String ques, String ans){
        if (ques.length()==0){
            return 1;
        }
        char ch = ques.charAt(0);

        int inc = subseq(ques.substring(1),ans+ch);  //inclusion
        int exc = subseq(ques.substring(1),ans);  //exclusion

        return inc+exc;
    }
}
