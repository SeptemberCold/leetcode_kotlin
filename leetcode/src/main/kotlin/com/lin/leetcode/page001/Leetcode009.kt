package com.lin.leetcode.page001

/**
 * 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */
object Leetcode009 {

    /**
     * 执行用时：204 ms
     * 内存消耗：34.3 MB
     */
    private fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var sum = 0
        var temp = x
        while (true) {
            sum = sum * 10 + temp % 10
            temp /= 10
            if (temp == 0) break
        }
        return sum == x
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        testData.forEach {
            val result = isPalindrome(it)
            println("测试结果->${it}=${result}")
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<Int> {
        val data = ArrayList<Int>()
        data.add(1234567)
        return data
    }


}