package page007

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest709 : BaseTest<String, String>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode709().toLowerCase(it) }
    }

    override fun getExample(): List<String> {
        return getArrayList().also {
            it.add("Hello")
        }
    }

}