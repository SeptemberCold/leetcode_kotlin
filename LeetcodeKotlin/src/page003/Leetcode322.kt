package page003

/**
 *
 * ��Ŀ: ��Ǯ�һ�
 *
 * ����: ����һ���������� coins ����ʾ��ͬ����Ӳ�ң��Լ�һ������ amount ����ʾ�ܽ�
 *      ���㲢���ؿ��Դճ��ܽ������� ���ٵ�Ӳ�Ҹ��� �����û���κ�һ��Ӳ�����������ܽ����� -1 ��
 *      �������Ϊÿ��Ӳ�ҵ����������޵ġ�
 *
 * ����: 1 <= coins.length <= 12
 *      1 <= coins[i] <= 231 - 1
 *      0 <= amount <= 104
 *
 * ����: https://leetcode.cn/problems/coin-change/description/
 *
 */
class Leetcode322 {

    /**
     * ��̬�滮
     * ʱ�䣺169ms
     * �ڴ棺35.65MB
     */
    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0
        //����dp����
        val dp = IntArray(amount + 1)
        //��¼��Сֵ����
        for (coin in coins) {
            if (coin < amount) {
                dp[coin] = 1
                continue
            }
            if (coin == amount) {
                return 1
            }
        }
        for (i in 1..amount) {
            if (dp[i] == 1) continue
            var min = Int.MAX_VALUE
            for (coin in coins) {
                if (i - coin > 0) {
                    val count = dp[i - coin]
                    if (count == -1) continue
                    if (count + 1 < min) {
                        min = count + 1
                    }
                }
            }
            dp[i] = if (min == Int.MAX_VALUE) -1 else min
        }

        return dp[amount]
    }


}