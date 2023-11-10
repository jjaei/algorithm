import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int length = 1;
        while (length < arrLength) {
            length *= 2;
        }
        int[] answer = new int[length];
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        for (int i = 0; i < length - arr.length; i++) {
            list.add(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}