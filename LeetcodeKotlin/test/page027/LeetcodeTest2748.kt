package page027

import base.BaseTest

object LeetcodeTest2748 : BaseTest<IntArray, Int>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2748().countBeautifulPairs(it) }
    }

    override fun getExample(): List<IntArray> {
        return getArrayList().also {
            it.add(intArrayOf(2, 5, 1, 4))
            it.add(intArrayOf(11, 21, 22))
        }
    }


}