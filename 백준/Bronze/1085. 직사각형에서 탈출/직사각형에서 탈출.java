import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 위치
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 오른쪽 위 꼭짓점
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = Math.min(x - 0, Math.abs(x - w));
        int minY = Math.min(y - 0, Math.abs(y - h));

        int distance = Math.min(minX, minY);

        System.out.println(distance);
    }
}