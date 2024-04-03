/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.

*/
public class D1_Palindrome_Number
    {
    public static void main(String[] args)
        {
        int original=212,latest=0,temp=original;

        while (temp!=0)
            {
            int digit =temp% 10; // Get the last digit of temp
            latest=latest*10+digit; //Multiply 'latest' by 10 to shift its digits one place to the left, then add the extracted digit from 'temp'.
            temp/=10;
            }
        System.out.println(latest == original ? "it is" : "it is not");
        }
    }
