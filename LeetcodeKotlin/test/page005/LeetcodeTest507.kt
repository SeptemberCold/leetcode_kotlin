package page005

import base.BaseTest

object LeetcodeTest507 : BaseTest<Int, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode507().checkPerfectNumber(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(28)
            it.add(7)
        }
    }

}