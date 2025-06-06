package Lecture19;

public class Temp {
    public static void main(String[] args) {
        System.out.println(rec(3,3));
    }
    public static int rec(int n, int m){
        if (m==0){
            return 1;
        }
        int ans = rec(n,m-1);
        return n*ans;
    }
}
