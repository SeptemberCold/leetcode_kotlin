package page000

import kotlin.math.max
import kotlin.math.min

/**
 *
 * ��Ŀ: �ϲ�����
 *
 * ����: ������ intervals ��ʾ���ɸ�����ļ��ϣ�
 *      ���е�������Ϊ intervals[i] = [starti, endi] ��
 *      ����ϲ������ص������䣬������ һ�����ص����������飬��������ǡ�ø��������е��������� ��
 * ����: 1 <= intervals.length <= 104
 *      intervals[i].length == 2
 *      0 <= starti <= endi <= 104
 *
 * ����: https://leetcode.cn/problems/merge-intervals/description/
 *
 */
class Leetcode056 {

    /**
     * ˫��ѭ��+�ݹ�
     * ʱ�� 1208ms
     * �ڴ� 51.19MB
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
            //�Ѿ�����һ�������
            if (delete.contains(i)) continue
            //��ʼ�ں�
            val ints1 = intervals[i]
            for (j in intervals.indices) {
                if (j == i) continue
                val ints2 = intervals[j]
                //���ཻ�����
                if (ints2[0] in ints1[0]..ints1[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //���ཻ�����
                else if (ints2[1] in ints1[0]..ints1[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //���������
                else if (ints1[0] <= ints2[0] && ints1[1] >= ints2[1]) {
                    ints1[0] = min(ints1[0], ints2[0])
                    ints1[1] = max(ints1[1], ints2[1])
                    delete.add(j)
                }
                //�����������
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