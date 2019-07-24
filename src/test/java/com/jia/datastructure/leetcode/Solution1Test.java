package com.jia.datastructure.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Jarris
 */
public class Solution1Test {

    @Test
    public void test(){
        Solution1 solution = new Solution1();
        int[] ints = solution.twoSum(new int[]{2, 0, 11, 7}, 9);
        System.out.println(Arrays.toString(ints));
    }
}