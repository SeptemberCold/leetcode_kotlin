package page000

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest016 : BaseTest<LeetcodeTest016.Data, Int>() {

    data class Data(val nums: IntArray, val target: Int)

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode016().threeSumClosest(it.nums, it.target) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(intArrayOf(1, 1, 1, 1), -100))
        example.add(Data(intArrayOf(-1, 2, 1, -4), 1))
        example.add(Data(intArrayOf(0, 0, 0), 1))
        return example
    }

}