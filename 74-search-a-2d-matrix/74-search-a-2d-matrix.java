class Solution {
    
    public static boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
}
    
    
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
        
        int row = 0;
        
        while((row<matrix.length-1) && (matrix[row][matrix[0].length-1]<target)){
            row++;
        }
        
       if(row>matrix.length){
             return false;
        }
        
        return binarySearch(matrix[row], target);
        
    }
    
}

