package page004

import base.BaseTest

object LeetcodeTest461 : BaseTest<LeetcodeTest461.Data, Int>() {

    data class Data(val x: Int, val y: Int)

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data(1, 4))
            it.add(Data(3, 1))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode461().hammingDistance(it.x, it.y) }
    }

}