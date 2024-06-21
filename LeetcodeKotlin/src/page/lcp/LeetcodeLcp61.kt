package page.lcp

/**
 *
 * ��Ŀ:���±仯����
 *
 * ����: ���۳Ǽƻ����������������ۼ��껪���ķֻ᳡������С�����ڷ��������������±仯���ƣ�
 *      ���ڵ� i ~ (i+1) ������±仯���ƣ����������¹����жϣ�
 *      ���� i+1 ������� ���� �� i �죬Ϊ ���� ����
 *      ���� i+1 ������� ���� �� i �죬Ϊ ƽ�� ����
 *      ���� i+1 ������� ���� �� i �죬Ϊ �½� ����
 *      ��֪ temperatureA[i] �� temperatureB[i] �ֱ��ʾ�� i �������������¡�
 *      ��ί��ϣ���ҵ�һ�����������ܶ࣬���������±仯������ͬ��ʱ��ٰ���껪���
 *      ������������������±仯������ͬ���������������
 *
 * ����: 2 <= temperatureA.length == temperatureB.length <= 1000
 *      -20 <= temperatureA[i], temperatureB[i] <= 40
 *
 * ����: https://leetcode.cn/problems/6CE719/description/?envType=daily-question&envId=2024-06-21
 *
 */
class LeetcodeLcp61 {

    /**
     * ģ��
     *
     * ִ����ʱ��181 ms
     * �ڴ����ģ�38.17 MB
     */
    fun temperatureTrend(temperatureA: IntArray, temperatureB: IntArray): Int {
        //��ͬ���Ƶ�������ʱ
        var sum = 0
        var max = 0
        for (i in 1 until temperatureA.size) {
            val statusA = when {
                temperatureA[i] > temperatureA[i - 1] -> 1
                temperatureA[i] == temperatureA[i - 1] -> 0
                temperatureA[i] < temperatureA[i - 1] -> -1
                else -> 0
            }
            val statusB = when {
                temperatureB[i] > temperatureB[i - 1] -> 1
                temperatureB[i] == temperatureB[i - 1] -> 0
                temperatureB[i] < temperatureB[i - 1] -> -1
                else -> 0
            }
            if (statusA == statusB) {
                sum += 1
                max = sum.coerceAtLeast(max)
            } else {
                sum = 0
            }
        }
        return max
    }

}