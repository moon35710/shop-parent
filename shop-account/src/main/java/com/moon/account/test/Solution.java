package com.moon.account.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 给定一个根目录，要求遍历其中的文件及子文件夹，返回所有后缀是.txt的文件List
 * 要求：
 * 1. 不能使用递归
 */
public class Solution {
    public static void main(String[] args) {
//        findTxtByQue(new File("D://txts"));
//        int[] arrays = {1, 2, 5, 6, 2, 5, 8, 9, 4, 7, 1, 6, 9, 4, 7, 9, 8, 2, 2, 2, 4, 6};
//        topKFrequent(arrays, 2);
        long[] array = {1, 2, 3, 4};
        calc(array);
    }

    public static List<File> findTxt(File root) {
        List<File> fileList = new ArrayList<>();
        if (!root.isDirectory()) {
            fileList.add(root);
            return fileList;
        }
        FileFilter fileFilter = pathname -> pathname.isDirectory() || pathname.getName().endsWith(".txt");
        Set<File> dirSet = new LinkedHashSet<>();
        dirSet.add(root);
        List<File> dirFiles = new ArrayList<>();
        File[] files;
        do {
            Iterator<File> fileIterator = dirSet.iterator();
            while (fileIterator.hasNext()) {
                files = fileIterator.next().listFiles(fileFilter);
                if (files.length > 0) {
                    for (int i = 0; i < files.length; i++) {
                        System.out.println(files[i].getName());
                        if (files[i].isDirectory()) {
                            dirFiles.add(files[i]);
                            continue;
                        }
                        fileList.add(files[i]);
                    }
                }
            }
            dirSet.clear();
            dirSet.addAll(dirFiles);
            dirFiles.clear();
        } while (!dirSet.isEmpty());

        return fileList;
    }

    public static List<File> findTxtByQue(File root) {
        // TODO:
        List<File> fileList = new ArrayList<>();
        if (!root.isDirectory()) {
            fileList.add(root);
            return fileList;
        }
        LinkedList<File> fileQueue = new LinkedList<>();
        FileFilter fileFilter = pathname -> pathname.isDirectory() || pathname.getName().endsWith(".txt");
        fileQueue.addLast(root);
        File[] files;
        File file;
        while (!fileQueue.isEmpty()) {
            file = fileQueue.pop();
            files = file.listFiles(fileFilter);
            if (files.length > 0) {
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                    if (files[i].isDirectory()) {
                        fileQueue.addLast(files[i]);
                        continue;
                    }
                    fileList.add(files[i]);
                }
            }
        }
        return fileList;
    }
    //=======================

    /**
     * 输入一个int数组，输出一个int数组，要求：
     * 1. 输出数组的元素是输入数组中出现频率>k次的元素
     * 2. 输出数组需要按照元素出现频率的高低进行排序
     */
    public static Integer[] topKFrequent(int[] nums, int k) {
        // TODO:
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
        }
        List<Map.Entry<Integer, Integer>> entrys = map.entrySet().stream()
                .filter(e -> e.getValue().intValue() > k)
                .sorted((o1, o2) -> o1.getValue().intValue() > o2.getValue().intValue() ? -1 : 1)
                .collect(Collectors.toList());
        entrys.forEach(e -> {
            System.out.println(e.getKey() + "===>" + e.getValue());
        });
        return entrys.stream().map(Map.Entry::getKey).collect(Collectors.toList()).toArray(new Integer []{});
    }

//=======================

    /**
     * 输入一个Long数组，按要求输出一个等长的Long数组
     * 输出数组的元素值等于，输入数组除相同下标外其他元素的积
     * 如：输入[1, 2, 3, 4], 输出[24, 12, 8, 6]
     * 输出数组：output[0] = input[1] * input[2] * input[3]，即 24 = 2 * 3 * 4
     * output[1] = input[0] * input[2] * input[3]，即 12 = 1 * 3 * 4
     * 要求：
     * 1. 需要在O(n)复杂度内完成操作
     * 2. 不需要考虑乘积越界的问题
     */
    public static long[] calc(long[] array) {
        if (array.length <= 1)
            return new long[]{0};
        long sum = 1;
        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            sum = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[j] == 0) {
                    sum = 0;
                    break;
                }
                sum = sum * array[j];
            }
            result[i] = sum;
            System.out.println(i + "---" + sum);
        }

        return result;
    }
    public static long[] calc2(long[] array) {
        if (array.length <= 1)
            return new long[]{0};
        long sum = 1;
        int length = array.length;
        long[] result = new long[length];
        long left =1,right=1;

        for (int i = 0; i < length; i++) {
            sum = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[j] == 0) {
                    sum = 0;
                    break;
                }
                sum = sum * array[j];
            }
            result[i] = sum;
            System.out.println(i + "---" + sum);
        }

        return result;
    }
}