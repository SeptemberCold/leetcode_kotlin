package page014

/**
 *
 * 题目: 可获得的最大点数
 *
 * 描述: 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
 *      每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 *      你的点数就是你拿到手中的所有卡牌的点数之和。
 *      给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
 * 限制: 1 <= cardPoints.length <= 10^5
 *      1 <= cardPoints[i] <= 10^4
 *      1 <= k <= cardPoints.length
 *
 * 链接: https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/description/?envType=daily-question&envId=2023-12-03
 *
 */
class Leetcode1423 {

    /**
     * 滑动窗口
     * 352 ms
     * 52.52 MB
     */
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        //总数
        var count = 0
        //最小滑动窗口值
        var min = 0
        //滑动窗口的长度和总值
        val length = cardPoints.size - k
        var sum = 0
        for (i in cardPoints.indices) {
            //计算总数
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