package page002

import java.lang.StringBuilder

/**
 *
 * 题目: 二叉树的所有路径
 *
 * 描述: 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 *      叶子节点 是指没有子节点的节点。
 *
 * 限制: 树中节点的数目在范围 [1, 100] 内
 *      -100 <= Node.val <= 100
 *
 * 链接: https://leetcode.cn/problems/binary-tree-paths/description/
 *
 */
class Leetcode257 {

    /**
     * 栈 深度优先搜索
     * 时间：194ms
     * 内存：35.4MB
     */
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val answer = ArrayList<String>()
        if (root == null) return answer
        //arraylist当栈用
        val stack = ArrayList<TreeNode>()
        stack.add(root)
        //遍历记录表
        val hashMap = HashMap<TreeNode, Int>()
        while (stack.isNotEmpty()) {
            val treeNode = stack[stack.size - 1]
            //叶子节点处理
            if (treeNode.left == null && treeNode.right == null) {
                val sb = StringBuilder()
                sb.append(stack[0].`val`)
                for (i in 1 until stack.size) {
                    sb.append("->").append(stack[i].`val`)
                }
                answer.add(sb.toString())
                //叶子节点弹出
                stack.remove(treeNode)
                continue
            }
            //未访问过的节点
            if (hashMap[treeNode] == null) {
                //左节点不为空 推入栈中
                if (treeNode.left != null) {
                    stack.add(treeNode.left!!)
                }
                hashMap[treeNode] = 1
                continue
            }
            //访问过一次的节点
            if (hashMap[treeNode] == 1) {
                //右节点不为空 推入栈中
                if (treeNode.right != null) {
                    stack.add(treeNode.right!!)
                }
                hashMap[treeNode] = 2
                continue
            }
            //访问过两次的节点 弹出
            if (hashMap[treeNode] == 2) {
                stack.remove(treeNode)
            }
        }
        return answer
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}