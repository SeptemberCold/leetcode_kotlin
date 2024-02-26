package page004

/**
 *
 * 题目: 最大连续 1 的个数
 *
 * 描述: 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 *
 * 限制: 1 <= nums.length <= 105
 *      nums[i] 不是 0 就是 1.
 *
 * 链接: https://leetcode.cn/problems/max-consecutive-ones/description/
 *
 */
class Leetcode485 {

    /**
     * 双指针
     * 用时：347ms
     * 内存：37.79MB
     */
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0

        var i = 0
        while (i < nums.size) {
            //找到1
            if (nums[i] == 1) {
                var j = i + 1
                //找到0
                while (j < nums.size) {
                    if (nums[j] == 0) {
                        if (max < j - i) {
                            max = j - i
                        }
                        i = j
                        break
                    }
                    j += 1
                }
                //如果j变成最大了就表示没有找到0
                if (j == nums.size) {
                    if (max < j - i) {
                        max = j - i
                    }
                }
            }
            i += 1
        }
        return max
    }

}