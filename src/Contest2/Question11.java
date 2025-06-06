package Contest2;

public class Question11 {
    public static void main(String[] args) {
        int n = 4545;
        int ans = 0;
        int place = 1;
        while (n>0){
            int rem = n%10;
            ans = ans+(9-rem)*place;
            place*=10;
            n = n/10;
        }
//        if (ans>n){
//            while (copy>0){
//                int rem = copy%10;
//
//                place*=10;
//                copy = copy/10;
//            }
//        }
    }
}
