package org.vitargo;

public class Solution1342 {
    /*
     *Time complexity = O(log n)
     * Space Complexity = O(1)
     */
    public int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0){
                num = num/2;
                step ++;
            } else {
                num = num - 1;
                step ++;
            }
        }
        return step;
    }
}
