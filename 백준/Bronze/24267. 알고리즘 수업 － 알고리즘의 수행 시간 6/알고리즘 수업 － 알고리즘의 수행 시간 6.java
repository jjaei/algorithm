import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(n * (n - 2) * (n - 1) / 6);
        System.out.println(3);
    }
}