import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();
        for (int i = 0; i < num1.length(); i++) {
            if (sb1.charAt(i) > sb2.charAt(i)) {
                System.out.print(Integer.valueOf(sb1.toString()));
                break;
            } else if (sb1.charAt(i) < sb2.charAt(i)) {
                System.out.print(Integer.valueOf(sb2.toString()));
                break;
            }
        }
    }
}