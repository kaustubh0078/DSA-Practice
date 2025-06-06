package Lecture7;

public class Inverse {
    public static void main(String[] args) {
        int n = 32145;
        int ans = 0;
        int place = 1;
        while (n>0){
            int rem = n%10;
            ans = ans+ (int)(place*Math.pow(10,rem-1));
            n = n/10;
            place++;
        }
        System.out.println(ans);
    }
}
