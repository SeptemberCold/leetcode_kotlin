package page007

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest724 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode724().pivotIndex(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(1, 7, 3, 6, 5, 6))
        }
    }

}