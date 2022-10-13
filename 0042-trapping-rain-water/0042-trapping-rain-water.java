class Solution {
    public int trap(int[] height) {
        
        Stack<Integer> st = new Stack<>();
        
        int ans = 0;
        
        for(int i = 0; i<height.length; i++){
            while(st.size()>0 && height[st.peek()]<=height[i]){
                int rimax = i;
                int curr = height[st.pop()];
                if(st.isEmpty()) break;
                
                int leftmax = st.peek();
                
                int width = rimax - leftmax - 1;
                
                ans += (Math.min(height[leftmax], height[rimax]) - curr)*width;
            }
            
            st.push(i);
        }
        
        return ans;
    }
}