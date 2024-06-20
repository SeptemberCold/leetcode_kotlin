package page004

import kotlin.math.sqrt

/**
 *
 * ��Ŀ: �������
 *
 * ����: ��Ϊһλweb�����ߣ� ��������ȥ�滮һ��ҳ��ĳߴ��Ǻ���Ҫ�ġ�
 *      ���ԣ��ָ���һ������ľ���ҳ�������������������һ������Ϊ L �Ϳ��Ϊ W ����������Ҫ��ľ��ε�ҳ�档Ҫ��
 *      ����Ƶľ���ҳ�������ڸ�����Ŀ�������
 *      ��� W ��Ӧ���ڳ��� L ������֮��Ҫ�� L >= W ��
 *      ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С��
 *      ����һ�� ���� [L, W]������ L �� W ���㰴��˳����Ƶ���ҳ�ĳ��ȺͿ�ȡ�
 *
 * ����: 1 <= area <= 107
 *
 * ����: https://leetcode.cn/problems/construct-the-rectangle/description/
 *
 */
class Leetcode492 {

    /**
     * ��ѧ����
     * ʱ�� 126ms
     * �ڴ� 33.01MB
     */
    fun constructRectangle(area: Int): IntArray {
        //����
        val maxW = sqrt(area.toDouble()).toInt()
        //�𽥼��ٿ��
        for (i in maxW downTo 1) {
            if (area % i == 0) {
                return intArrayOf(area / i, i)
            }
        }
        return intArrayOf(1, area)
    }

}