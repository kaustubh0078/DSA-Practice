package Lecture26;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rec(arr,0,0);
    }
    public static void rec(int[][] arr, int row, int col){
        if (col==9){
            col=0;
            row++;
        }
        if (row==9){
            display(arr);
            return;
        }
        if (arr[row][col]!=0){
            rec(arr,row,col+1);
        }else {
            for (int val = 1; val <= 9; val++) {
                if (isValid(arr,row,col,val)){
                    arr[row][col] = val;
                    rec(arr,row,col+1);
                    arr[row][col] = 0; //backtrack
                }
            }
        }
    }
    public static void display(int[][] arr){
        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static boolean isValid(int[][] arr, int row, int col, int val){
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i]==val){
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col]==val){
                return false;
            }
        }
        //3x3 grid
        int r = row - row%3;
        int c = col - col%3;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if (arr[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
}
