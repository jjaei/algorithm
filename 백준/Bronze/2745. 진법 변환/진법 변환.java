import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int num = sc.nextInt();

        sc.close();

        System.out.println(Integer.valueOf(b, num));

    }
}