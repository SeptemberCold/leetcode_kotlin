package page000

/**
 *
 * 题目:两数之和
 *
 * 描述: 给定一个整数数组nums和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 *      你可以假设每种输入只会对应一个答案。但是， 数组中同一个元素在答案里不能重复出现。
 *      你可以按任意顺序返回答案。
 * 限制:  2 <= nums.length <= 104
 *      -109 <= nums[i] <= 109
 *      -109 <= target <= 109
 *      只会存在一个有效答案
 *
 * 链接:https://leetcode.cn/problems/two-sum/
 *
 */
object Leetcode001 {

    /**
     * 使用哈希表
     * target最大为109
     * 可能不存在答案
     * 最多只存在一个答案
     *
     * 执行用时：208 ms
     * 内存消耗：36.9 MB
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            val numA = nums[i]
            val numB = target - numA
            val index = hashMap[numB]
            if (index != null) {
                return intArrayOf(i, index)
            } else {
                hashMap[numA] = i
            }
        }
        //如果不存在答案 返回空数组
        return intArrayOf()
    }

}