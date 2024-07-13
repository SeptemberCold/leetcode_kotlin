package page002

import base.BaseTest

/**
 * @author linshangzhao
 */
object LeetcodeTest257 : BaseTest<Leetcode257.TreeNode, List<String>>() {

    @JvmStatic
    fun main(args: Array<String>) {
        test { Leetcode257().binaryTreePaths(it) }
    }

    override fun getExample(): List<Leetcode257.TreeNode> {
        return getArrayList().also {
            it.add(Leetcode257.TreeNode(1).also { item ->
                item.left = Leetcode257.TreeNode(2).also { item2 ->
                    item2.right = Leetcode257.TreeNode(5)
                }
                item.right = Leetcode257.TreeNode(3)
            })
        }
    }


}