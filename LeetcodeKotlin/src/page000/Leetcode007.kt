package page000

/**
 *
 * ��Ŀ:  ������ת
 *
 * ����: ����һ�� 32 λ���з������� x �����ؽ� x �е����ֲ��ַ�ת��Ľ����
 *      �����ת���������� 32 λ���з��������ķ�Χ[Int.MIN_VALUE, Int.MAX_VALUE] ��
 *      �ͷ��� 0�����軷��������洢 64 λ�������з��Ż��޷��ţ���
 * ����: Int.MIN_VALUE <= x <= Int.MAX_VALUE
 *
 * ����: https://leetcode.cn/problems/reverse-integer/
 *
 */
class Leetcode007 {


    /**
     * ��ѧģ��
     * ִ����ʱ��128 ms
     * �ڴ����ģ�32.4 MB
     */
    fun reverse(x: Int): Int {
        //ת��Long���ͼ���
        var temp: Long = x.toLong()
        //�洢��ת���
        var result = 0L
        //x�ķ�ת
        while (temp != 0L) {
            val l = temp % 10
            result = result * 10 + l
            temp /= 10
        }
        //�жϷ�ת���result�Ƿ���Int�ķ�Χ��������ڷ���0
        if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
            return 0
        }
        return result.toInt()
    }


}