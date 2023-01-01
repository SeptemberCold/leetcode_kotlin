package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/01/01/19:
 *
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。
 * 但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
 * 题目出处
 * https://leetcode.cn/problems/two-sum/https://leetcode.cn/problems/two-sum/
 */
object Leetcode001 {

    /**
     * 执行用时：336 ms
     * 内存消耗：36.4 MB
     */
    fun twoSum01(nums: IntArray, target: Int): IntArray? {
        for (first in nums.indices) {
            for (second in nums.indices) {
                if (first != second) {
                    if (nums[first] + nums[second] == target) {
                        return intArrayOf(first, second)
                    }
                }
            }
        }
        return null
    }

    /**
     * 执行用时：244 ms
     * 内存消耗：37.1 MB
     */
    fun twoSum02(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            val key = target - nums[index]
            val result = map.containsKey(key)
            if (result) {
                return map[key]?.let { intArrayOf(it, index) }
            } else {
                map[nums[index]] = index
            }
        }
        return null
    }

    /**
     * 执行用时：240 ms
     * 内存消耗：36.9 MB
     *
     * 这种方式java执行用时只需2ms 内存消耗41.4 MB
     */
    fun twoSum03(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (map.containsKey(nums[index])) {
                return map[nums[index]]?.let { intArrayOf(it, index) }
            }
            map[target - nums[index]] = index
        }
        return null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        twoSum01(intArrayOf(), 0)
        twoSum02(intArrayOf(), 0)
        twoSum03(intArrayOf(), 0)
    }

}
