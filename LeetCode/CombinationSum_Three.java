class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recursion(1, ans, temp, n, k);
        return ans;
    }
    
    public static void recursion(int i, List<List<Integer>> ans, List<Integer> temp, int n, int k){
        if(n == 0 && temp.size() == k ){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int pt=i; pt<=9; pt++){
            temp.add(pt);
		    recursion(pt+1, ans, temp, n-pt, k);
		    temp.remove(temp.size() - 1);
        }
    }
}
