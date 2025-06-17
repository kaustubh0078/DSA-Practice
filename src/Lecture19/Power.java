package Lecture19;

public class Power {
    public static void main(String[] args) {
        int ans = power(3,4);
        System.out.println(ans);
    }
    public static int power(int a, int b){
        if (b==1){
            return a;
        }
        int t = power(a,b-1);
        return a*t;
    }
}
