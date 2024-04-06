/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However,
the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four. The same principle applies to the number nine,
which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class D2_Roman_to_Integer
    {
    public static void main(String[] args)
        {
        System.out.println(Solution("XIX"));

        }
    public static int Solution (String Roman)
        {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < Roman.length(); i++)
        {
            if (i < (Roman.length() - 1) && (m.get(Roman.charAt(i))) < (m.get(Roman.charAt(i + 1))))
            //i < (Roman.length() - 1)  --->   它用来确保在访问i++时不会超出字符串的索引界限。
            //m.get(Roman.charAt(i))) --->使用Map的get(Object key)方法时，你会得到与给定key关联的value
                //m.get('X')  得到10
            //m.get(Roman.charAt(i + 1) --->获取字符串Roman中位于当前索引i后一个位置的字符。
                //m.get('I')  得到1
                //判断10<1是否成立
                //(m.get(Roman.charAt(i))) < (m.get(Roman.charAt(i + 1) 就是检查左边是否小于右边
            {
             ans -= m.get(Roman.charAt(i));
             // 得到结果的方法:左小右大 从ans里减
            }
                //XIX
                // 1-> (x,i)  2->(i,x)
                //X 和 I  属于左大右小  所以 X往里加,
                //I 和 X  属于左小右大  所以 I从ans里减
            else
            {
            ans += m.get(Roman.charAt(i));
            // 得到结果的方法:左大右小 往ans里加
            }
        }

    return ans;
    }
    }

