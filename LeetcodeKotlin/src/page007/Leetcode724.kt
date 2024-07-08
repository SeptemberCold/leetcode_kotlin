package page007

/**
 *
 * 题目: 寻找数组的中心下标
 *
 * 描述: 给你一个整数数组 nums ，请计算数组的 中心下标 。
 *      数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。\
 *      如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 *      如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 *
 * 限制: 1 <= nums.length <= 104
 *      -1000 <= nums[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/find-pivot-index/description/?envType=daily-question&envId=2024-07-08
 *
 */
class Leetcode724 {

    /**
     * 前缀和
     * 时间:219ms
     * 内存:45.21MB
     */
    fun pivotIndex(nums: IntArray): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }

        var sum2 = 0
        for (i in nums.indices) {
            val value = sum2 * 2 + nums[i]
            if (value == sum) return i
            sum2 += nums[i]
        }
        return -1
    }

}