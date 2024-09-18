import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        int sum = (h * 60) + m + time;

        int hour = sum / 60;
        int minute = sum % 60;

        if (hour > 23) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}