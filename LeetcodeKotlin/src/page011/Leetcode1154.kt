package page011

import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 *
 * ��Ŀ: һ���еĵڼ���
 *
 * ����: ����һ���ַ��� date ���� YYYY-MM-DD ��ʽ��ʾһ�� ���й�Ԫ���귨 ���ڡ����ظ������ǵ���ĵڼ��졣
 * ����: date.length == 10
 *      date[4] == date[7] == '-'�������� date[i] ��������
 *      date ��ʾ�ķ�Χ�� 1900 �� 1 �� 1 ���� 2019 �� 12 �� 31 ��
 *
 * ����: https://leetcode.cn/problems/day-of-the-year/description/?envType=daily-question&envId=2023-12-31
 *
 */
class Leetcode1154 {

    /**
     * ʱ���
     * 516 ms
     * 40.82 MB
     */
    fun dayOfYear(date: String): Int {
        val fmt: DateFormat = SimpleDateFormat("yyyy-MM-dd")
        val year = date.split("-")[0]
        val startDate = fmt.parse("${year}-01-01").time
        val mDate = fmt.parse(date).time
        return ((mDate - startDate) / 86400000).toInt() + 1
    }

}