package greedyAlgorithm

/**
 *
 * ��Ŀ: �ַ�����
 *
 * ����: �����������飬a[]��ʾС����θ�ڣ�b[]��ʾ���ɵķ�����
 *      ��b[ i ]>a[ j ]��ʱ���ʾi���ɿ�������jС����θ�ڡ�
 *      �����b���������С����θ�ڡ�
 * ����:
 *
 * ����: https://www.bilibili.com/video/BV1MM411b7cq
 *
 */
object GreedyAlgorithm001 {

    /**
     * ̰���㷨 ˫ָ��
     * �����ķַ��𣬷���������θ���������С��
     */
    fun greedyAlgorithm(a: IntArray, b: IntArray): Int {
        val sortedA = a.toList().sorted()
        val sortedB = b.toList().sorted()
        //��������
        var ai = sortedA.size - 1
        var bi = sortedB.size - 1
        var result = 0
        while (true) {
            if (ai <= -1 || bi <= -1) return result
            if (sortedB[bi] >= sortedA[ai]) {
                bi -= 1
                ai -= 1
                result++
            } else {
                ai -= 1
            }
        }
    }

}