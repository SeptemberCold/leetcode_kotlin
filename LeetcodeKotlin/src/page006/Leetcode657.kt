package page006

/**
 *
 * ��Ŀ: �������ܷ񷵻�ԭ��
 *
 * ����: �ڶ�άƽ���ϣ���һ�������˴�ԭ�� (0, 0) ��ʼ�����������ƶ�˳���ж����������������ƶ����Ƿ��� (0, 0) ��������
 *      �ƶ�˳�����ַ��� moves ��ʾ���ַ� move[i] ��ʾ��� i ���ƶ��������˵���Ч������ R���ң���L���󣩣�U���ϣ��� D���£���
 *      �����������������ж����󷵻�ԭ�㣬�򷵻� true�����򣬷��� false��
 *      ע�⣺�����ˡ��泯���ķ����޹ؽ�Ҫ�� ��R�� ��ʼ��ʹ�����������ƶ�һ�Σ���L�� ��ʼ�������ƶ��ȡ����⣬����ÿ���ƶ������˵��ƶ�������ͬ��
 * ����: 1 <= moves.length <= 2 * 104
 *      moves ֻ�����ַ� 'U', 'D', 'L' �� 'R'
 *
 * ����: https://leetcode.cn/problems/robot-return-to-origin/
 *
 */
class Leetcode657 {

    /**
     * ͳ��
     * ʱ�� 180ms
     * �ڴ� 35.65MB
     */
    fun judgeCircle(moves: String): Boolean {
        val array = IntArray(4)

        for (move in moves) {
            when (move) {
                'U' -> array[0] = array[0] + 1
                'D' -> array[1] = array[1] + 1
                'L' -> array[2] = array[2] + 1
                'R' -> array[3] = array[3] + 1
            }
        }
        return array[0] == array[1] && array[2] == array[3]
    }

}