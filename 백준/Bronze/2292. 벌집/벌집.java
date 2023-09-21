import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int honey = 1;  // 현재 범위의 마지막 방(1, 7, 19 ...)
        int count = 1;  // 방 카운트
        int increase = 6;  // 지나야 하는 방의 수(6의 배수)

        while (num > honey) {
            honey += increase;
            increase += 6;
            count++;
        }

        System.out.println(count);
    }
}