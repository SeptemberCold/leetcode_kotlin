package page001

/**
 *
 * ��Ŀ: ������Ʊ�����ʱ�� II
 *
 * ����: ����һ���������� prices ������ prices[i] ��ʾĳ֧��Ʊ�� i ��ļ۸�
 *      ��ÿһ�죬����Ծ����Ƿ����/����۹�Ʊ�������κ�ʱ�� ��� ֻ�ܳ��� һ�� ��Ʊ��
 *      ��Ҳ�����ȹ���Ȼ���� ͬһ�� ���ۡ�
 *      ���� ���ܻ�õ� ��� ���� ��
 * ����: 1 <= prices.length <= 3 * 104
 *      0 <= prices[i] <= 104
 *
 * ����: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=daily-question&envId=2023-10-02
 *
 */
class Leetcode122 {

    /**
     * ̰��
     * ʱ�� 184ms
     * �ڴ� 35.69MB
     */
    fun maxProfit(prices: IntArray): Int {

        var sum = 0

        for (i in 1 until prices.size) {
            val pr = prices[i] - prices[i - 1]
            if (pr > 0) sum += pr
        }
        return sum

    }

}