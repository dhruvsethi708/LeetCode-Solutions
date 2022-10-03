class Solution {
    public boolean isPerfectSquare(int num) {
        
        int start = 1;
        int end = num;
        int sqrt = start;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(mid <= num/mid){
                sqrt = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        if(sqrt*sqrt == num){
            return true;
        }
        else{
            return false;
        }
    }
}