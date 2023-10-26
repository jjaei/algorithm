import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                if (sb.length() > 0) {
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(myStr.charAt(i));
            }
        }
        if (sb.length() > 0) {
            answer.add(sb.toString());
        }
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        return answer.stream().toArray(String[]::new);
    }
}