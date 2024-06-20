package page005

import java.lang.StringBuilder
import kotlin.math.abs

/**
 *
 * ��Ŀ: �߽�����
 *
 * ����: ����һ������ num������ת��Ϊ 7 ���ƣ������ַ�����ʽ�����
 *
 * ����: -107 <= num <= 107
 *
 * ����: https://leetcode.cn/problems/base-7/description/
 *
 */
class Leetcode504 {

    /**
     * ��ѧ
     * ʱ�� 160ms
     * �ڴ� 35.03MB
     */
    fun convertToBase7(num: Int): String {
        if (num == 0) return "0"
        var temp = abs(num)
        val sb = StringBuilder()
        while (temp != 0) {
            val i = temp % 7
            temp = (temp - i) / 7
            sb.append(i)
        }
        if (num < 0) {
            sb.append("-")
        }
        return sb.toString().reversed()
    }

}