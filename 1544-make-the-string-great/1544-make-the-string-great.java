class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}

/* Is problem ka main idea bahut simple hai:

Agar do adjacent characters same letter hain, but ek lowercase aur doosra uppercase, to woh pair bad hai.

Example:

'a' and 'A' → bad
'B' and 'b' → bad

In dono ko remove kar dena hai, aur ye process tab tak repeat hota rahega jab tak string good na ban jaaye.

Best approach: Stack

Is problem me stack perfect hai.

Why?

Kyuki hume current character ko previous character ke saath compare karna hai.

Har character ke liye:

agar stack empty nahi hai
aur stack ka top aur current character same letter hain but opposite case me hain,
-----to stack se pop kar do
warna current character push kar do


Important trick

ASCII me:

'a' - 'A' = 32
'b' - 'B' = 32

So if two characters same letter hain but opposite case me hain, then:

Math.abs(ch1 - ch2) == 32

Ye condition use kar sakte hain. */