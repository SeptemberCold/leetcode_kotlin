package page.lcp

/**
 *
 * 题目:气温变化趋势
 *
 * 描述: 力扣城计划在两地设立「力扣嘉年华」的分会场，气象小组正在分析两地区的气温变化趋势，
 *      对于第 i ~ (i+1) 天的气温变化趋势，将根据以下规则判断：
 *      若第 i+1 天的气温 高于 第 i 天，为 上升 趋势
 *      若第 i+1 天的气温 等于 第 i 天，为 平稳 趋势
 *      若第 i+1 天的气温 低于 第 i 天，为 下降 趋势
 *      已知 temperatureA[i] 和 temperatureB[i] 分别表示第 i 天两地区的气温。
 *      组委会希望找到一段天数尽可能多，且两地气温变化趋势相同的时间举办嘉年华活动。
 *      请分析并返回两地气温变化趋势相同的最大连续天数。
 *
 * 限制: 2 <= temperatureA.length == temperatureB.length <= 1000
 *      -20 <= temperatureA[i], temperatureB[i] <= 40
 *
 * 链接: https://leetcode.cn/problems/6CE719/description/?envType=daily-question&envId=2024-06-21
 *
 */
class LeetcodeLcp61 {

    /**
     * 模拟
     *
     * 执行用时：181 ms
     * 内存消耗：38.17 MB
     */
    fun temperatureTrend(temperatureA: IntArray, temperatureB: IntArray): Int {
        //相同趋势的连续天时
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