package page000

/**
 *
 * ��Ŀ: ��תͼ��
 *
 * ����: ����һ�� n �� n �Ķ�ά���� matrix ��ʾһ��ͼ�����㽫ͼ��˳ʱ����ת 90 �ȡ�
 *      ������� ԭ�� ��תͼ������ζ������Ҫֱ���޸�����Ķ�ά�����벻Ҫ ʹ����һ����������תͼ��
 *
 * ����: n == matrix.length == matrix[i].length
 *      1 <= n <= 20
 *      -1000 <= matrix[i][j] <= 1000
 *
 * ����: https://leetcode.cn/problems/rotate-image/description/
 *
 */
class Leetcode048 {

    /**
     * ʹ�ø����ռ䱩���ƽ�
     * ��ʱ��168ms
     * �ڴ棺34.76MB
     */
    fun rotate(matrix: Array<IntArray>) {
        //��� ���list��
        val copy = matrix.map { it.copyOf() }

        for (matrixIndex in matrix.indices) {
            val ints = matrix[matrixIndex]
            for (index in ints.indices) {
                ints[index] = copy[ints.size - 1 - index][matrixIndex]
            }
        }
    }

    /**
     * ԭ����ת
     * ��ʱ��168ms
     * �ڴ棺34.63MB
     */
    fun rotate2(matrix: Array<IntArray>) {
        val n = matrix.size
        for (i in 0 until n / 2) {
            //����Ԫ���ϲ��� ÿ4����תһ��
            for (j in i until n - i - 1) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j]
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i]
                matrix[j][n - 1 - i] = temp
            }
        }
    }

}