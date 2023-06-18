package page001

/**
 *
 * 题目: 多数元素
 *
 * 描述: 给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 n/2 的元素。
 *      你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 限制: n == nums.length
 *      1 <= n <= 5 * 104
 *      -109 <= nums[i] <= 109
 *
 * 链接: https://leetcode.cn/problems/majority-element/
 *
 */
class Leetcode169 {

    /**
     * 哈希表
     * 执行用时：272 ms
     * 内存消耗：39.3 MB
     */
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            //获取总数
            val sum = map[num] ?: 0
            if (sum + 1 > (nums.size / 2)) {
                return num
            } else {
                map[num] = sum + 1
            }
        }
        return 0
    }
}