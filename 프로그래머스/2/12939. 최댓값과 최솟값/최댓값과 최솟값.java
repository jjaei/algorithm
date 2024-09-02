import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(strArr[i]);
        }
        Arrays.sort(arr);
        return arr[0] + " " + arr[arr.length - 1];
    }
}