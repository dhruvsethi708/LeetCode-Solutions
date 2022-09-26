class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxarea = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i<=n; i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])){
                int h = heights[st.peek()];
                st.pop();
                
                int width = 0;
                
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }
                
                maxarea = Math.max(maxarea, h*width);
            }
            
            st.push(i);
        }
        
        return maxarea;
    }
}