package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/22/23:09
 * 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
object Leetcode066 {

    /**
     * 执行用时：180 ms
     * 内存消耗：33.7 MB
     */
    private fun plusOne(digits: IntArray): IntArray {
        //倒序遍历
        for (i in digits.size - 1 downTo 0) {
            val add = digits[i] + 1
            if (add == 10) {
                digits[i] = 0
            } else {
                digits[i] = add
                return digits
            }
        }
        //加1的结果大于自身 比如 99+1=100 需要人为加一个位置
        val answer = IntArray(digits.size + 1)
        answer[0] = 1
        for (i in 1 until answer.size) {
            answer[i] = digits[i - 1]
        }
        return answer
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val valid = plusOne(it)
            println("${it}=$valid")
        }
    }

    private fun getTestData(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(9,9))
        return example
    }

}