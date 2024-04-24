import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> hash = new HashSet<>();
        for (int i : nums) {
            hash.add(i);
        }
        return hash.size() > max ? max : hash.size();
    }
}