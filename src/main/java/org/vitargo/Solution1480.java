package org.vitargo;

public class Solution1480 {
    /* 1480. Running Sum of 1d Array (Easy)
        Hint
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

        Return the running sum of nums.

        Example 1:

        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        Example 2:

        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
        Example 3:

        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]

        Constraints:

        1 <= nums.length <= 1000
        -10^6 <= nums[i] <= 10^6
     */

    /*
     * Time Complexity O(n2)
     * Space Complexity 0(1)
     */
    public int[] myFirstSolRunningSum(int[] nums) {
        int[] sumNums = new int[nums.length];
        sumNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            int sum = nums[i];
            for (int y = i-1; y >= 0; y--){
                sum = sum + nums[y];
            }
            sumNums[i] = sum;
        }
        return sumNums;
    }

    /*
     * Time Complexity O(n)
     * Space Complexity 0(1)
     */

    public int[] betterSol1RunningSum(int[] nums) {
        int[] sumNums = new int[nums.length];
        sumNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            sumNums[i] = nums[i] + sumNums[i-1];
        }
        return sumNums;
    }
    /*
     * Time Complexity O(n)
     * Space Complexity O(1)
     */

    public int[] betterSol2RunningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

