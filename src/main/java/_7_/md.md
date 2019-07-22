### [7\. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

Difficulty: **Easy**


Given a 32-bit signed integer, reverse digits of an integer.

**Example 1:**

```
Input: 123
Output: 321
```

**Example 2:**

```
Input: -123
Output: -321
```

**Example 3:**

```
Input: 120
Output: 21
```

**Note:**  
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2<sup>31</sup>,  2<sup>31 </sup>− 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


#### Solution

Language: **Java**

```java
class Solution {
    public int reverse(int x) {
        int b = 0;
         while (a != 0) {
             b = b * 10 + a % 10;
             a /= 10;
         }
         return b > Integer.MAX_VALUE || b < Integer.MIN_VALUE ? 0 : b;
    }
}
```