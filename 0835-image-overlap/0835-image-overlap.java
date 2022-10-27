class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < img1.length; i++)
            for (int j = 0; j < img1.length; j++) {
                if (img1[i][j] == 1) list1.add(i * 100 + j);
                if (img2[i][j] == 1) list2.add(i * 100 + j);
            }

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : list1) {
            for (int j : list2) {
                map.put(i - j, map.getOrDefault(i - j, 0) + 1);
            }
        }

        int res = 0;
        for (int value: map.values()) res = Math.max(res, value);
        return res;
    }
}