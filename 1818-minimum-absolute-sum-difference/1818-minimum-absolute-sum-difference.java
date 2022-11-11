class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int[] arr = new int[n];
        int Mod = (int)Math.pow(10,9)+7;
        
        for(int i = 0; i<n; i++){
            arr[i] = nums1[i];
        }
        
        Arrays.sort(arr);
        
        long maxsave = 0;
        long res = 0;
        
        for(int i = 0; i<n; i++){
            int diff = Math.abs(nums1[i]-nums2[i]);
            maxsave = Math.max(maxsave, diff-findclosest(arr, nums2[i]));
            res = res + diff;
        }
    
        return (int)((res-maxsave)%Mod);
    }

    int findclosest(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int ans = 0;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=key){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }    
        }
        
        if(ans!=arr.length-1){
            return Math.min(Math.abs(key-arr[ans]), Math.abs(arr[ans+1]-key));
        }else{
            return Math.abs(key-arr[ans]);
        }
    }
    
    
}