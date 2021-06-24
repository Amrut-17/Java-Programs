class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recursion(0, candidates, arr, temp, target);
        return arr;
    }
    
    public static void recursion(int i, int[] candidates, List<List<Integer>> arr, List<Integer> temp, int target){
        if(i == candidates.length ){
            if(target == 0){
                arr.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[i] <= target){
            temp.add(candidates[i]);
            recursion(i, candidates, arr, temp, target-candidates[i]);
            temp.remove(temp.size()-1);
        }
        recursion(i+1, candidates, arr, temp, target);
    }
}
