package page000

import kotlin.math.max
import kotlin.math.min

/**
 *
 * 题目: 合并区间
 *
 * 描述: 以数组 intervals 表示若干个区间的集合，
 *      其中单个区间为 intervals[i] = [starti, endi] 。
 *      请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * 限制: 1 <= intervals.length <= 104
 *      intervals[i].length == 2
 *      0 <= starti <= endi <= 104
 *
 * 链接: https://leetcode.cn/problems/merge-intervals/description/
 *
 */
class Leetcode056 {

    /**
     * 双重循环+递归
     * 时间 1208ms
     * 内存 51.19MB
     */
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val delete = HashSet<Int>()
        val result = merge2(intervals, delete)
        while (delete.isNotEmpty()) {
            delete.clear()
            merge2(result, delete)
        }
        return result
    }

    private fun merge2(intervals: Array<IntArray>, delete: HashSet<Int>): Array<IntArray> {
        for (i in intervals.indices) {
            //已经合在一起的跳过
            if (delete.contains(i)) continue
            //开始融合
            val ints1 = intervals[i]
            for (j in intervals.indices) {
                if (j == i) continue
                val ints2 = intervals[j]
                //右相交的情况
                if (ints2[0] in ints1[0]..ints1[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //左相交的情况
                else if (ints2[1] in ints1[0]..ints1[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //包含的情况
                else if (ints1[0] <= ints2[0] && ints1[1] >= ints2[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //被包含的情况
                else if (ints1[0] >= ints2[0] && ints1[1] <= ints2[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
            }
        }

        val result = ArrayList<IntArray>()
        for (i in intervals.indices) {
            if (!delete.contains(i)) {
                result.add(intervals[i])
            }
        }
        return result.toTypedArray()
    }


}