package page004

/**
 *
 * ��Ŀ: �ַ����еĵ�����
 *
 * ����: ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
 *      ��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
 *
 * ����:
 *
 * ����: https://leetcode.cn/problems/number-of-segments-in-a-string/description/
 *
 */
class Leetcode434 {

    /**
     * �ַ����ָ�
     * ʱ�� 143ms
     * �ڴ� 35.36MB
     */
    fun countSegments(s: String): Int {
        var sum = 0
        val array = s.split(" ")
        for (i in array) {
            if (i.isNotEmpty()) {
                sum += 1
            }
        }
        return sum
    }

}