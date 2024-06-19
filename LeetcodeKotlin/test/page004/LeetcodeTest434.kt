package page004

import base.BaseTest


object LeetcodeTest434 : BaseTest<String, Int>() {

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("Hello, my name is John")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode434().countSegments(it) }
    }

}