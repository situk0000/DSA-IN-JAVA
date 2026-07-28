class Solution {

    public String smallestPalindrome(String s) {
        
    int len = s.length();
    int partition = len/2;
    char[] ch = s.toCharArray();

    Arrays.sort(ch,0,partition); //Arrays.sort(array, fromIndex, toIndex) -- toIndex exclusive hota hai
    for(int i =0;i<partition;i++){
        ch[len-1-i] = ch[i];
    }
    return new String(ch);
    }
}

/*Sirf first half hi kyu sort kiya?

Palindrome me

abcd|dcba

Second half independent nahi hota.

Wo first half ka mirror hota hai.

Isliye first half ko smallest bana do.

Baaki automatically smallest ban jayega.



Example

Current array

[b, d, b, d]

Length

4
i = 0
chars[3] = chars[0]

chars[3] = b

Array

[b, d, b, b]
i = 1
chars[2] = chars[1]

chars[2] = d

Array

[b, d, d, b]

Ho gaya palindrome.

bddb
Mirror formula
len - 1 - i

Example

Length = 8

Indexes

0 1 2 3 4 5 6 7

Mirror mapping

0 → 7
1 → 6
2 → 5
3 → 4

Exactly ye formula deta hai.

7 = 8-1-0

6 = 8-1-1

5 = 8-1-2

4 = 8-1-3
Example 2 (Odd Length)
s = "efcfe"

Array

[e,f,c,f,e]

Length

5

partition

5/2 = 2

First half

[e,f]

Sort

[e,f]

(no change)

Middle

c

Touch hi nahi hoga.

Mirror

index 4 = e

index 3 = f

Result

efcfe */
