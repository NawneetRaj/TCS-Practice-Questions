//Take hour and minutes as input and calculate total working minutes and also calculate total minutes for 24 hourse.print remaining hour and minutes. tatal minutes - total working minutes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int min = sc.nextInt();

        int totalMinutes = 24 * 60;
        int usedMinutes = hr * 60 + min;
        int remainingMinutes = totalMinutes - usedMinutes;

        int finalHr = remainingMinutes / 60;
        int finalMin = remainingMinutes % 60;

        System.out.printf("%02d:%02d\n", finalHr, Math.abs(finalMin));
    }
}
