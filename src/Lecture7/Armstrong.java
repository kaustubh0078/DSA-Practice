package Lecture7;

public class Armstrong {
    public static void main(String[] args) {
        int n = 371;
        int original = n;
        int ans = 0;
        int place = noOfDigits(n);
        while (n>0){
            int rem = n%10;
            ans = ans+(int)Math.pow(rem,place);
            n = n/10;
        }

        if (original==ans){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
    public static int noOfDigits(int n){
        int place = 0;
        while (n>0){
            n = n/10;
            place++;
        }
        return place;
    }
}
