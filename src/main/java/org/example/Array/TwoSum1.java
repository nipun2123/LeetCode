package org.example.Array;

// https://leetcode.com/problems/two-sum/description/
// Difficulty: Easy

// Problem
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]


// Solution
// I have used the Brute Force approach for this.
// It loop through each combination of elements and return if find both value equal to the target.

// Time complexity - O(n2)
// It loop through each element of the array twice to find the target value.

// Space complexity - O(1)
// It used a constant space because it does not depend on the size of the input array.

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {


        int[] solution = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int x = i+1; x<nums.length; x++){

                if(nums[i]+nums[x]==target){
                    solution[0]=i;
                    solution[1]=x;
                    return solution;
                }

            }

        }
        return solution;
    }
}
