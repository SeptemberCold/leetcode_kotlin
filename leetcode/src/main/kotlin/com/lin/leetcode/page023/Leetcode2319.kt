package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/31/20:09
 *
 * 判断矩阵是否是一个 X 矩阵
 * 如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：
 * 矩阵对角线上的所有元素都 不是 0
 * 矩阵中所有其他元素都是 0
 * 给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。
 * 如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。
 */
object Leetcode2319 {

    /**
     * 执行用时：260 ms
     * 内存消耗：44.3 MB
     */
    private fun checkXMatrix(grid: Array<IntArray>): Boolean {
        //获取方形矩阵的长度
        val length = grid.size
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                //左对角线参数等于0 返回false
                if (i == j && grid[i][j] == 0) return false
                //右对角线参数等于0 返回false
                if (length - 1 - i == j && grid[i][j] == 0) return false
                //不是对角线的不等于0 返回false
                if (i != j && length - 1 - i != j && grid[i][j] != 0) return false
            }
        }
        return true
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = checkXMatrix(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<Array<IntArray>> {
        val array = ArrayList<Array<IntArray>>()
        array.add(
            arrayOf(
                intArrayOf(5, 0, 0, 1), intArrayOf(0, 4, 1, 5), intArrayOf(0, 5, 2, 0), intArrayOf(4, 1, 0, 2)
            )
        )
        array.add(
            arrayOf(
                intArrayOf(2, 0, 0, 1), intArrayOf(0, 3, 1, 0), intArrayOf(0, 5, 2, 0), intArrayOf(4, 0, 0, 2)
            )
        )
        return array
    }

}