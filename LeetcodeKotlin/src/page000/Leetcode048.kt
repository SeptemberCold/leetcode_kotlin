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

}