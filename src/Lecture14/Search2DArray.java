package Lecture14;

public class Search2DArray {
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3,10},
                {4,5,6,11},
                {7,8,9,12}
        };

        int ans  = Search(arr,9);
        System.out.println(ans);
    }
    public static int Search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return 1;
                }
            }
        }
        return 0;
    }
}
