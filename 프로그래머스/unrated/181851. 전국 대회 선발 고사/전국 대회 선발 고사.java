import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == a) {
                answer += (10000 * i);
            } else if (rank[i] == b) {
                answer += (100 * i);
            } else if (rank[i] == c) {
                answer += i;
            }
        }
        return answer;
    }
}