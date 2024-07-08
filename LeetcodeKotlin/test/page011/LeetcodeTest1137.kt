package page011

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest1137 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode1137().tribonacci(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(0)
            it.add(1)
            it.add(2)
            it.add(4)
            it.add(25)
        }
    }
}