class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
     Stack<Character> st = new Stack<>();
   
    for(int i = 0;i<n;i++){

   char cur = num.charAt(i);
   while(!st.isEmpty()&&k>0&&st.peek()>cur){
    st.pop();
    k--;
   }
   st.push(cur);
    }

     // Agar k abhi bhi bacha hai
        while (k > 0) {
            st.pop();
            k--;
        }

        if(st.isEmpty()){
            return "0";
        }

        StringBuilder ans = new StringBuilder();
while(!st.isEmpty()){
    ans.append(st.pop());

}

ans.reverse();

int i = 0;
while(i<ans.length()-1 && ans.charAt(i)=='0'){
    i++;
}
return ans.substring(i);

    }
}