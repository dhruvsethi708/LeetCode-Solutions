class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix[0].length-1;
        
        while(high>=0 && low<matrix.length){
            if(target==matrix[low][high]){
                return true;
            }else if(target<matrix[low][high]){
                high--;
            }else{
                low++;
            }
        }
        return false;
    }
}