class Solution {
    public int countPrimes(int n) {
        if(n ==0  || n == 1)return 0;
        boolean[] arr = new boolean[n];
        for(int i=2; i*i<=n; i++){
            if(arr[i] == false){
                for(int j=i*i; j<n; j+=i){
                    arr[j] = true;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n; i++){
            if(arr[i] == false){
                count += 1;
            }
        }
        return count;
    }
}


// ********************** Better Approach : ******************************** 
// public class Solution {
//     public int countPrimes(int n) {
//         boolean[] notPrime = new boolean[n];
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (notPrime[i] == false) {
//                 count++;
//                 for (int j = 2; i*j < n; j++) {
//                     notPrime[i*j] = true;
//                 }
//             }
//         }
        
//         return count;
//     }
// }
