package com.lin.leetcode.page018

import kotlin.math.sqrt


/**
 *
 * @author lin
 * @date 2023/01/24/23:12
 * ͳ��һ��Բ�е����Ŀ
 * ����һ������points������points[ i ] = [xi, yi]����ʾ��i�����ڶ�άƽ���ϵ����ꡣ�������ܻ��� ��ͬ�����ꡣ
 * ͬʱ����һ������queries������queries[ j ] = [xj, yj, rj]����ʾһ��Բ����(xj, yj)�Ұ뾶Ϊrj��Բ��
 * ����ÿһ����ѯqueries[ j ]�������ڵ� j��Բ �ڵ����Ŀ��
 * ���һ������Բ�� �߽��ϣ�����ͬ����Ϊ����Բ�ڡ�
 * ���㷵��һ������answer������answer[ j ]�ǵ�j����ѯ�Ĵ𰸡�
 */
object Leetcode1828 {

    /**
     * ִ����ʱ��320 ms
     * �ڴ����ģ�50.2 MB
     * �����ⷨ ���������ľ����Ƿ�С�ڵ��ڰ뾶 û�뵽��Ȼ����
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