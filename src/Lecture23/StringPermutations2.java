package Lecture23;

public class StringPermutations2 {
    public static void main(String[] args) {
        rec("aba","");
    }
    public static void rec(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        boolean visited[] = new boolean[26];
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (visited[ch-'a']==false){
                visited[ch-'a']= true;
                String ros = ques.substring(0,i)+ques.substring(i+1);
                rec(ros,ans+ch);
            }
        }
    }
}
