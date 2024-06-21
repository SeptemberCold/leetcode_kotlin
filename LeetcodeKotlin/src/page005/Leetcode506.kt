package page005

/**
 *
 * 题目: 相对名次
 *
 * 描述: 给你一个长度为 n 的整数数组 score ，其中 score[ i ] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
 *      运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
 *      名次第 1 的运动员获金牌 "Gold Medal" 。
 *      名次第 2 的运动员获银牌 "Silver Medal" 。
 *      名次第 3 的运动员获铜牌 "Bronze Medal" 。
 *      从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
 *      使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
 *
 * 限制: n == score.length
 *      1 <= n <= 104
 *      0 <= score[i] <= 106
 *      score 中的所有值 互不相同
 *
 * 链接: https://leetcode.cn/problems/relative-ranks/description/
 *
 */
class Leetcode506 {

    /**
     * 哈希 排序
     * 时间 243ms
     * 内存 40.11MB
     */
    fun findRelativeRanks(score: IntArray): Array<String> {
        val answer = Array(score.size) { "" }
        val hashMap = HashMap<Int, Int>()
        for (i in score.indices) {
            hashMap[score[i]] = i
        }
        score.sortDescending()
        for (i in score.indices) {
            val str: String = if (i > 2) {
                "${i + 1}"
            } else {
                when (i) {
                    0 -> "Gold Medal"
                    1 -> "Silver Medal"
                    2 -> "Bronze Medal"
                    else -> ""
                }
            }
            val index = hashMap[score[i]]!!
            answer[index] = str
        }
        return answer
    }

}