package page022

import base.BaseTest

/**
 *
 * 题目:
 *
 * 描述:
 * 限制:
 *
 * 链接:
 *
 */
object LeetcodeTest2236 : BaseTest<Leetcode2236.TreeNode, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
        methodTest(getExample()) { return@methodTest Leetcode2236().checkTree(it) }
    }

    override fun getExample(): List<Leetcode2236.TreeNode> {
        return getArrayList().also {
            it.add(Leetcode2236.TreeNode(10).also { item ->
                item.left = Leetcode2236.TreeNode(4)
                item.right = Leetcode2236.TreeNode(6)
            })
            it.add(Leetcode2236.TreeNode(5).also { item ->
                item.left = Leetcode2236.TreeNode(3)
                item.right = Leetcode2236.TreeNode(1)
            })
        }
    }
}