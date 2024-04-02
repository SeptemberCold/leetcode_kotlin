package page008

import base.BaseTest


object LeetcodeTest894 : BaseTest<Int, List<Leetcode894.TreeNode>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode894().allPossibleFBT(it) }
    }

    override fun getExample(): List<Int> {
        return getArrayList().also {
            it.add(1)
            it.add(3)
            it.add(5)
            it.add(6)
            it.add(7)
        }
    }

}