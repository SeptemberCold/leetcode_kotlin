package com.lin.leetcode.page016

/**
 *
 * @author lin
 * @date 2023/01/25/22:56
 * 矩阵转换后的秩
 * 给你一个m x n的矩阵 matrix，请你返回一个新的矩阵answer，其中answer[row][col]是matrix[row][col]的秩。
 * 每个元素的秩是一个整数，表示这个元素相对于其他元素的大小关系，它按照如下规则计算：
 * 秩是从 1 开始的一个整数。
 * 如果两个元素p 和q在 同一行或者 同一列，那么：
 * 如果p < q ，那么rank(p) < rank(q)
 * 如果p == q，那么rank(p) == rank(q)
 * 如果p > q，那么rank(p) > rank(q)
 * 秩需要越小越好。
 * 题目保证按照上面规则answer数组是唯一的。
 *
 * 困难题
 *
 */
object Leetcode1632 {
    fun matrixRankTransform(matrix: Array<IntArray>): Array<IntArray> {
        return TODO()
    }
}