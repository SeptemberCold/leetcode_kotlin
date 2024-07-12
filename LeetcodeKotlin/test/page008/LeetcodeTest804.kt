package page008

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest804 : BaseTest<Array<String>, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode804().uniqueMorseRepresentations(it) }
    }

    override fun getExample(): List<Array<String>> {
        return getArrayList().also {
            it.add(arrayOf("gin", "zen", "gig", "msg"))
        }
    }

}