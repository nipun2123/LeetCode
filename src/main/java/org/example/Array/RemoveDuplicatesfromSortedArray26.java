package org.example.Array;

public class RemoveDuplicatesfromSortedArray26 {

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Difficulty: Easy

// Problem
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
// The remaining elements of nums are not important as well as the size of nums.
// Return k.

// Example 1:
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]

// Example 2:
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

// Solution
// I have used the two pointer approach for this.
// It loops through the array starting from first index. First pointer starts at 0. Second pointer starts at 1.
// When each pointer's value are not equal, replace the first pointer+1 value with second pointer value. It means add the next highest value to the next position and increment the number of unique value count(k).
// If each pointer's value are equal, keep looping.

// Time complexity - O(n)
// It loop through each element of the array once.

// Space complexity - O(1)
// It used a constant space because it does not depend on the size of the input array.

    public int removeDuplicates(int[] nums) {

        int k = 0;

        for(int i =1; i<nums.length; i++){
            if(nums[k]!=nums[i]){
                nums[k+1] = nums[i];
                k++;
            }

        }
        return k+1;
    }
}
