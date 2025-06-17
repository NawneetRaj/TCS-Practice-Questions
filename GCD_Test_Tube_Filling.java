// take tube A,B,C with capacities x,y,x+y. fill the tubes A and B etiher from the beaker or from test tube C. Your task is to determine, will he able to get z ml starch solution in test tube C or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = x, b = y;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        if (z <= x + y && z % a == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
