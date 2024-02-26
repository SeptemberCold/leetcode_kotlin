package page009

import java.util.LinkedList

/**
 *
 * 题目: 二叉搜索树的范围和
 *
 * 描述: 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 *
 * 限制: 树中节点数目在范围 [1, 2 * 104] 内
 *      1 <= Node.val <= 105
 *      1 <= low <= high <= 105
 *      所有 Node.val 互不相同
 *
 * 链接: https://leetcode.cn/problems/range-sum-of-bst/description/?envType=daily-question&envId=2024-02-26
 *
 */
class Leetcode938 {

    /**
     * 队列迭代
     * 用时：333ms
     * 内存：48.25MB
     */
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        //非空处理
        if (root == null) return 0

        var sum = 0
        val queue = LinkedList<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            //出队
            val treeNode = queue.pop()
            //子节点入队
            treeNode.left?.let { queue.add(it) }
            treeNode.right?.let { queue.add(it) }
            //节点数据统计
            if (treeNode.`val` in low..high) {
                sum += treeNode.`val`
            }
        }
        return sum
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}