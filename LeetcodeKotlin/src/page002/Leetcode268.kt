package page002

/**
 *
 * 题目: 丢失的数字
 *
 * 描述: 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * 限制: n == nums.length
 *      1 <= n <= 104
 *      0 <= nums[i] <= n
 *      nums 中的所有数字都 独一无二
 *
 * 链接: https://leetcode.cn/problems/missing-number/
 *
 */
class Leetcode268 {

    /**
     * 排序
     * 执行用时：1160 ms
     * 内存消耗：39.6 MB
     */
    fun missingNumber(nums: IntArray): Int {
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
            }

        }
        for (i in nums.indices) {
            if (i != nums[i]) return i
        }
        return nums.size
    }

}