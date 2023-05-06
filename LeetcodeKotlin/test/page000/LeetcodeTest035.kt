package page000

import base.BaseTest

object LeetcodeTest035 : BaseTest<LeetcodeTest035.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode035().searchInsert(it.nums, it.target) }
    }


    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
//        example.add(Data(intArrayOf(1, 3, 5, 6), 5))
        example.add(Data(intArrayOf(1, 3, 5, 6), 2))
//        example.add(Data(intArrayOf(1, 3, 5, 6), 7))
        example.add(Data(intArrayOf(1, 3, 5, 6), 0))
        return example
    }

    class Data(
        val nums: IntArray, val target: Int
    )

}