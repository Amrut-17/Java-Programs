class Solution {
    public int candy(int[] ratings) {
        int[] arr1 = new int[ratings.length];
        int[] arr2 = new int[ratings.length];
        int[] arrFinal = new int[ratings.length];
        
        for(int i=0; i<ratings.length; i++){
            arr1[i] = 1;
            arr2[i] = 1;
        }
        
        for(int i=1; i<ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                arr1[i] = arr1[i-1] + 1;
            }
        }
        
        for(int i=ratings.length-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                arr2[i] = arr2[i+1] + 1;
            }
        }
        int sum = 0;
        for(int i=0; i<ratings.length; i++){
            arrFinal[i] = Math.max(arr1[i], arr2[i]);
            sum += arrFinal[i];
        }
        return sum;
        
    }
}
