package page028

import base.BaseTest


object LeetcodeTest2810 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) {
            return@methodTest Leetcode2810().finalString(it)
        }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("Stringi")
        }
    }

}