/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.remove.duplicates;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Solution {
    
    public static int removeDuplicates(int[] nums) {
        int diff = 1;
        for (int i = 1; i < nums.length-1; i++) {
            int current = nums[i];
            int before = nums[i-1];
            if(current != before) {
                nums[diff] = nums[i];
                diff++;
            } 
        }
        return diff;
    }
    
    public static void main(String[] args) {
        int a[] = new int[]{1,1,2};
        System.out.println(removeDuplicates(a));
    }
    
}
