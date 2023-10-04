package page001

import kotlin.math.pow

/**
 *
 * ��Ŀ: Excel �������
 *
 * ����: ����һ���ַ��� columnTitle ����ʾ Excel ����е������ơ����� �������ƶ�Ӧ������� ��
 * ����: 1 <= columnTitle.length <= 7
 *      columnTitle ���ɴ�дӢ�����
 *      columnTitle �ڷ�Χ ["A", "FXSHRXW"] ��
 *
 * ����: https://leetcode.cn/problems/excel-sheet-column-number/description/
 *
 */
class Leetcode171 {

    /**
     * ��ѧģ��
     * ʱ�� 136ms
     * �ڴ� 33.02MB
     */
    fun titleToNumber(columnTitle: String): Int {
        var sum = 0
        val length = columnTitle.length
        for (i in 0..length - 2) {
            val temp = (columnTitle[i] - 'A' + 1) * (26.0.pow(length - i - 1.0))
            sum += temp.toInt()
        }
        sum += (columnTitle[columnTitle.length - 1] - 'A' + 1)
        return sum
    }

}