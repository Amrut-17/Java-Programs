class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = maxInArray(candies);
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        return arr;
    }
    public static int maxInArray(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
