import java.util.Arrays;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

Int k = removeElement(nums, val); // Calls your implementation

Assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class Top_002_D27 {
    public static void main(String[] args) {
    int[] nums = {1, 2, 5, 4, 7, 2, 1};
    int val = 2;
        System.out.println(Arrays.toString(removeElement(nums, val)));
    }

    public static int[] removeElement(int[] nums, int givenNum) {
        // two pointer solution, up/low pointer
        int  up = 0;
        // the up pointer -> indicate the index of target value
        // (target value -> stay and get overwriting, not target value -> move with the low pointer)
        //  overwrite the target value by the not target value giving by low pointer

        for (int low = 0; low < nums.length; low++) { // low pointer-> looping in order and give the notTarget value to the up pointer.

            // if the lowe pointer is equal to given num, then the up pointer will stay, and the low pointer will move to the next to find the target value
            if(nums[low] != givenNum){ //if it is not target value, then go inside the if statement then give it to the up pointer.

            nums[up] = nums[low];  // give the current value to the up pointer->to become a new switched array

                up++; //then the up pointer moves to the next -> to waiting for switch
            }
        }
        System.out.println("first "+ up +" elements are valid elements");
            return nums;
        }

}
