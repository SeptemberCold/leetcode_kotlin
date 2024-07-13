package page030

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest3011 : BaseTest<IntArray, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode3011().canSortArray(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(3, 16, 8, 4, 2))
            it.add(intArrayOf(8, 4, 2, 30, 15))
            it.add(intArrayOf(75, 34, 30))
        }
    }

}