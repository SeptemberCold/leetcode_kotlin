package page010

/**
 *
 * ��Ŀ: ������ͳ��
 *
 * ����: ���Ƕ� 0 �� 255 ֮����������в�������������洢������ count �У�count[ k] �������� k �������г��ֵĴ�����
 *      ��������ͳ������:
 *      minimum�������е���СԪ�ء�
 *      maximum����Ʒ�е����Ԫ�ء�
 *      mean��������ƽ��ֵ������Ϊ����Ԫ�ص��ܺͳ���Ԫ��������
 *      median��
 *      ���������Ԫ�ظ�������������ôһ�������������λ�� median �����м��Ԫ�ء�
 *      �����������ż����Ԫ�أ���ô��λ��median ��������������м�����Ԫ�ص�ƽ��ֵ��
 *      mode�������г��ִ����������֡��������� Ψһ �ġ�
 *      �Ը������������ʽ����������ͳ����Ϣ[minimum, maximum, mean, median, mode]������ʵ�������10-5�ڵĴ𰸶�����ͨ����
 * ����: count.length == 256
 *      0 <= count[i] <= 109
 *      1 <= sum(count) <= 109
 *      count�������� Ψһ ��
 *
 * ����: https://leetcode.cn/problems/statistics-from-a-large-sample/
 *
 */
class Leetcode1093 {

    /**
     * ��ѧģ��
     * ִ����ʱ��196 ms
     * �ڴ����ģ�40.7 MB
     */
    fun sampleStats(count: IntArray): DoubleArray {
        val answer = doubleArrayOf(-1.0, 0.0, 0.0, 0.0, 0.0)
        //��ֵ
        var sum = 0.0
        //������
        var number = 0.0
        //��������
        var more = 0
        //����
        for (i in count.indices) {
            val value = count[i]
            //========�������������е���СԪ��
            if (answer[0] == -1.0 && value != 0) {
                answer[0] = i.toDouble()
            }
            //�������������е����Ԫ��
            if (value != 0) {
                answer[1] = i.toDouble()
            }
            //========�������������е�������
            if (value > more) {
                answer[4] = i.toDouble()
                more = value
            }
            //========�����Ǽ������������� valueҪ��ת��double�������sum��ֵǰ�������޷��洢̫�������
            sum += (value.toDouble() * i)
            //�����Ǽ��������ж��ٸ�Ԫ��
            number += value
        }
        //========�����Ǽ���������ƽ��ֵ
        answer[2] = sum / number
        //========�����Ǽ�����λ����
        //��������ż��
        if (number % 2 == 0.0) {
            var n = 0
            var a = -1
            var b = -1
            for (i in count.indices) {
                val value = count[i]
                n += value
                if (a == -1 && n >= number / 2) {
                    a = i
                }
                if (n >= number / 2 + 1) {
                    b = i
                    break
                }
            }
            answer[3] = (a.toDouble() + b) / 2
        } else {
            var n = 0
            for (i in count.indices) {
                val value = count[i]
                n += value
                if (n >= number / 2) {
                    answer[3] = i.toDouble()
                    break
                }
            }
        }
        return answer
    }

}