package org.example.Array;
// https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=array
// Difficulty: Easy

// Problem
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.


// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

// Solution
// It iterates in backward.
// Increment the value of the index.
// If the increased value is not 10 return the array by incrementing the value.
// If value is 10, change the value of the index as 0 and continue the loop.
// If programme reaches after the loop, it means, the arrays only have 0's. So need add a 1 infront of the 0's.

// Time complexity - O(n)
// It loop through each element of the array once.

// Space complexity - O(1)
// It used a constant space because it does not depend on the size of the input array.
public class PlusOne66 {

    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]+1!=10){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
