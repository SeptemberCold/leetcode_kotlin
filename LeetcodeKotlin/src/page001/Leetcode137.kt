package page001

/**
 *
 * 题目: 只出现一次的数字 II
 *
 * 描述: 给你一个整数数组nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 *      你必须设计并实现线性时间复杂度的算法且不使用额外空间来解决此问题。
 * 限制: 1 <= nums.length <= 3 * 104
 *      -231 <= nums[i] <= 231 - 1
 *      nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次
 *
 * 链接: https://leetcode.cn/problems/single-number-ii/
 *
 */
class Leetcode137 {

    /**
     * 电路开关模拟
     * 执行用时：192 ms
     * 内存消耗：35.3 MB
     */
    fun singleNumber(nums: IntArray): Int {
        var a = 0
        var b = 0
        for (num in nums) {
            val aNext = a.inv() and b and num or (a and b.inv() and num.inv())
            val bNext = a.inv() and (b xor num)
            a = aNext
            b = bNext
        }
        return b
    }

}