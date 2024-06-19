package page004

import base.BaseTest

object LeetcodeTest476 : BaseTest<Int, Int>() {

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(5)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode476().findComplement(it) }
    }

}