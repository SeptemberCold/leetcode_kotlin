package page004

import kotlin.math.pow

/**
 *
 * ��Ŀ: ���ֵĲ���
 *
 * ����: �������Ķ����Ʊ�ʾȡ����0 �� 1 ��1 �� 0������ת��Ϊʮ���Ʊ�ʾ�����Եõ���������Ĳ�����
 *      ���磬���� 5 �Ķ����Ʊ�ʾ�� "101" ��ȡ����õ� "010" ����ת��ʮ���Ʊ�ʾ�õ����� 2 ��
 *      ����һ������ num ��������Ĳ�����
 *
 * ����: 1 <= num < 231
 *
 * ����: https://leetcode.cn/problems/number-complement/description/
 *
 */
class Leetcode476 {

    /**
     * ����������
     * ʱ�� 129ms
     * �ڴ� 32.71MB
     */
    fun findComplement(num: Int): Int {
        var i = 0
        var temp = num
        while (temp != 0){
            temp  = temp shr 1
            i += 1
        }
        val sum = (2.0.pow(i) - 1).toInt()
        return num xor sum
    }

}