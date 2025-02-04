package page022

/**
 *
 * 题目: 判断根结点是否等于子结点之和
 *
 * 描述: 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 *      如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
 * 限制: 树只包含根结点、左子结点和右子结点
 *      -100 <= Node.val <= 100
 *
 * 链接: https://leetcode.cn/problems/root-equals-sum-of-children/description/
 *
 */
class Leetcode2236 {

    /**
     *
     * 时间 144ms
     * 内存 32.28MB
     */
    fun checkTree(root: TreeNode?): Boolean {
        return (root?.`val` ?: 0) == (root?.left?.`val` ?: 0) + (root?.right?.`val` ?: 0)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}