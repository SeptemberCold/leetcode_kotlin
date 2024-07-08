package page006

/**
 *
 * 题目: 错误的集合
 *
 * 描述: 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
 *      导致集合 丢失了一个数字 并且 有一个数字重复 。
 *      给定一个数组 nums 代表了集合 S 发生错误后的结果。
 *      请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 限制: 2 <= nums.length <= 104
 *      1 <= nums[i] <= 104
 *
 * 链接: https://leetcode.cn/problems/set-mismatch/description/
 *
 */
class Leetcode645 {

    /**
     * 模拟
     * 时间：239ms
     * 内存：38.96MB
     */
    fun findErrorNums(nums: IntArray): IntArray {
        val temp = IntArray(nums.size)
        for (num in nums) {
            temp[num - 1] = temp[num - 1] + 1
        }
        var i = 0
        var j = 0
        for (index in temp.indices) {
            if (temp[index] == 2) i = index + 1
            if (temp[index] == 0) j = index + 1
        }
        return intArrayOf(i, j)
    }

}