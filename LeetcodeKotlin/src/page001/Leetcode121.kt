package page001

/**
 *
 * ��Ŀ: ������Ʊ�����ʱ��
 *
 * ����: ����һ������prices,���ĵ�i��Ԫ��prices[ i ]��ʾһ֧������Ʊ�� i ��ļ۸�
 *      ��ֻ��ѡ�� ĳһ�� ������ֻ��Ʊ����ѡ���� δ����ĳһ����ͬ������ �����ù�Ʊ�����һ���㷨�����������ܻ�ȡ���������
 *      ��������Դ���ʽ����л�ȡ�������������㲻�ܻ�ȡ�κ����󣬷��� 0 ��
 * ����: 1 <= prices.length <= 105
 *      0 <= prices[i] <= 104
 *
 * ����: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 *
 */
object Leetcode121 {


    /**
     * ��̬�滮
     *
     * ִ����ʱ��608 ms
     * �ڴ����ģ�56.3 MB
     */
    fun maxProfit(prices: IntArray): Int {
        //0λ�ǹ�Ʊ��͹� 1λ�ǻ�ȡ���������
        val dp = intArrayOf(prices[0], 0)
        for (price in prices) {
            //����۸������ͼ۸� ���㵱����ͼ۸����룬���������ļ۸�
            if (price > dp[0]) {
                val profit = price - dp[0]
                if (profit > dp[1]) {
                    dp[1] = profit
                }
            }
            //����۸�С�ڵ�����ͼ۸�
            else {
                dp[0] = price
            }
        }
        return dp[1]
    }


}