/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;

        while(p1!= null && p2 != null){
            if(p1.val<p2.val){
                dummy.next = p1;
                p1 = p1.next;
            } else{
                dummy.next = p2;
                p2 = p2.next;
            }
            dummy = dummy.next;
        }
        if(p1 == null){
            dummy.next = p2;
        } else{
            dummy.next = p1;
        }
        return ans.next;
    }
}

/* 🔹 Problem kya hai?

Tumhe 2 sorted linked lists di hui hain (ascending order me), aur tumhe unhe merge karke ek sorted linked list banani hai.

Example:

list1: 1 → 3 → 5  
list2: 2 → 4 → 6  

Output: 1 → 2 → 3 → 4 → 5 → 6
🔹 Code ka idea (High Level)

Hum:

# Ek dummy node banate hain (temporary starting point)
# Dono lists ko compare karte hain
# Jo chhota element ho → usse new list me add kar dete hain
# End me jo list bach jaye → usse attach kar dete hain

🔹 Line by Line Explanation
✅ 1. Dummy node banana
ListNode dummy = new ListNode(-1);
ListNode ans = dummy;
dummy → new list ka starting point
ans → store karta hai start ko (important for return)

👉 Dummy isliye use karte hain taaki head manage karna easy ho jaye

✅ 2. Pointers banaye
ListNode p1 = list1;
ListNode p2 = list2;
p1 → list1 ko traverse karega
p2 → list2 ko traverse karega
⚠️ 3. Loop (IMPORTANT)
while(p1 != null && p2 != null)

✅ 4. Compare and attach
if(p1.val < p2.val){
    dummy.next = p1;
    p1 = p1.next;
} else{
    dummy.next = p2;
    p2 = p2.next;
}
dummy = dummy.next;

👉 Samjho:

Jo chhota value hai → us node ko new list me add karo
Us list ka pointer aage badhao
Dummy ko bhi aage move karo
🧠 Visualization:
p1: 1 → 3 → 5
p2: 2 → 4 → 6

Step 1:
1 < 2 → add 1

Step 2:
3 > 2 → add 2

Step 3:
3 < 4 → add 3
...

✅ 5. Remaining nodes attach karo
if(p1 == null){
    dummy.next = p2;
} else{
    dummy.next = p1;
}

👉 Agar:

list1 khatam → list2 ka baaki part add
list2 khatam → list1 ka baaki part add

✅ 6. Return answer
return ans.next;

👉 ans.next kyun?

Kyunki ans dummy node pe hai (−1 wala)
Actual list uske baad start hoti hai

*/
