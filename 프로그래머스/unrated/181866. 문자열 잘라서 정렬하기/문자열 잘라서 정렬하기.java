import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] str = myString.trim().split("x");
        Arrays.sort(str);

        for (String s : str) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        return list.stream().toArray(String[]::new);
    }
}