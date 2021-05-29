class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        rec(nums, 0, answer, arr);
        return answer;
    }
    public void rec(int[] nums, int i, List<List<Integer>> answer, List<Integer> temp){
        if(i == nums.length){
            answer.add(new ArrayList<Integer>(temp));
            return;
        }
        
        temp.add(nums[i]);
        rec(nums, i+1, answer, temp);
        
        temp.remove(temp.size()-1);
        rec(nums, i+1, answer, temp);
    }
}

//  Backtracking ..
