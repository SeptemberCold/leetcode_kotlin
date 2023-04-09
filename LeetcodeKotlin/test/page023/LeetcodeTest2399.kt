package page023

import base.BaseTest

object LeetcodeTest2399 : BaseTest<LeetcodeTest2399.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode2399().checkDistances(it.s, it.distance) }
    }

    class Data(
        val s: String, val distance: IntArray
    )

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(
            Data("abaccb", intArrayOf(1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
        )
        example.add(
            Data("aa", intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
        )
        return example
    }

}