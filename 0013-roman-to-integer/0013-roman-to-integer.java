class Solution {
    public int romanToInt(String s) {
        
        int ans = 0;
        
        for(int i = s.length()-1; i>=0; i--){
            
            if(i-1>=0 && s.charAt(i)=='V' && s.charAt(i-1)=='I'){
                ans+=4;
                i--;
                continue;
            }
            else if(i-1>=0 && s.charAt(i)=='X' && s.charAt(i-1)=='I'){
                ans+=9;
                i--;
                continue;
            }
            else if(i-1>=0 && s.charAt(i)=='L' && s.charAt(i-1)=='X'){
                ans+=40;
                i--;
                continue;
            }
            else if(i-1>=0 && s.charAt(i)=='C' && s.charAt(i-1)=='X'){
                ans+=90;
                i--;
                continue;
            }
            else if(i-1>=0 && s.charAt(i)=='D' && s.charAt(i-1)=='C'){
                ans+=400;
                i--;
                continue;
            }
            else if(i-1>=0 && s.charAt(i)=='M' && s.charAt(i-1)=='C'){
                ans+=900;
                i--;
                continue;
            }
            
            
            if(i>=0){
                
                if(s.charAt(i)=='I'){
                    ans+=1;
                }else if(s.charAt(i)=='V'){
                    ans+=5;
                }else if(s.charAt(i)=='X'){
                    ans+=10;
                }else if(s.charAt(i)=='L'){
                    ans+=50;
                }else if(s.charAt(i)=='C'){
                    ans+=100;
                }else if(s.charAt(i)=='D'){
                    ans+=500;
                }else if(s.charAt(i)=='M'){
                    ans+=1000;
                }
            }
        }
        
        return ans;
    }
}