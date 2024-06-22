class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] reverseSizes = new int[sizes.length][2];
        int tmp = 0;
        int w = 0;
        int h = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            for (int j = 0; j < sizes[i].length; j++) {
                w = Math.max(w, sizes[i][0]);
                h = Math.max(h, sizes[i][1]);
            }
        }
        return w * h;
    }
}