package page006

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest645 : BaseTest<IntArray, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode645().findErrorNums(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 2, 2, 4))
        }
    }

}