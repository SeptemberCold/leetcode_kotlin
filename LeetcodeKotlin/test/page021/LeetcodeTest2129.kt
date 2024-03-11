package page021

import base.BaseTest

object LeetcodeTest2129 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2129().capitalizeTitle(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("capiTalIze tHe titLe")
        }
    }
}