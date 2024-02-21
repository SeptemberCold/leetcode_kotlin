package page001

import base.BaseTest

object LeetcodeTest151 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode151().reverseWords(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("the sky is blue")
            it.add("Je suis tres content")
            it.add(" asdasd df f")
            it.add("t ")
        }
    }

}