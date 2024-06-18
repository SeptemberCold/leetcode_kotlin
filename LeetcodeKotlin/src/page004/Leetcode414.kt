package page004

/**
 *
 * 题目: 第三大的数
 *
 * 描述: 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 * 限制: 1 <= nums.length <= 104
 *      -231 <= nums[i] <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/third-maximum-number/description/
 *
 */
class Leetcode414 {

    /**
     * 模拟
     * 时间 180ms
     * 内存 37.21MB
     */
    fun thirdMax(nums: IntArray): Int {
        var x: Int? = null
        var y: Int? = null
        var z: Int? = null

        val hashSet = nums.toHashSet()

        for (num in hashSet) {
            if (num == x) continue
            if (x == null || num > x) {
                z = y
                y = x
                x = num
                continue
            }
            if (num == y) continue
            if (y == null || num > y) {
                z = y
                y = num
                continue
            }
            if (z == null || num > z) {
                z = num
            }
        }

        return z ?: x ?: 0
    }

}