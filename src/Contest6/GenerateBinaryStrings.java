package Contest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            String s = sc.next();
            ArrayList<String> list = new ArrayList<>();
            rec(s,"",0,list);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
            t--;
        }
    }
    public static void rec(String ques, String ans, int i, ArrayList<String> list){
        if (i==ques.length()){
            list.add(ans);
            return;
        }
        if (ques.charAt(i)=='?'){
            rec(ques,ans+'1',i+1,list);
            rec(ques,ans+'0',i+1,list);
        }else {
            char ch = ques.charAt(i);
            rec(ques,ans+ch,i+1,list);
        }
    }
}
