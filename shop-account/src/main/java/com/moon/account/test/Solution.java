package com.moon.account.test;

import java.io.File;
import java.util.List;

/**
 * 给定一个根目录，要求遍历其中的文件及子文件夹，返回所有后缀是.txt的文件List
 * 要求：
 * 1. 不能使用递归
 */
public class Solution {
  public List<File> findTxt(File root) {
    // TODO:
     root.listFiles();
    return  null;
  }
  //=======================

  /**
   * 输入一个int数组，输出一个int数组，要求：
   * 1. 输出数组的元素是输入数组中出现频率>k次的元素
   * 2. 输出数组需要按照元素出现频率的高低进行排序
   */
  public static int[] topKFrequent(int[] nums, int k) {
    // TODO:
    return  null;
  }

//=======================

/**
 * 输入一个Long数组，按要求输出一个等长的Long数组
 * 输出数组的元素值等于，输入数组除相同下标外其他元素的积
 * 如：输入[1, 2, 3, 4], 输出[24, 12, 8, 6]
 * 输出数组：output[0] = input[1] * input[2] * input[3]，即 24 = 2 * 3 * 4
 *         output[1] = input[0] * input[2] * input[3]，即 12 = 1 * 3 * 4
 * 要求：
 * 1. 需要在O(n)复杂度内完成操作
 * 2. 不需要考虑乘积越界的问题
 */
  public long[] calc(long[] array) {
    // TODO:
     return  null;
  }
}