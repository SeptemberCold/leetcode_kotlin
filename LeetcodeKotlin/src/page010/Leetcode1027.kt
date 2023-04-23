package page010

import java.util.*


/**
 *
 * 题目: 最长等差数列
 *
 * 描述: 给你一个整数数组nums，返回 nums中最长等差子序列的长度。
 *      回想一下，nums 的子序列是一个列表nums[i1], nums[i2], ..., nums[ik] ，
 *      且0 <= i1 < i2 < ... < ik <= nums.length - 1。
 *      并且如果seq[i+1] - seq[i](0 <= i < seq.length - 1) 的值都相同，那么序列seq是等差的。
 * 限制: 2 <= nums.length <= 100
 *      0 <= nums[i] <= 500
 *
 * 链接: https://leetcode.cn/problems/longest-arithmetic-subsequence/
 *
 */
class Leetcode1027 {

    /**
     * 暴力的动态规划
     * 执行用时：428 MS
     * 内存消耗：44.6 MB
     */
    fun longestArithSeqLength(nums: IntArray?): Int {
        //数组为null的时候 返回0
        if (nums == null) return 0
        val min = Arrays.stream(nums).min().asInt
        val max = Arrays.stream(nums).max().asInt
        val diff = max - min
        //二维数组 或者说一维数组 值是map
        val dp = Array(nums.size) { Array(diff * 2 + 1) { 1 } }
        var answer = 0
        //从第二个开始遍历
        for (i in 1 until nums.size) {
            //和前面没一个值进行比较 计算出差值
            for (j in 0 until i) {
                //差值
                val d = nums[i] - nums[j]
                //长度加1
                dp[i][diff + d] = dp[j][diff + d] + 1
                //比较是否最长
                answer = answer.coerceAtLeast(dp[i][diff + d])
            }
        }
        return answer
    }

}