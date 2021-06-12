class Solution {
    public boolean isUgly(int n) {
        if (n == 1) return true;
       for(int i=2; i<6 && n > 0 ; i++){
           while(n%i == 0){
               if(n/i == 1){
                   return true;
               } n /= i;
           }
       }
        return false;
        
    }
}
