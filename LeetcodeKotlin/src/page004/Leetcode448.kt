package page004

/**
 *
 * 题目: 找到所有数组中消失的数字
 *
 * 描述: 给你一个含 n 个整数的数组 nums ，
 *      其中 nums[i] 在区间 [1, n] 内。
 *      请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 *
 * 限制: n == nums.length
 *      1 <= n <= 105
 *      1 <= nums[i] <= n
 *
 * 链接: https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 */
class Leetcode448 {

    /**
     * 集合去重做减法
     * 时间 500ms
     * 内存 53.12MB
     */
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val hashSet = HashSet<Int>()
        for (i in 1..nums.size) {
            hashSet.add(i)
        }
        val set = hashSet - HashSet(nums.toList())
        return set.toList()
    }

}