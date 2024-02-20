package page000

/**
 *
 * ��Ŀ: ��������
 *
 * ����: ����һ�� m x n �ľ������һ��Ԫ��Ϊ 0 ��
 *      ���������к��е�����Ԫ�ض���Ϊ 0 ����ʹ�� ԭ�� �㷨��
 * ����: m == matrix.length
 *       n == matrix[0].length
 *      1 <= m, n <= 200
 *      -231 <= matrix[i][j] <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/set-matrix-zeroes/description/
 */
class Leetcode073 {

    /**
     * ����ԭ������������
     * ��ʱ��260ms
     * �ڴ棺45.91MB
     */
    fun setZeroes(matrix: Array<IntArray>) {
        //��һ���Ƿ���0
        var isFirstRowZero = false
        //�����һ���Ƿ���0
        for (num in matrix[0]) {
            if (num == 0) {
                isFirstRowZero = true
                break
            }
        }
        //��ʼ���� �õ�һ�б�Ǹ����Ƿ���0
        for (i in 1 until matrix.size) {
            val ints = matrix[i]
            //��һ���Ƿ���0
            var isZero = false
            for (j in ints.indices) {
                if (ints[j] == 0) {
                    matrix[0][j] = 0
                    isZero = true
                }
            }
            //�����һ����0 ȫ����0
            if (isZero) {
                for (j in ints.indices) {
                    ints[j] = 0
                }
            }
        }
        //���ݵ�һ�еı�Ƕ�ÿһ�м��
        for (i in matrix[0].indices) {
            if (matrix[0][i] == 0) {
                for (ints in matrix) {
                    ints[i] = 0
                }
            }
        }
        //��һ�л�0
        if (isFirstRowZero) {
            for (i in matrix[0].indices) {
                matrix[0][i] = 0
            }
        }
    }

}