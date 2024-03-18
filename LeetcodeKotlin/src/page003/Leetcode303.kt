package page003

/**
 *
 * 题目: 区域和检索 - 数组不可变
 *
 * 描述: 给定一个整数数组  nums，处理以下类型的多个查询:
 *          计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
 *          实现 NumArray 类：
 *              NumArray(int[] nums) 使用数组 nums 初始化对象
 *              int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，
 *              包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )
 *
 * 限制: 1 <= nums.length <= 104
 *      -105 <= nums[i] <= 105
 *      0 <= i <= j < nums.length
 *      最多调用 104 次 sumRange 方法
 *
 * 链接: https://leetcode.cn/problems/range-sum-query-immutable/description/?envType=daily-question&envId=2024-03-18
 *
 */
class Leetcode303(private val nums: IntArray) {

    init {
        for (i in 1 until nums.size) {
            nums[i] = nums[i] + nums[i - 1]
        }
    }

    /**
     * 前缀和
     * 时间：231ms
     * 内存：39.93MB
     */
    fun sumRange(left: Int, right: Int): Int {
        if (left <= 0) return nums[right]

        return nums[right] - nums[left - 1]
    }

}