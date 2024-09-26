import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스의 갯수
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String s1 = String.valueOf(s.charAt(0));
            String s2 = String.valueOf(s.charAt(s.length() - 1));
            System.out.println(s1 + s2);
        }
    }
}