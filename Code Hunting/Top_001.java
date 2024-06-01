import java.util.Arrays;

/*
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
* representing the number of elements in nums1 and nums2 respectively.
*
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3
       nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1.
* The 0 is only there to ensure the merge result can fit in nums1.
*/
public class Top_001
    {
    public static void main(String[] args)
        {

        Solution solution = new Solution();
        int [] nums1 = {1,2,3,4,5,0,0,0};
        int m=5;
        int [] nums2={6,7,8};
        int n=3;
        solution.merge(nums1,m,nums2,n);
            System.out.println(Arrays.toString(nums1));
        }
    public static class Solution
        {
        public void merge(int[] nums1, int m, int[] nums2, int n)
            {
                /*
                nums1 = [1,2,3,0,0,0], m = 3(valid number in second array)
                nums2 = [2,5,6], n= 3(valid number in second array)
                */
                int LastIndex_FirstAry = m - 1; // Index of the last non-zero element in first array e:3 -> index:2
                int LastIndex_SecondAry = n - 1; // Index of the last non-zero element in second array e:6 -> index:2
                int LastIndex_MergedAry = m + n - 1;// Index of the last  element in merged array e:3 -> index:2

                while (LastIndex_SecondAry >= 0)
                    //To sort the merge arrays,
                    // they need to be compared with each other,
                    // so the index of any array returns to 0 to indicate the end of the merge.
                {
                // If the current element in nums1 is greater than the current element in nums2,
                // Then copy the element in nums1 to the current last position of the merged array.
                    if (LastIndex_FirstAry >= 0 && nums1[LastIndex_FirstAry] > nums2[LastIndex_SecondAry])
                    {
                    nums1[LastIndex_MergedAry--] = nums1[LastIndex_FirstAry--];
                    }
                else
                    {
                    nums1[LastIndex_MergedAry--] = nums2[LastIndex_SecondAry--];
                    }
                }
            }
        }
    }
