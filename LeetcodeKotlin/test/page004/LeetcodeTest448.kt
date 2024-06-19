package page004

import base.BaseTest

object LeetcodeTest448 : BaseTest<IntArray, List<Int>>() {

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
            it.add(intArrayOf(1, 1))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode448().findDisappearedNumbers(it) }
    }

}