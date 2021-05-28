class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);
        return result;
    }
    
    public int firstIndex(int[] arr, int target){
        int index = -1;
        int low =0; 
        int high = arr.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= target){ // Here Need to cross boundries ..... otherwist in simple binary its arr[mid] >targer i.e strictly greater than
                high = mid -1;
            }else{
                low  = mid+1;
            }
            
            if(arr[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    
    public int lastIndex(int[] arr, int target){
        int index =-1;
        int low =0; int high = arr.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] <= target){ // Here Need to cross boundries ..... otherwist in simple binary its arr[mid] < targer i.e strictly less than 
                low = mid +1;
            }else{
                high  = mid-1;
            }
            
            if(arr[mid] == target){
                index = mid;
            }
        }
        return index;
    }
}
