package page000

import base.BaseTest

object LeetcodeTest048 : BaseTest<Array<IntArray>, Unit>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode048().rotate(it) }
        methodTest(getExample()) { return@methodTest Leetcode048().rotate2(it) }
    }

    override fun getExample(): List<Array<IntArray>> {
        return getArrayList().also {
            it.add(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
            it.add(
                arrayOf(
                    intArrayOf(5, 1, 9, 11),
                    intArrayOf(2, 4, 8, 10),
                    intArrayOf(13, 3, 6, 7),
                    intArrayOf(15, 14, 12, 16)
                )
            )
        }
    }

}