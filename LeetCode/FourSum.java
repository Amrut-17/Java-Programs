class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
		int len = nums.length;
        
        for(int i=0; i<nums.length; i++){
        	for(int j=i+1; j<nums.length; j++){
        		int newTarget = target - nums[i] - nums[j];
        		int left = j+1;
        		int right = nums.length-1;
        		while(left < right){
        			int sum = nums[left] + nums[right];
        			
        			if(sum > newTarget){
        				right -= 1;
        			}else if(sum < newTarget){
        				left += 1;
        			}else{
        				List<Integer> temp = new ArrayList<>();
        				temp.add(nums[i]);
        				temp.add(nums[j]);
        				temp.add(nums[left]);
        				temp.add(nums[right]);
        				list.add(temp);

        				while(left < right && nums[left] == temp.get(2)) {
        					++left;
        				}
        				while(left < right && nums[right] == temp.get(3)){
        					-- right;
        				}
        			}
        		}
        		while(j+1 < nums.length && nums[j+1] == nums[j]){
        			++j;
        		}
        	}
        	while(i+1<nums.length && nums[i+1] == nums[i]){
        		++i;
        	}
        }
        return list;
    }
}
