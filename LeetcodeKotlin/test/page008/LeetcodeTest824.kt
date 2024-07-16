package page008

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest824 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode824().toGoatLatin(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("I speak Goat Latin")
            it.add("The quick brown fox jumped over the lazy dog")
        }
    }

}