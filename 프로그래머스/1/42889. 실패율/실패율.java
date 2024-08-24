import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] noClearUser = new double[N];
        double[] reachUser = new double[N];
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i+1) {
                    noClearUser[i]++;
                }
                if (stages[j] >= i+1) {
                    reachUser[i]++;
                }
            }

            if (noClearUser[i] == 0.0 || reachUser[i] == 0.0) {
                map.put(i+1, 0.0);
            } else {
                map.put(i+1, noClearUser[i] / reachUser[i]);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((a, b) -> map.get(b).compareTo(map.get(a)));
        for (int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}