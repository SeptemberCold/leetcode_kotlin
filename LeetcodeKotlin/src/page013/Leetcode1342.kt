package page013

/**
 *
 * 题目: 将数字变成 0 的操作次数
 *
 * 描述: 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * 限制: 0 <= num <= 10^6
 *
 * 链接: https://leetcode.cn/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 */
class Leetcode1342 {


    /**
     * 位运算
     *
     * 115 ms
     * 32.84 MB
     */
    fun numberOfSteps(num: Int): Int {
        if (num == 0) return 0
        var temp = num
        var sum = 0
        while (temp != 0) {
            if (temp and 1 == 1) {
                sum += 1
            }
            sum += 1
            temp = temp shr 1
        }
        return sum - 1
    }


}