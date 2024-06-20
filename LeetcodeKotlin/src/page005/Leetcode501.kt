package page005

import java.util.Stack

/**
 *
 * 题目: 二叉搜索树中的众数
 *
 * 描述: 给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
 *      如果树中有不止一个众数，可以按 任意顺序 返回。
 *      假定 BST 满足如下定义：
 *      结点左子树中所含节点的值 小于等于 当前节点的值
 *      结点右子树中所含节点的值 大于等于 当前节点的值
 *      左子树和右子树都是二叉搜索树
 *
 * 限制: 树中节点的数目在范围 [1, 104] 内
 *      -105 <= Node.val <= 105
 *
 * 链接: https://leetcode.cn/problems/find-mode-in-binary-search-tree/description/
 *
 */
class Leetcode501 {

    /**
     * 哈希
     * 时间 237ms
     * 内存 40.07MB
     */
    fun findMode(root: TreeNode?): IntArray {
        if (root == null) return intArrayOf()

        var max = 0
        val hashMap = HashMap<Int, Int>()
        //栈
        val stack = Stack<TreeNode>()
        stack.push(root)
        //深度优先
        while (stack.isNotEmpty()) {
            val treeNode = stack.pop()
            //哈希存储
            val sum = hashMap[treeNode.`val`] ?: 0
            hashMap[treeNode.`val`] = sum + 1
            max = (sum + 1).coerceAtLeast(max)

            if (treeNode.left != null) {
                stack.push(treeNode.left)
            }
            if (treeNode.right != null) {
                stack.push(treeNode.right)
            }
        }
        val arrayList = ArrayList<Int>()
        for ((key, value) in hashMap) {
            if (value == max) {
                arrayList.add(key)
            }
        }
        return arrayList.toIntArray()
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}