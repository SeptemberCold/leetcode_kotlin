package page024

/**
 *
 * ��Ŀ: �¶�ת��
 *
 * ����:  ����һ���������뵽��λС���ķǸ������� celsius ����ʾ�¶ȣ��� ���϶ȣ�Celsius��Ϊ��λ��
 *       ����Ҫ�����϶�ת��Ϊ ���϶ȣ�Kelvin���� ���϶ȣ�Fahrenheit������������ ans = [kelvin, fahrenheit] ����ʽ���ؽ����
 *       �������� ans ����ʵ�ʴ������� 10-5 �Ļ���Ϊ��ȷ�𰸡�
 * ����:  ���϶� = ���϶� + 273.15
 *       ���϶� = ���϶� * 1.80 + 32.00
 *
 * ����:  https://leetcode.cn/problems/convert-the-temperature/
 *
 */
object Leetcode2469 {

    /**
     * ��֪����ô���� ��������㷨����
     * ִ����ʱ��140 ms
     * �ڴ����ģ�33.4 MB
     */
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32.00)
    }

}