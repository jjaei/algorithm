import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] cArr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            cArr[i] = str.charAt(i);
        }

        for (int j = 0; j < cArr.length; j++) {
            if (cArr[j] >= 97 && cArr[j] <= 123) {
                cArr[j] = (char)(cArr[j] - 32);
            } else {
                cArr[j] = (char)(cArr[j] + 32);
            }
            System.out.print(cArr[j]);
        }
    }
}