package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/03/03/23:44
 * 多数元素
 * 给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数大于n/2的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
object Leetcode169 {

    /**
     * 执行用时：280 ms
     * 内存消耗：42.1 MB
     * 哈希表
     */
    private fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        val i = nums.size / 2
        for (num in nums) {
            val sum = map[num] ?: 0
            if (sum + 1 > i) {
                return num
            } else {
                map[num] = sum + 1
            }
        }
        return 0
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val valid = majorityElement(it)
            println("${it}=$valid")
        }
    }

    private fun getTestData(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(3, 2, 3))
        return example
    }


}