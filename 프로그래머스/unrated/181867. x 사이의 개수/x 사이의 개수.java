import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int index = 0;

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                list.add(index);
                index = 0;
            } else {
                index++;
            }
        }
        list.add(index);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}