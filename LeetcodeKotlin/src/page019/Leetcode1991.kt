package page019

/**
 *
 * 题目: 找到数组的中间位置
 *
 * 描述: 给你一个下标从 0 开始的整数数组 nums ，请你找到 最左边 的中间位置 middleIndex （也就是所有可能中间位置下标最小的一个）。
 *      中间位置 middleIndex 是满足 nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1] 的数组下标。
 *      如果 middleIndex == 0 ，左边部分的和定义为 0 。类似的，如果 middleIndex == nums.length - 1 ，右边部分的和定义为 0 。
 *      请你返回满足上述条件 最左边 的 middleIndex ，如果不存在这样的中间位置，请你返回 -1 。
 *
 * 限制: 1 <= nums.length <= 100
 *      -1000 <= nums[i] <= 1000
 *
 * 链接: https://leetcode.cn/problems/find-the-middle-index-in-array/description/
 *
 */
class Leetcode1991 {

    /**
     * 前缀和
     * 用时：165ms
     * 内存：34.26MB
     */
    fun findMiddleIndex(nums: IntArray): Int {
        //计算总和
        var sum = 0
        for (num in nums) {
            sum += num
        }
        //前缀和
        var left = 0
        //遍历
        for (index in nums.indices) {
            //计算左侧和右侧是否相等
            if ((left * 2 + nums[index]) == sum) return index
            //不相等更新前缀和
            left += nums[index]
        }
        return -1
    }

}