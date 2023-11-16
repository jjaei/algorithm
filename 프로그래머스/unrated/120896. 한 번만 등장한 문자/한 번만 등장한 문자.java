import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) + "", map.getOrDefault(s.charAt(i) + "", 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> map2 : map.entrySet()) {
            if (map2.getValue() == 1) {
                list.add(map2.getKey());
            }
        }
        Collections.sort(list);
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}