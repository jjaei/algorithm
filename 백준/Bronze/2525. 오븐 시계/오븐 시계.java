import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 현재 시각 - 시
        int b = sc.nextInt();  // 현재 시각 - 분
        int c = sc.nextInt();  // 요리하는데 필요한 시간 - 분

        int sum = (a * 60) + b + c;
        int hour = sum / 60 % 24;
        int minute = sum % 60;

        System.out.println(hour + " " + minute);
    }
}