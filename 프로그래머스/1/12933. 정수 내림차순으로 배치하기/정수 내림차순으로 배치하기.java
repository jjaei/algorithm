import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        String longNum = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            longNum += arr[i];
        }
        return Long.valueOf(longNum);
    }
}