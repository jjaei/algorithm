import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int k = i + 1; k < str_list.length; k++) {
                    list.add(str_list[k]);
                }
                break;
            }
        }
        return list.stream().toArray(String[]::new);
    }
}