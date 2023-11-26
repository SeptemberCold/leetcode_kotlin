package page000

/**
 *
 * 题目: 颜色分类
 *
 * 描述: 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *      我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *      必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 限制: n == nums.length
 *      1 <= n <= 300
 *      nums[i] 为 0、1 或 2
 *
 * 链接: https://leetcode.cn/problems/sort-colors/description/
 *
 */
class Leetcode075 {

    /**
     * 统计双循环
     *
     * 156 ms
     * 34.11 MB
     */
    fun sortColors(nums: IntArray) {

        var n0 = 0
        var n1 = 0

        for (i in nums) {
            when (i) {
                0 -> n0 += 1
                1 -> n1 += 1
            }
        }

        for (i in nums.indices) {
            if (i < n0) {
                nums[i] = 0
                continue
            }
            if (i < n0 + n1) {
                nums[i] = 1
                continue
            }
            nums[i] = 2
        }

    }

}