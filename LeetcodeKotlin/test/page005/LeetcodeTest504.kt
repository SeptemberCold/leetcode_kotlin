package page005

import base.BaseTest

object LeetcodeTest504 : BaseTest<Int, String>() {

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(101)
            it.add(0)
            it.add(7)
            it.add(-10)
            it.add(-7)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode504().convertToBase7(it) }
    }

}