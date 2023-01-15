package com.lin.leetcode.page022

import kotlin.math.max
import kotlin.math.min

/**
 *
 * @author lin
 * @date 2023/01/15/22:44
 *
 *
 * 极大极小游戏
 * 给你一个下标从 0 开始的整数数组 nums ，其长度是 2 的幂。
 * 对 nums 执行下述算法：
 * 设 n 等于 nums 的长度，如果 n == 1 ，终止 算法过程。否则，创建 一个新的整数数组newNums ，新数组长度为 n / 2 ，下标从 0 开始。
 * 对于满足0 <= i < n / 2 的每个 偶数 下标 i ，将 newNums[ i ] 赋值 为 min(nums[2 * i], nums[2 * i + 1]) 。
 * 对于满足0 <= i < n / 2 的每个 奇数 下标 i ，将 newNums[ i ] 赋值 为 max(nums[2 * i], nums[2 * i + 1]) 。
 * 用 newNums 替换 nums 。
 * 从步骤 1 开始 重复 整个过程。
 * 执行算法后，返回 nums 中剩下的那个数字。
 *
 */
object Leetcode2293 {

    /**
     * 普通算法
     * 执行用时：200 ms
     * 内存消耗：35.2 MB
     */
    private fun minMaxGame01(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[i] = nums[i]
        }
        while (map.size > 1) {
            var newIndex = 0
            for (i in 0 until map.size) {
                if (i % 2 != 0) continue
                val i1 = map[i] ?: 0
                val i2 = map[i + 1] ?: 0
                map.remove(i)
                map.remove(i + 1)
                if (newIndex % 2 == 0) {
                    val min = min(i1, i2)
                    map[newIndex] = min
                } else {
                    val max = max(i1, i2)
                    map[newIndex] = max
                }
                newIndex += 1
            }
        }
        return map[0]!!
    }

    /**
     * 递归算法
     * 执行用时：244 ms
     * 内存消耗：35.6 MB
     */
    private fun minMaxGame02(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }
        val arr = IntArray(nums.size / 2)
        for (i in arr.indices) {
            val i1 = nums[2 * i]
            val i2 = nums[2 * i + 1]
            if (i % 2 == 0) {
                val min = min(i1, i2)
                arr[i] = min
            } else {
                val max = max(i1, i2)
                arr[i] = max
            }
        }
        return minMaxGame02(arr)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val minMaxGame = minMaxGame01(it)
            println(minMaxGame)
        }
        println("=======================")
        getTestData().forEach {
            val minMaxGame02 = minMaxGame02(it)
            println(minMaxGame02)
        }
    }


    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(1, 3, 5, 2, 4, 8, 2, 2))
        data.add(intArrayOf(3))
        return data
    }

}