class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(validate(position, mid, m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return ans;
    }
    
    public boolean validate(int position[], int x, int count){
        
        int prev=position[0];
        count--;
        for(int i=1;i<position.length;i++){
            if(position[i]-prev >=x){
                count--;
                if(count==0){
                    return true;
                }
                prev=position[i];
            }
        }
        
        return count==0;
    }
}