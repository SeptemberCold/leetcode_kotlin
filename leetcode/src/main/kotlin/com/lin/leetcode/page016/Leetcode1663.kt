package com.lin.leetcode.page016

/**
 *
 * @author lin
 * @date 2023/01/26/22:02
 *
 * 具有给定数值的最小字符串
 * 小写字符 的 数值 是它在字母表中的位置（从 1 开始），因此 a 的数值为 1 ，b 的数值为 2 ，c 的数值为 3 ，以此类推。
 * 字符串由若干小写字符组成，字符串的数值 为各字符的数值之和。例如，字符串 "abe" 的数值等于 1 + 2 + 5 = 8 。
 * 给你两个整数 n 和 k 。返回 长度 等于 n 且 数值 等于 k 的 字典序最小 的字符串。
 * 注意，如果字符串 x 在字典排序中位于 y 之前，就认为 x 字典序比 y 小，有以下两种情况：
 * x 是 y 的一个前缀；
 * 如果 i 是x[ i ] != y[ i ] 的第一个位置，且 x[ i ]在字母表中的位置比y[ i ]靠前。
 */
object Leetcode1663 {

    /**
     * 执行用时：200 ms
     * 内存消耗：36 MB
     */
    private fun getSmallestString(n: Int, k: Int): String {
        //创建一个数组 初始化为 z
        val answer = CharArray(n) { return@CharArray 'z' }
        //当前字符串数值
        var sum = n * 26
        //遍历
        for (i in answer.indices) {
            //不存在sum小于k的情况
            if (sum <= k) break
            //获取当前字符串数值和预想数值的差值
            val j = sum - k
            if (j >= 26) {
                answer[i] = 'a'
                sum -= 25
            } else {
                answer[i] = 'z' - j
                break
            }
        }
        return String(answer)
    }

    /**
     * 贪心算法
     * 执行用时：248 ms
     * 内存消耗：36.2 MB
     */
    private fun getSmallestString02(n: Int, k: Int): String {
        val answer = StringBuilder()
        var sum = k
        for (i in 1..n) {
            //剩下的位置全部为'z'和字符串数值的差值
            val j = sum - (n - i) * 26
            //还有剩余控件，当前位置可以是最小的'a'
            if (j <= 0) {
                sum -= 1
                answer.append('a')
            } else {
                sum -= j
                answer.append('a' + j - 1)
            }
        }
        return answer.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = getSmallestString(it.key, it.value)
            println("${it.key} = $answer")
        }
        println("==============================")
        getTestData().forEach {
            val answer = getSmallestString02(it.key, it.value)
            println("${it.key} = $answer")
        }
    }

    private fun getTestData(): Map<Int, Int> {
        val map = HashMap<Int, Int>()
        map[3] = 27
        map[5] = 73
        return map
    }


}