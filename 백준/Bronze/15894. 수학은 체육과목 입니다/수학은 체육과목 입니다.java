import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long square = sc.nextLong();
        Long result = square * 4;

        System.out.println(result);
    }
}