class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        recursion(0, arr, temp, candidates, target);
        return arr;
    }
    
    public static void recursion(int i, List<List<Integer>> arr, List<Integer> temp, int[] array, int target){
        if(target == 0){
            arr.add(new ArrayList<>(temp));
            return ;
        }
        
        for(int pt=i; pt<array.length; pt++){
            if(pt > i && array[pt] == array[pt-1]){
                continue;
            }
            if(array[pt] > target){
                break;
            }
            temp.add(array[pt]);
            recursion(pt+1, arr, temp, array, target-array[pt]);
            temp.remove(temp.size()-1);
        }
    }
}

