package page004

import base.BaseTest

object LeetcodeTest492 : BaseTest<Int, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode492().constructRectangle(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(4)
            it.add(2)
        }
    }

}