import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            str += my_string.charAt(i);
            list.add(str);
            System.out.println(list);
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).equals(is_prefix)) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}