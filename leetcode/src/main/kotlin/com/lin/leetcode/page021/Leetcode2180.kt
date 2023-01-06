package com.lin.leetcode.page021

/**
 *
 * @author lin
 * @date 2023/01/06/21:54
 *
 * 给你一个正整数 num ，请你统计并返回 小于或等于 num 且各位数字之和为 偶数 的正整数的数目。
 * 正整数的 各位数字之和 是其所有位上的对应数字相加的结果。
 *
 */
object Leetcode2180 {

    /**
     * 暴力破解法
     * 力扣有限制 1<=num<=1000
     * 所以直接暴力破解
     * 执行用时：152 ms
     * 内存消耗：32 MB
     */
    private fun countEven(num: Int): Int {
        var count = 0
        for (i in 1..num) {
            var x = i
            var sum = 0
            while (x > 0) {
                sum += x % 10
                x /= 10
            }
            if (sum % 2 == 0) {
                count++
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val countEven = countEven(it)
            println("${it}->result=${countEven}")
        }
    }


    private fun getTestData(): List<Int> {
        val intArray = ArrayList<Int>()
        intArray.add(15)
        return intArray
    }

}