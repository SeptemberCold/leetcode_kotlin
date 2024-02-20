package page004

import kotlin.math.max

/**
 *
 * 题目: 对角线遍历
 *
 * 描述: 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 *
 * 限制: m == mat.length
 *      n == mat[i].length
 *      1 <= m, n <= 104
 *      1 <= m * n <= 104
 *      -105 <= mat[i][j] <= 105
 *
 * 链接: https://leetcode.cn/problems/diagonal-traverse/description/
 *
 */
class Leetcode498 {

    /**
     * 模拟
     * 用时：2296ms
     * 内存：55.11ms
     */
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val list = ArrayList<Int>()

        val m = mat.size - 1
        val n = mat[0].size - 1

        for (i in 0..max(m, n) * 2) {
            //如果是奇数 方向向下添加数据
            if (i % 2 != 0) {
                for (j in 0..i) {
                    if (j <= m && i - j <= n) {
                        list.add(mat[j][i - j])
                    }
                }
            }
            //如果是偶数 方向向上添加数据
            else {
                for (j in i downTo 0) {
                    if (j <= m && i - j <= n) {
                        list.add(mat[j][i - j])
                    }
                }
            }
        }

        return list.toIntArray()
    }

}