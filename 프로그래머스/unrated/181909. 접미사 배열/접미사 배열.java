import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < my_string.length(); j++) {
                sb.append(my_string.charAt(j));
            }
            list.add(sb.toString());
        }
        String[] answer = list.stream().sorted().toArray(String[]::new);
        return answer;
    }
}