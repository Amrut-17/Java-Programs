class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        
            for(String st : dictionary){
                if(isSubSeq(s, st)){
                    return st;
                }
            }
        return "";
    }
    
    public static boolean isSubSeq(String s, String st){
        int i=0; int j=0;
        while((i < s.length() ) && (j < st.length()) ){
            if(s.charAt(i) == st.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j >= st.length()){return true;}
        else{
            return false;
        }
    }
}
