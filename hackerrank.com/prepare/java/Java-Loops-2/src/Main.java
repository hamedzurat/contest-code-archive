import java.util.*;
import java.io.*;
import java.lang.Math;

class Main {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int z = 0; z < t; z++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int i = 0; i < n; i++) {
                int sum = a;

                for (int j = 0; j <= i; j++)
                    sum += ((int) Math.pow(2, j) * b);

                System.out.printf("%d ", sum);
            }

            System.out.println();
        }

        in.close();
    }
}
