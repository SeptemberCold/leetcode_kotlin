package page008

import java.util.ArrayList

/**
 *
 * 题目: 所有可能的真二叉树
 *
 * 描述: 给你一个整数 n ，请你找出所有可能含 n 个节点的 真二叉树 ，并以列表形式返回。答案中每棵树的每个节点都必须符合 Node.val == 0 。
 *      答案的每个元素都是一棵真二叉树的根节点。你可以按 任意顺序 返回最终的真二叉树列表。
 *      真二叉树 是一类二叉树，树中每个节点恰好有 0 或 2 个子节点。
 *
 * 限制: 1 <= n <= 20
 *
 * 链接: https://leetcode.cn/problems/all-possible-full-binary-trees/description/
 *
 */
class Leetcode894 {

    /**
     * 分开递归
     * 时间：256ms
     * 内存：47.27MB
     */
    fun allPossibleFBT(n: Int): List<TreeNode> {
        //偶数没有满二叉树 返回null
        if (n and 1 != 1) return arrayListOf()
        //递归
        if (n != 1) {
            val trees = ArrayList<TreeNode>()
            for (i in 1..n - 2) {
                val leftTrees = allPossibleFBT(i)
                val rightTrees = allPossibleFBT(n - 1 - i)

                for (leftTree in leftTrees) {
                    for (rightTree in rightTrees) {
                        val treeNode = TreeNode()
                        treeNode.left = leftTree
                        treeNode.right = rightTree
                        trees.add(treeNode)
                    }
                }
            }
            return trees
        }
        return arrayListOf(TreeNode())
    }


    data class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}