package page024

import base.BaseTest

object LeetcodeTest2427 : BaseTest<LeetcodeTest2427.Data, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode2427.commonFactors(it.a, it.b) }
    }

    class Data(
        val a: Int, val b: Int
    )

    override fun getExample(): List<Data> {
        val example = ArrayList<Data>()
        example.add(Data(12, 6))
        example.add(Data(25, 30))
        return example
    }

}