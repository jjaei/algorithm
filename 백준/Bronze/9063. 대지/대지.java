import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minX = 10000;
        int minY = 10000;
        int maxX = -10000;
        int maxY = -10000;

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}