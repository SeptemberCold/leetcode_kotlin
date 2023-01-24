package com.lin.leetcode.page018

import kotlin.math.sqrt


/**
 *
 * @author lin
 * @date 2023/01/24/23:12
 * 统计一个圆中点的数目
 * 给你一个数组points，其中points[ i ] = [xi, yi]，表示第i个点在二维平面上的坐标。多个点可能会有 相同的坐标。
 * 同时给你一个数组queries，其中queries[ j ] = [xj, yj, rj]，表示一个圆心在(xj, yj)且半径为rj的圆。
 * 对于每一个查询queries[ j ]，计算在第 j个圆 内点的数目。
 * 如果一个点在圆的 边界上，我们同样认为它在圆内。
 * 请你返回一个数组answer，其中answer[ j ]是第j个查询的答案。
 */
object Leetcode1828 {

    /**
     * 执行用时：320 ms
     * 内存消耗：50.2 MB
     * 暴力解法 计算两点间的距离是否小于等于半径 没想到居然过了
     */
    private fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size)
        for (i in queries.indices) {
            val x1 = queries[i][0]
            val y1 = queries[i][1]
            val r = queries[i][2]
            points.forEach {
                val x2 = it[0]
                val y2 = it[1]
                if (sqrt(1.0 * ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))) <= r) {
                    answer[i] = answer[i] + 1
                }
            }
        }
        return answer
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = countPoints(it.points, it.queries)
            println("answer=${answer.toList()}")
        }
    }

    private fun getTestData(): List<Data> {
        val data = ArrayList<Data>()
        data.add(
            Data(
                arrayOf(intArrayOf(1, 3), intArrayOf(3, 3), intArrayOf(5, 3), intArrayOf(2, 2)),
                arrayOf(intArrayOf(2, 3, 1), intArrayOf(4, 3, 1), intArrayOf(1, 1, 2))
            )
        )
        return data
    }

    class Data(val points: Array<IntArray>, val queries: Array<IntArray>)


}