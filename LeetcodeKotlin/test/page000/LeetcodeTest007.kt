package page000

import base.BaseTest

/**
 *
 * ��Ŀ:
 *
 * ����:
 * ����:
 *
 * ����:
 *
 */
object LeetcodeTest007 : BaseTest<Int, Int>() {


    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode007().reverse(it) }
    }


    override fun getExample(): List<Int> {
        val example = ArrayList<Int>()
        example.add(123)
        example.add(-123)
        example.add(120)
        example.add(0)
        return example
    }
}