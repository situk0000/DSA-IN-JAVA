class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result , "" , 0,0,n);
        return result;
    }
    private void backtrack( List<String>result , String curr , int opencount , int closecount , int n ){
        //base class
        if(opencount==n && closecount==n){
            result.add(curr);
            return;
        }
        if(opencount<n){
            backtrack(result , curr + "(",opencount+1,closecount , n);
        }

         if(closecount<opencount){
            backtrack(result , curr + ")",opencount,closecount+1 , n);
        }
    }
}