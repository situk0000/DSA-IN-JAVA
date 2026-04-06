class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); //LIFO
        for(char ch : s.toCharArray()){
            //opening brackets 
            if(ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            } else{
                if(stack.isEmpty()) return false;

               char top = stack.pop();
               //check matching
               if( (ch == ')' && top != '(' )|| ( ch == '}' && top != '{') || (ch == ']' && top != '[')){
               return false;
               }
            }
        }
    

     // stack empty hona chahiye
        return stack.isEmpty();
}
}

/*🎯 Core rule:

👉 Har closing bracket ko check karna hai
👉 Aur end me stack empty hona chahiye

✅ Correct logic kya hona chahiye?

👉 Match hone par:

// kuch mat karo, continue karo

👉 Mismatch hone par:

return false;
🔥 Correct pattern:
if((ch == ')' && top != '(') ||
   (ch == '}' && top != '{') ||
   (ch == ']' && top != '[')) {
    return false;
}

👉 Aur loop ke baad:

return stack.isEmpty();
⚡ Simple line me samajh lo:

👉 “Ek match se valid nahi hota, sab match hone chahiye” */