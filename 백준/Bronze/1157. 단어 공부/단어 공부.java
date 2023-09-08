import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // 문자열을 대문자로 변환
        int[] arr = new int[26];

        sc.close();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-65] += 1;
        }

        int max = 0;
        char c = '?';
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                c =(char)(j + 65);
            } else if (arr[j] == max) {
                c = '?';
            }
        }
        System.out.print(c);
    }
}