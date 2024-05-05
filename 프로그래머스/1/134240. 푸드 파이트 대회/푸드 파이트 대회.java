class Solution {
    public String solution(int[] food) {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
            if (food[i] <= 1) {
                continue;
            }
            int div = food[i] / 2;
            for (int j = 0; j < div; j++) {
                sb1.append(i);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb1);
        return sb1.append(0).append(sb2.reverse()).toString();
    }
}