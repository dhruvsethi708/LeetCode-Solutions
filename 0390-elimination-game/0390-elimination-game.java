class Solution {
    public int lastRemaining(int n) {
        
//         At first difference between two consecutive number is 1, then it becomes 2, then it become 4. For E.g:
// 1,2,3,4,5,6,7,8,9,10,11,12,13,14
// Here, difference between two consecutive number is 1. Now we  eliminate and we are left with
// 2,4,6,8,10,12,14
        
        int head = 1;
        int remain = n;
        boolean left = true;
        int step = 1;
        
        while(remain>1){
            if(left || remain%2==1){
                head = head + step;
            }
            
            remain = remain/2;
            step = step*2;
            left = !left;
        }
        
        return head;
    }
}