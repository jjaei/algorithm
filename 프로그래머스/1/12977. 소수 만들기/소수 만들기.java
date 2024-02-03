import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i != j && j != k) {
                        list.add(nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        if (list.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            boolean check = true;
            for (int j = 2; j < list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }
}