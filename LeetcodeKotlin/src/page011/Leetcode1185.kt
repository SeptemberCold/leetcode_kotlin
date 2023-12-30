package page011

import java.text.DateFormat
import java.text.SimpleDateFormat


/**
 *
 * ��Ŀ: һ���еĵڼ���
 *
 * ����: ����һ�����ڣ��������һ���㷨���ж����Ƕ�Ӧһ���е���һ�졣
 *      ����Ϊ����������day��month �� year���ֱ��ʾ�ա��¡��ꡣ
 *      �����صĽ���������⼸��ֵ�е�һ�� {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}��
 * ����: ����������һ������ 1971 �� 2100 ��֮�����Ч���ڡ�
 *
 * ����: https://leetcode.cn/problems/day-of-the-week/description/?envType=daily-question&envId=2023-12-30
 *
 */
class Leetcode1185 {

    /**
     * ʱ���ȡģ
     *
     * Leetcode�ϵ�ʱ���������������� ����1970-01-01 00:00:00��Ϊ��׼��
     * ����ʹ��time = data.time���Եó���ȷ��
     *
     * ����׼ʱ�����1970-01-01 08:00:00��ʼ
     * ������Ҫ����28800000 8Сʱ��ʱ��������ܼ���ɹ�
     *
     * 156 ms
     * 33.75 MB
     */
    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        val fmt: DateFormat = SimpleDateFormat("yyyy-MM-dd")
        val date = fmt.parse("${year}-${month}-${day}")
        val time = date.time + 28800000
        return when (((time / 86400000) % 7).toInt()) {
            0 -> "Thursday"
            1 -> "Friday"
            2 -> "Saturday"
            3 -> "Sunday"
            4 -> "Monday"
            5 -> "Tuesday"
            6 -> "Wednesday"
            else -> ""
        }
    }

}