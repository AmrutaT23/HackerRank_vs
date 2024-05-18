// Java Loops II

import java.util.*;

public class hack1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                a = a + b;
                System.out.print(a + " ");
                b = b * 2;
            }
            System.out.println();
        }
    }

}
