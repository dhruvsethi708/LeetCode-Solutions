class Solution {
    public int maximalRectangle(char[][] matrix) {
        int areamax = 0;
        int[] arr = new int[matrix[0].length];
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                
                if(matrix[i][j] == '1'){
                    arr[j]++;
                }else{
                    arr[j] = 0;
                }
            }
            
            int area = largestRectangleArea(arr);
            areamax = Math.max(areamax, area);
        }
        
        return areamax;
    }
    
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