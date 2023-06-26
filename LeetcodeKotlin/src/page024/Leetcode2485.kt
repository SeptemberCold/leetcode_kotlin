package page024

/**
 *
 * 题目: 找出中枢整数
 *
 * 描述: 给你一个正整数 n ，找出满足下述条件的 中枢整数 x ：
 *          1 和 x 之间的所有元素之和等于 x 和 n 之间所有元素之和。
 *      返回中枢整数 x 。如果不存在中枢整数，则返回 -1 。题目保证对于给定的输入，至多存在一个中枢整数。
 * 限制: 1 <= n <= 1000
 *
 * 链接: https://leetcode.cn/problems/find-the-pivot-integer/
 *
 */
class Leetcode2485 {

    /**
     * 双指针
     * 执行用时：144 ms
     * 内存消耗：32.4 MB
     */
    fun pivotInteger(n: Int): Int {
        //左边之和
        var sum = if (n % 2 == 0) {
            (n + 1) * (n / 2)
        } else {
            (n + 1) * (n / 2) + ((n + 1) / 2)
        }
        //右边之和
        var temp = 0
        //遍历
        for (i in n downTo 1) {
            temp += i
            //左右相等返回结果
            if (sum == temp) {
                return i
            }
            //提前结束
            else if (sum < temp) {
                return -1
            }
            //为下一次循环做准备
            else {
                sum -= i
            }
        }
        return -1
    }

}