package page004

import base.BaseTest


object LeetcodeTest441 : BaseTest<Int, Int>() {

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(3)
            it.add(5)
            it.add(8)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode441().arrangeCoins(it) }
    }

}