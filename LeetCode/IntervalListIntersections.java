class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> arr = new ArrayList<>();
        
        int pt1 = 0;
        int pt2 = 0;
        
        while(pt1 < firstList.length && pt2 < secondList.length){
            int commonStart = Math.max(firstList[pt1][0], secondList[pt2][0]);
            int commonEnd = Math.min(firstList[pt1][1], secondList[pt2][1]);
            
            if(commonStart <= commonEnd){
                int[] twoPoints = {commonStart, commonEnd};
                arr.add(twoPoints);
            }
            
            if(firstList[pt1][1] <  secondList[pt2][1] ){
                pt1 += 1;
            }else{
                pt2 += 1;
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
