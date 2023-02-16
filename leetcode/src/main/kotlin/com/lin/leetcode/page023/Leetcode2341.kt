package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/02/16/22:44
 *
 * 数组能形成多少数对
 *
 * 给你一个下标从 0 开始的整数数组 nums 。在一步操作中，你可以执行以下步骤：
 * 从 nums 选出 两个 相等的 整数
 * 从 nums 中移除这两个整数，形成一个 数对
 * 请你在 nums 上多次执行此操作直到无法继续执行。
 * 返回一个下标从 0 开始、长度为 2 的整数数组 answer 作为答案，
 * 其中 answer[0] 是形成的数对数目，
 * answer[1] 是对 nums 尽可能执行上述操作后剩下的整数数目。
 */
object Leetcode2341 {

    /**
     * 执行用时：176 ms
     * 内存消耗：35 MB
     */
    private fun numberOfPairs(nums: IntArray): IntArray {
        val auxiliary = IntArray(101)
        var count = 0
        for (num in nums) {
            auxiliary[num] = auxiliary[num] xor 1
            if (auxiliary[num] == 0) count++
        }
        return intArrayOf(count, nums.size - 2 * count)
    }

    /**
     * 执行用时：160 ms
     * 内存消耗：34.8 MB
     */
    private fun numberOfPairs2(nums: IntArray): IntArray {
        val auxiliary = IntArray(101)
        var count = 0
        nums.forEach { auxiliary[it] = auxiliary[it] + 1 }
        auxiliary.forEach { if (it != 0) count += it / 2 }
        return intArrayOf(count, nums.size - 2 * count)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = numberOfPairs(it)
            println("$it = ${answer[0]} ${answer[1]}")
        }
        println("=========================")
        getTestData().forEach {
            val answer = numberOfPairs2(it)
            println("$it = ${answer[0]} ${answer[1]}")
        }
    }

    private fun getTestData(): List<IntArray> {
        val array = ArrayList<IntArray>()
        array.add(intArrayOf(1, 3, 2, 1, 3, 2, 2))
        return array
    }

}