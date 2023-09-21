package page002

/**
 *
 * 题目: 各位相加
 *
 * 描述: 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 * 限制: 各位相加
 *
 * 链接: https://leetcode.cn/problems/add-digits/
 *
 */
class Leetcode258 {

    /**
     * 模拟
     * 时间 144ms
     * 内存 32.21MB
     */
    fun addDigits(num: Int): Int {
        var result = num
        while (result >= 10) {
            var temp = 0
            while (result > 0) {
                temp += result % 10
                result /= 10
            }
            result = temp
        }
        return result
    }

}