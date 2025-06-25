package Contest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DictionaryOrderLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> list = new ArrayList<>();
        rec(s,"",s,list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void rec(String ques, String ans, String original, List<String> list){
        if (ques.length()==0){
            if (lexi(ans,original)){
                list.add(ans);
            }
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            rec(ques.substring(0,i)+ques.substring(i+1),ans+ch,original,list);
        }
    }
    public static boolean lexi(String s, String t){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)-'a'>t.charAt(i)-'a'){
                return true;
            }else if (s.charAt(i)-'a'<t.charAt(i)-'a'){
                return false;
            }
        }
        return false;
    }
}
