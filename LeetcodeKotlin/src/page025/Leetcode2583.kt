package page025

import java.util.*
import kotlin.collections.ArrayList

/**
 *
 * 题目: 二叉树中的第 K 大层和
 *
 * 描述: 给你一棵二叉树的根节点 root 和一个正整数 k 。
 *      树中的 层和 是指 同一层 上节点值的总和。
 *      返回树中第 k 大的层和（不一定不同）。如果树少于 k 层，则返回 -1 。
 *      注意，如果两个节点与根节点的距离相同，则认为它们在同一层。
 *
 * 限制: 2 <= n <= 105
 *      1 <= Node.val <= 106
 *      1 <= k <= n
 *
 * 链接: https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/description/?envType=daily-question&envId=2024-02-23
 *
 */
class Leetcode2583 {

    /**
     * 层序遍历
     * 用时：603ms
     * 内存：59.09MB
     */
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        if (root == null) return 0
        //层序遍历队列
        val queue = LinkedList<TreeNode>()
        //层和集合
        val arrayList = ArrayList<Long>()
        queue.add(root)

        while (!queue.isEmpty()) {
            var sum = 0L
            //queue存储着x层的所有节点 先统计x的节点 可以一边出队 一边入队
            //当x层的所有节点都出队后 queue剩下的是新入队的x+1层所有节点
            for (i in 0 until queue.size) {
                //出队
                val mRoot = queue.pop()
                //子节点都入队
                mRoot.left?.let { queue.add(it) }
                mRoot.right?.let { queue.add(it) }
                //
                sum += mRoot.`val`
            }
            //存储x层的层和
            arrayList.add(sum)
        }
        //如果树少于 k 层，则返回 -1
        if (k > arrayList.size) {
            return -1
        }
        //用库函数排序 从小到大的
        arrayList.sort()
        return arrayList[arrayList.size - k]
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}