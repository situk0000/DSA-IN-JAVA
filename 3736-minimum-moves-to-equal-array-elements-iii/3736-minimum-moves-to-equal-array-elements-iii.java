class Solution {
    public int minMoves(int[] nums) {
      int max = Integer.MIN_VALUE;
      for(int x:nums)  {
        if(x>max){
           max = x;
        }
      }

      long moves = 0;
      for(int x:nums){
        moves+=max-x;
              }

              return (int) moves;
    }
}

/*Interview tip: Dono problems ka difference yaad rakhna:
- LeetCode 453: One move increases n-1 elements → Find minimum.
- Single-element increment: One move increases one element → Find maximum.*/