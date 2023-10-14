package page001

import kotlin.math.pow

/**
 *
 * ��Ŀ: �ߵ�������λ
 *
 * ����: �ߵ������� 32 λ�޷��������Ķ�����λ��
 *      ��ʾ��
 *          ��ע�⣬��ĳЩ���ԣ��� Java���У�û���޷����������͡�
 *          ����������£���������������ָ��Ϊ�з����������ͣ�
 *          ���Ҳ�ӦӰ������ʵ�֣���Ϊ�����������з��ŵĻ����޷��ŵģ����ڲ��Ķ����Ʊ�ʾ��ʽ������ͬ�ġ�
 *          �� Java �У�������ʹ�ö����Ʋ���Ƿ�����ʾ�з���������
 *          ��ˣ��� ʾ�� 2 �У������ʾ�з������� -3�������ʾ�з������� -1073741825��

 * ����: ������һ������Ϊ 32 �Ķ������ַ���
 *
 * ����: https://leetcode.cn/problems/reverse-bits/description/
 *
 */
class Leetcode190 {

    /**
     * λ����
     * ʱ�� 120ms
     * �ڴ� 31.62MB
     */
    fun reverseBits(n: Int): Int {
        var temp = n
        var rev = 0
        for (i in 0..31) {
            if (temp == 0) break
            rev = rev or (temp and 1 shl 31 - i)
            temp = temp ushr 1
        }
        return rev
    }

    /**
     * λ����2
     * ʱ�� 124ms
     * �ڴ� 30.57MB
     */
    fun reverseBits2(n: Int): Int {
        var sum = 0
        for (i in 0 until 31) {
            if ((n ushr 31 - i) and 1 >= 1) {
                sum += 2.0.pow(i).toInt()
            }
        }

        if ((n ushr 0) and 1 >= 1) {
            sum  = sum or (1 shl 31)
        }
        return sum
    }

}