package page005

import base.BaseTest

object LeetcodeTest557 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode557().reverseWords(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("Let's take LeetCode contest")
        }
    }

}