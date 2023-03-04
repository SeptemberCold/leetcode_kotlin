package page000

/**
 *
 * 题目:两数之和
 *
 * 描述: 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。、
 *      你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。、
 *      你可以按任意顺序返回答案。
 * 限制:  2 <= nums.length <= 104
 *      -109 <= nums[i] <= 109
 *      -109 <= target <= 109
 *      只会存在一个有效答案
 *
 * 链接:https://leetcode.cn/problems/two-sum/
 *
 */
object LeetcodeTest001 {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        example.forEach {
            val twoSum = Leetcode001.twoSum(it.nums, it.target)
            println("输入:nums=${it.nums.toList()},target=${it.target}")
            println("输出:${twoSum.toList()}")
        }
    }

    private fun getExample(): List<Data> {
        val examples = ArrayList<Data>()
        examples.add(Data(intArrayOf(2, 7, 11, 15), 9))
        examples.add(Data(intArrayOf(3, 2, 4), 6))
        examples.add(Data(intArrayOf(3, 3), 6))
        return examples
    }


    class Data(
        val nums: IntArray, val target: Int
    )


}