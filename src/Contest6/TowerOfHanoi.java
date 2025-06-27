package Contest6;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n,'A','B','C');
    }
    public static void rec(int n, char from, char to, char aux){
        if (n==1){
            System.out.println("Moving ring 1 from "+from+" to "+to);
            return;
        }
        rec(n-1, from, aux, to);
        System.out.println("Moving ring "+n+" from "+from+" to "+to);
        rec(n-1,aux,to,from);
    }
}
