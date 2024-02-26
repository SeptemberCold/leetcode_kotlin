package page000

import base.BaseTest


object LeetcodeTest027 : BaseTest<LeetcodeTest027.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        //想要完全测试需要通过调试才可以 因为结果要符合两个判定结果
        methodTest(example) { return@methodTest Leetcode027().removeElement(it.nums, it.`val`) }
        methodTest(example) { return@methodTest Leetcode027().removeElement2(it.nums, it.`val`) }
    }

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(intArrayOf(2, 2, 2), 2))
        example.add(Data(intArrayOf(1), 1))
        example.add(Data(intArrayOf(4, 5), 4))
        example.add(Data(intArrayOf(2), 3))
        example.add(Data(intArrayOf(2), 2))
        example.add(Data(intArrayOf(3, 2, 2, 3), 3))
        example.add(Data(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
        example.add(Data(intArrayOf(1), 1))
        return example
    }

    class Data(
            val nums: IntArray, val `val`: Int
    )

}