//Take two String a and b and compare if both string is not equal print -1 else find in how many moves it convert string a to b.

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.length() != b.length()) {
            System.out.println("-1");
            return;
        }
        
        int moves = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                moves++;
            }
        }
        System.out.println("Maximum number of moves: " + moves);
    }
}
