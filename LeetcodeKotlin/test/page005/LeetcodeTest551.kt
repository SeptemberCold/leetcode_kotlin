package page005

import base.BaseTest

object LeetcodeTest551 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode551().checkRecord(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("PPALLP")
            it.add("PPALLL")
        }
    }


}