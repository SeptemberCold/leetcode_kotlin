package page008

import base.BaseTest

object LeetcodeTest836 : BaseTest<LeetcodeTest836.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode836().isRectangleOverlap(it.rect1, it.rect2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
//            it.add(Data(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3)))
            it.add(Data(intArrayOf(7, 8, 13, 15), intArrayOf(10, 8, 12, 20)))
        }
    }

    class Data(val rect1: IntArray, val rect2: IntArray)

}