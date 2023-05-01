package page000

import base.BaseTest

object LeetcodeTest026 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        //想要完全测试需要通过调试才可以 因为结果要符合两个判定结果
        methodTest(example) { return@methodTest Leetcode026().removeDuplicates(it) }
    }

    override fun getExample(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(1, 1, 2))
        example.add(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
        return example
    }
}