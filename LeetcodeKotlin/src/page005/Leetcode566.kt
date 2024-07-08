package page005

/**
 *
 * ��Ŀ: ���ܾ���
 *
 * ����: �� MATLAB �У���һ���ǳ����õĺ��� reshape �������Խ�һ�� m x n ��������Ϊ��һ����С��ͬ��r x c�����¾��󣬵�������ԭʼ���ݡ�
 *      ����һ���ɶ�ά���� mat ��ʾ�� m x n �����Լ����������� r �� c ���ֱ��ʾ��Ҫ���ع��ľ����������������
 *      �ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ�� �б���˳�� ��䡣
 *      ������и��������� reshape �����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����
 *
 * ����: m == mat.length
 *      n == mat[i].length
 *      1 <= m, n <= 100
 *      -1000 <= mat[i][j] <= 1000
 *      1 <= r, c <= 300
 *
 * ����: https://leetcode.cn/problems/reshape-the-matrix/description/
 *
 */
class Leetcode566 {

    /**
     * ����
     * ʱ�䣺289ms
     * �ڴ棺40.75MB
     */
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat[0].size * mat.size != r * c) {
            return mat
        }
        val temp = ArrayDeque<Int>()
        for (m in mat) {
            for (n in m) {
                temp.add(n)
            }
        }
        val answer = Array(r) { IntArray(c) }
        for (m in answer) {
            for (n in m.indices) {
                m[n] = temp.removeFirst()
            }
        }
        return answer
    }

}