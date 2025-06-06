package Lecture4;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Not Prime");

        }else {
            System.out.println("Prime");
        }
    }
}
