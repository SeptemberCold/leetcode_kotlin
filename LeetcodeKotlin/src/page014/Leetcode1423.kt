package page014

/**
 *
 * ��Ŀ: �ɻ�õ�������
 *
 * ����: ���ſ��� �ų�һ�У�ÿ�ſ��ƶ���һ����Ӧ�ĵ������������������� cardPoints ������
 *      ÿ���ж�������Դ��еĿ�ͷ����ĩβ��һ�ſ��ƣ���������������� k �ſ��ơ�
 *      ��ĵ����������õ����е����п��Ƶĵ���֮�͡�
 *      ����һ���������� cardPoints ������ k�����㷵�ؿ��Ի�õ���������
 * ����: 1 <= cardPoints.length <= 10^5
 *      1 <= cardPoints[i] <= 10^4
 *      1 <= k <= cardPoints.length
 *
 * ����: https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/description/?envType=daily-question&envId=2023-12-03
 *
 */
class Leetcode1423 {

    /**
     * ��������
     * 352 ms
     * 52.52 MB
     */
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        //����
        var count = 0
        //��С��������ֵ
        var min = 0
        //�������ڵĳ��Ⱥ���ֵ
        val length = cardPoints.size - k
        var sum = 0
        for (i in cardPoints.indices) {
            //��������
            count += cardPoints[i]
            if (i < length) {
                sum += cardPoints[i]
                min = sum
            } else {
                sum = sum + cardPoints[i] - cardPoints[i - length]
                if (sum < min) {
                    min = sum
                }
            }
        }
        return count - min
    }

}