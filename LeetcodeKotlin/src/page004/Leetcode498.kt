package page004

import kotlin.math.max

/**
 *
 * ��Ŀ: �Խ��߱���
 *
 * ����: ����һ����СΪ m x n �ľ��� mat �����ԶԽ��߱�����˳����һ�����鷵����������е�����Ԫ�ء�
 *
 * ����: m == mat.length
 *      n == mat[i].length
 *      1 <= m, n <= 104
 *      1 <= m * n <= 104
 *      -105 <= mat[i][j] <= 105
 *
 * ����: https://leetcode.cn/problems/diagonal-traverse/description/
 *
 */
class Leetcode498 {

    /**
     * ģ��
     * ��ʱ��2296ms
     * �ڴ棺55.11ms
     */
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val list = ArrayList<Int>()

        val m = mat.size - 1
        val n = mat[0].size - 1

        for (i in 0..max(m, n) * 2) {
            //��������� ���������������
            if (i % 2 != 0) {
                for (j in 0..i) {
                    if (j <= m && i - j <= n) {
                        list.add(mat[j][i - j])
                    }
                }
            }
            //�����ż�� ���������������
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