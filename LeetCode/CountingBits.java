class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1; i<=n; i++){
            if((i & 1 ) != 1){
                arr[i] = arr[i>>1];
            }else{
                arr[i] = arr[i>>1] + 1;
            }
        }
        return arr;
    }
}
