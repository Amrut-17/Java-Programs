class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        rec(answer, temp, nums);
        return answer;
    }
    
     public static void rec(List<List<Integer>> answer, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            answer.add(new ArrayList<>(temp));
        }
        
        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            rec(answer, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}
