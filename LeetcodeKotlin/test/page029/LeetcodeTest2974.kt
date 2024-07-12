package page029

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest2974 : BaseTest<IntArray, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode2974().numberGame(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(5, 4, 2, 3))
        }
    }

}