package page024

/**
 *
 * 题目: 不同的平均值数目
 *
 * 描述: 给你一个下标从 0开始长度为 偶数的整数数组nums。
 *      只要nums 不是空数组，你就重复执行以下步骤：
 *          找到nums中的最小值，并删除它。
 *          找到nums中的最大值，并删除它。
 *          计算删除两数的平均值。
 *      两数 a和 b的 平均值为(a + b) / 2。
 *      比方说，2和3的平均值是(2 + 3) / 2 = 2.5。
 *      返回上述过程能得到的 不同平均值的数目。
 *      注意，如果最小值或者最大值有重复元素，可以删除任意一个。
 *
 * 限制: 2 <= nums.length <= 100
 *      nums.length 是偶数。
 *      0 <= nums[i] <= 100
 *
 * 链接: https://leetcode.cn/problems/number-of-distinct-averages/
 *
 */
class Leetcode2465 {

    /**
     * 排序+哈希
     * 执行用时：148  ms
     * 内存消耗：32.7 MB
     */
    fun distinctAverages(nums: IntArray): Int {
        //冒泡排序
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j]
                    nums[j] = nums[j + 1]
                    nums[j + 1] = temp
                }
            }
        }
        //哈希存储
        val hashSet = HashSet<Int>()
        //计算和 不计算平均值 减少一步
        val count = nums.size / 2
        for (i in 0..count) {
            val add = nums[i] + nums[nums.size - 1 - i]
            hashSet.add(add)
        }
        return hashSet.size
    }


}