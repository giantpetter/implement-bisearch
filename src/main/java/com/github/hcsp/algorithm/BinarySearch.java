package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int recursiveBinarySearch(String[] strings, String target, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        if (lo > hi) {
            return -1;
        }
        if (strings[mid].compareTo(target) < 0) {
            return recursiveBinarySearch(strings, target, mid + 1, hi);
        } else if (strings[mid].compareTo(target) > 0) {
            return recursiveBinarySearch(strings, target, lo, mid - 1);
        } else {
            return mid;
        }
    }

    public static int binarySearch(String[] strings, String target) {
        int lo = 0, hi = strings.length - 1;
        return recursiveBinarySearch(strings, target, lo, hi);
    }
}
