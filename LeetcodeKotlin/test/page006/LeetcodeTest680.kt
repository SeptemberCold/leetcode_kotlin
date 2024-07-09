package page006

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest680 : BaseTest<String, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode680().validPalindrome(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("eccer")
            it.add("aba")
            it.add("abca")
            it.add("abc")
            it.add("abba")
        }
    }


}