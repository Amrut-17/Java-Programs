// LEETCODE : 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left =0;
        int right = 0;
        int size = s.length();
        int maxLength = 0;
        while(right < size){
            
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right-left+1);
            right += 1;
        }
        return maxLength;
    }
}
