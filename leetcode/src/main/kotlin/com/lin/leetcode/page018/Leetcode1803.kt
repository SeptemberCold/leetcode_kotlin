package com.lin.leetcode.page018

/**
 * 统计异或值在范围内的数对有多少
 * 给你一个整数数组 nums （下标 从 0 开始 计数）以及两个整数：low 和 high ，请返回 漂亮数对 的数目。
 * 漂亮数对 是一个形如 (i, j) 的数对，其中 0 <= i < j < nums.length 且 low <= (nums[ i ] XOR nums[ j ]) <= high
 */
object Leetcode1803 {

    /**
     * 暴力破解
     * 执行用时: 1188 ms
     * 内存消耗: 41.8 MB
     */
    private fun countPairs(nums: IntArray, low: Int, high: Int): Int {
        var sum = 0
        //排序
        nums.sort()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val result = nums[i] xor nums[j]
                if (result in low..high) {
                    sum++
                }
            }
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = countPairs(it.nums, it.low, it.high)
            println("result = $result")
        }
    }


    private fun getTestData(): List<Data> {
        val data = ArrayList<Data>()
        data.add(Data(intArrayOf(1, 4, 2, 7), 2, 6))
        return data
    }


    class Data(val nums: IntArray, val low: Int, val high: Int)


}