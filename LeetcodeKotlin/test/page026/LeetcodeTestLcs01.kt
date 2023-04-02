package page026

import base.BaseTest

object LeetcodeTestLcs01 : BaseTest<Int, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest LeetcodeLcs01.leastMinutes(it) }
    }

    override fun getExample(): List<Int> {
        return intArrayOf(2, 4, 8, 10, 15).toList()
    }

}