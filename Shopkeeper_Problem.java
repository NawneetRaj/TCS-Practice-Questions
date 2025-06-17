//Shopkeaper start shop with rs 0, he accepet money only 30,60,120 and in the shop every item is for 30 rs. Take n size of array and check the transaction is successs or not

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int r = 0; 
        boolean success = true;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 30) {
                r = arr[i];
            } 
            else if (arr[i] == 60) {
                if (r >= 30) {
                    r += 30;
                } else {
                    success = false;
                }
            } 
            else if (arr[i] == 120) {
                if (r >= 90) {
                    r += 30;
                } else {
                    success = false;
                }
            }
        }
        if (success) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Transaction Unsuccessful");
        }
    }
}
