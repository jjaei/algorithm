import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < my_string.length(); j++) {
                sb.append(my_string.charAt(j));
            }
            list.add(sb.toString());
        }
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).equals(is_suffix)) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}