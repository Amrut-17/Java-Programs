class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
//          ************* ONLU TWO ELEMENTS BECAUSE OF N/3 IE . IF N=10 THEN TO SATISFY CONDITION 10/3 = 3 > IE 4 ONLY TWO ELEM POSSIBLE !!!!! IMP ****
        int n1 = -1;
        int n2 = -1;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == n1){
                count1 += 1;
            }else if(nums[i] == n2){
                count2 += 1;
            }else if(count1 == 0){
                n1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                n2 = nums[i];
                count2 = 1;
            }else{
                count1 --;
                count2 --;
            }
        }
        
        List<Integer> arr = new ArrayList<>();
        count1 =0 ;
        count2 =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == n1){
                count1 += 1;
            }else if(nums[i] == n2){
                count2 += 1;
            }
        }
        if(count1 > (nums.length/3)){
            arr.add(n1);
        }
        if(count2 > (nums.length/3)){
            arr.add(n2);
        }
        return arr;
    }
}
