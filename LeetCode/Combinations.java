class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        recursion(1, ans, arr, n, k);
        return ans;
    }
    public static void recursion(int idx, List<List<Integer>>ans, List<Integer>arr, int n, int k){
        if( k == 0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=idx; i<=n; i++){
            arr.add(i);
            recursion(i+1, ans, arr, n, k-1);
            arr.remove(arr.size()-1);
        }
    }
}
