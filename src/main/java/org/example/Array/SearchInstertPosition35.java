package org.example.Array;

public class SearchInstertPosition35 {

// https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
// Difficulty: Easy

// Problem
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:
// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Solution
// I have used the binary search tree for this.
// It has right, left and middle pointers. The pointers move until it find the target value.
// If it not found the target, it iterates until left pointer become bigger than the right pointer, in that case left pointer is the answer.

// Time complexity - O(log n)
// It use the binary search tree and always neglect the half of the list.

// Space complexity - O(1)
// It used a constant space because it does not depend on the size of the input array.

    public int searchInsert(int[] nums, int target) {

        if(nums==null || nums.length==0){
            return 0;
        }

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int middle = left+(right-left)/2;

            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]<target){
                left = middle+1;

            }else if(nums[middle]>target){
                right = middle-1;
            }
        }

        return left;
    }
}
