package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/29/22:09
 * 统计星号
 * 给你一个字符串s，每两个连续竖线'|'为 一对.
 * 换言之，第一个和第二个'|'为一对，第三个和第四个'|'为一对，以此类推。
 * 请你返回 不在 竖线对之间，s中'*'的数目。
 * 注意，每个竖线'|'都会 恰好属于一个对。
 */
object Leetcode2315 {

    /**
     * 执行用时：144 ms
     * 内存消耗：34 MB
     */
    private fun countAsterisks(s: String): Int {
        //用于表示是否在星号之内
        var boolean = false
        //星号的数量
        var sum = 0
        //字符数组
        val array = s.toCharArray()
        for (i in array.indices) {
            //如果碰到'|'，翻转状态
            if (array[i] == '|') boolean = !boolean
            //如果在'|'之外 array[i]又等于'*' 则结果加1
            if (!boolean && array[i] == '*') sum++
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = countAsterisks(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("l|*e*et|c**o|*de|")
        array.add("iamprogrammer")
        array.add("yo|uar|e**|b|e***au|tifu|l")
        return array
    }

}