package page005

import base.BaseTest


object LeetcodeTest501 : BaseTest<Leetcode501.TreeNode, IntArray>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode501().findMode(it) }
    }

    override fun getExample(): List<Leetcode501.TreeNode> {
        return getArrayList().also {
            it.add(Leetcode501.TreeNode(1).apply {
                right = Leetcode501.TreeNode(2).apply { left = Leetcode501.TreeNode(1) }
            })
            it.add(Leetcode501.TreeNode(0))
        }
    }

}