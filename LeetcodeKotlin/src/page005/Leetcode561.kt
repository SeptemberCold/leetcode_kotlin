package page005

/**
 *
 * 题目: 数组拆分
 *
 * 描述: 给定长度为2n的整数数组 nums ，你的任务是将这些数分成n 对,
 *      例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到n 的 min(ai, bi) 总和最大。
 *      返回该 最大总和 。
 *
 * 限制: 1 <= n <= 104
 *      nums.length == 2 * n
 *      -104 <= nums[i] <= 104
 *
 * 链接: https://leetcode.cn/problems/array-partition/
 *
 */
class Leetcode561 {

    /**
     * 数学规律
     * 用时：283ms
     * 内存：42.5MB
     */
    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        nums.sort()

        for (index in nums.indices step 2) {
            sum += nums[index]
        }
        return sum
    }

}