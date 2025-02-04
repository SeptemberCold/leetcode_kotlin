package page026

import kotlin.math.abs
import kotlin.math.max

/**
 *
 * 题目: 使二叉树所有路径值相等的最小代价
 *
 * 描述: 给你一个整数 n 表示一棵 满二叉树 里面节点的数目，节点编号从 1 到 n 。根节点编号为 1 ，
 *      树中每个非叶子节点 i 都有两个孩子，分别是左孩子 2 * i 和右孩子 2 * i + 1 。
 *      树中每个节点都有一个值，用下标从 0 开始、长度为 n 的整数数组 cost 表示，其中 cost[i] 是第 i + 1 个节点的值。
 *      每次操作，你可以将树中 任意 节点的值 增加 1 。你可以执行操作 任意 次。
 *      你的目标是让根到每一个 叶子结点 的路径值相等。请你返回 最少 需要执行增加操作多少次。
 *      注意：
 *          满二叉树 指的是一棵树，它满足树中除了叶子节点外每个节点都恰好有 2 个子节点，且所有叶子节点距离根节点距离相同。
 *          路径值 指的是路径上所有节点的值之和。
 *
 * 限制: 3 <= n <= 105
 *      n + 1 是 2 的幂
 *      cost.length == n
 *      1 <= cost[i] <= 104
 *
 * 链接: https://leetcode.cn/problems/make-costs-of-paths-equal-in-a-binary-tree/description/?envType=daily-question&envId=2024-02-28
 *
 */
class Leetcode2673 {

    /**
     * 图形规律
     * 用时：524ms
     * 内存：50.78MB
     */
    fun minIncrements(n: Int, cost: IntArray): Int {
        var count = 0
        for (i in n downTo 3 step 2) {
            val left = cost[i - 2]
            val right = cost[i - 1]
            count += abs(left - right)
            cost[(i - 1) / 2 - 1] += max(left, right)
        }
        return count
    }

}