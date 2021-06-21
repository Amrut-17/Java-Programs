class Solution {
    public String getPermutation(int n, int k) {
        int ans = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<n; i++){
            ans *= i;
            arr.add(i);
        }
        arr.add(n);
        k = k-1;
        String str ="";
        while(true){
            str += arr.get(k/ans);
            arr.remove(k/ans);
            if(arr.size() == 0){
                break;
            }
            k = k%ans;
            ans = ans/arr.size();
        }
        return str;
    }
}
