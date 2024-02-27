package page028

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set

/**
 *
 * 题目: 统计树中的合法路径数目
 *
 * 描述: 给你一棵 n 个节点的无向树，节点编号为 1 到 n 。给你一个整数 n 和一个长度为 n - 1 的二维整数数组 edges ，
 *      其中 edges[i] = [ui, vi] 表示节点 ui 和 vi 在树中有一条边。
 *      请你返回树中的 合法路径数目 。
 *      如果在节点 a 到节点 b 之间 恰好有一个 节点的编号是质数，那么我们称路径 (a, b) 是 合法的 。
 *      注意：
 *          路径 (a, b) 指的是一条从节点 a 开始到节点 b 结束的一个节点序列，序列中的节点 互不相同 ，且相邻节点之间在树上有一条边。
 *          路径 (a, b) 和路径 (b, a) 视为 同一条 路径，且只计入答案 一次 。
 *
 * 限制: 1 <= n <= 105
 *      edges.length == n - 1
 *      edges[i].length == 2
 *      1 <= ui, vi <= n
 *      输入保证 edges 形成一棵合法的树。
 *
 * 链接: https://leetcode.cn/problems/count-valid-paths-in-a-tree/description/?envType=daily-question&envId=2024-02-27
 *
 */
class Leetcode2867 {

    companion object {
        //埃氏筛
        val isPrime = BooleanArray(100001) { true }.also {
            it[1] = false
            var i = 2
            while (i * i < 100001) {
                if (it[i]) {
                    var j = i * i
                    while (j < 100001) {
                        it[j] = false
                        j += i
                    }
                }
                i += 1
            }
        }
    }

    /**
     * 埃氏筛 + 迭代 + 规律
     * 用时：2116ms
     * 内存：111.35MB
     */
    fun countPaths(n: Int, edges: Array<IntArray>): Long {
        //nodeMap[i] 代表节点i的相邻节点
        val nodeMap = HashMap<Int, ArrayList<Int>>()
        for (i in 1..n) {
            nodeMap[i] = ArrayList()
        }
        for ((key, value) in edges) {
            nodeMap[key]?.add(value)
            nodeMap[value]?.add(key)
        }
        //count[i] 代表节点i能在不经过质数节点情况下能够访问的非质数节点数
        val count = IntArray(n + 1)
        //统计合法路径变量
        var sum = 0L
        //队列 出队元素
        val queue = LinkedList<Int>()
        val headNode = ArrayList<Int>()
        //找出质数节点
        for (i in 1..n) {
            //不是质数
            if (!isPrime[i]) continue
            //相邻节点集合
            val childrenNodes = nodeMap[i] as ArrayList
            var cur = 0
            for (childrenNode in childrenNodes) {
                //节点是质数 这一条路径就没用了
                if (isPrime[childrenNode]) continue
                //如果count[i]!=0代表已经检查过这个节点了,否则重新计算一次
                if (count[childrenNode] == 0) {
                    //入队
                    queue.add(childrenNode)
                    headNode.add(i)
                    var cnt = 0
                    while (queue.isNotEmpty()) {
                        val dequeNode = queue.pop()
                        nodeMap[dequeNode]?.forEach {
                            if (!isPrime[it] && !headNode.contains(it)) {
                                queue.add(it)
                                cnt += 1
                            }
                        }
                        headNode.add(dequeNode)
                    }
                    headNode.clear()
                    //加上自己
                    count[childrenNode] = cnt + 1
                }
                sum += count[childrenNode] * cur
                //前面统计的可访问节点数
                cur += count[childrenNode]
            }
            //这是从质数出发访问所有非质数节点
            sum += cur
        }
        return sum
    }

}