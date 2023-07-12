package page025

/**
 *
 * 题目: 交替数字和
 *
 * 描述: 给你一个正整数 n 。n 中的每一位数字都会按下述规则分配一个符号：
 *          最高有效位 上的数字分配到 正 号。
 *          剩余每位上数字的符号都与其相邻数字相反。
 *      返回所有数字及其对应符号的和。
 * 限制: 1 <= n <= 109
 *
 * 链接: https://leetcode.cn/problems/alternating-digit-sum/
 *
 */
class Leetcode2544 {

    /**
     * 数学
     * 执行用时：124 ms
     * 内存消耗：31.9 MB
     */
    fun alternateDigitSum(n: Int): Int {
        //参数替换
        var temp = n
        //总数
        var sum = 0
        //正负标记位
        var tag = 1
        //相加次数 n的位数
        var num = 0

        //遍历相加
        while (temp != 0) {
            sum += temp % 10 * tag
            temp /= 10
            tag *= -1
            num++
        }
        //如果位数是双 正负数有误 修正
        if (num % 2 == 0) {
            sum *= -1
        }
        return sum
    }

}