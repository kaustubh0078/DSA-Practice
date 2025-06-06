package Contest3;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t>0){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] rickshaw = new int[n];
            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = sc.nextInt();
            }

            int[] cab = new int[m];
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt();
            }
            System.out.println(result(c1,c2,c3,c4,rickshaw,cab));
            t--;
        }
    }

    public static int result(int c1, int c2, int c3, int c4, int[] rick, int[] cab){

        int sum1 = 0;
        int min1[] = new int[rick.length];
        for (int i = 0; i < rick.length; i++) {
            min1[i] = Math.min(rick[i]*c1,c2);
        }
        for (int i = 0; i < min1.length; i++) {
            sum1+=min1[i];
        }
        int ans1 = Math.min(sum1,c3);

        int min2[] = new int[cab.length];
        int sum2 = 0;
        for (int i = 0; i < cab.length; i++) {
            min2[i] = Math.min(cab[i]*c1,c2);
        }
        for (int i = 0; i < min2.length; i++) {
            sum2+=min2[i];
        }
        int ans2 = Math.min(sum2,c3);

        int result = Math.min(ans1+ans2,c4);
        return result;
    }
}
