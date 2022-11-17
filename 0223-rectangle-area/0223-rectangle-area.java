class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int ar1 = Math.abs(ax2-ax1)*Math.abs(ay2-ay1);
        int ar2 = Math.abs(bx2-bx1)*Math.abs(by2-by1);
        int ar3 = 0;
        
        int bottom = Math.max(ay1, by1);
        int high = Math.min(ay2, by2);
        int left = Math.max(ax1, bx1);
        int  right = Math.min(ax2, bx2);
        if(left < right && bottom < high){
            ar3 = Math.abs(high-bottom)*Math.abs(right-left);
        }
        


        return ar1 + ar2 - ar3;
    }
}