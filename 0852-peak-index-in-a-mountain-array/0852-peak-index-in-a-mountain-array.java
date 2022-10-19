class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int n = arr.length;
        int st = 1;
        int end = n-2;
        int ans = 0;
        
        while(st<=end){
            int mid = (st+end)/2;
            
            if(arr[mid]>=arr[mid+1] && arr[mid]>=arr[mid-1]){
                ans = mid;
                break;
            }else if(arr[mid]<arr[mid+1]){
                st = mid+1;
            }else if(arr[mid]<arr[mid-1]){
                end = mid-1;
            }
        }
        
        return ans;
    }
}