class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        int n = timePoints.size();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            int hour = Integer.valueOf(timePoints.get(i).substring(0,2));
            int min = Integer.valueOf(timePoints.get(i).substring(3,5));

            arr[i] = 60*hour + min;
        }
        
        Arrays.sort(arr);
        
        int min = 24*60 + arr[0] - arr[n-1];
        
        for(int j = 1; j<n; j++){
            min = Math.min(min, arr[j] - arr[j-1]);
        }
        
        return min;
            
    }
}