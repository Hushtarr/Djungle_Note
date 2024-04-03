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
            int digit =temp% 10;
            // 幂10的目的是控制小数点并得到余数,在这里首先整数会变成一个小数,然后%操作之后小数点左移得到余数,也就是小数点之后的数字
            latest=latest*10+digit;
            // 乘10是为了恢复原油数字的位数,得到的个位数,乘10变成十位数,然后在个位数上加上新得到的余数
            temp/=10;
            // 将临时变量依此拆解(小数点左移得到整数部分用于下一轮的取余数操作,直至拆解完毕)
            }
        System.out.println(latest == original ? "it is" : "it is not");
        }
    }
