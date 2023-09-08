package page026

/**
 *
 * 题目: 计算列车到站时间
 *
 * 描述: 给你一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正整数 delayedTime 表示列车延误的小时数。
 *      返回列车实际到站的时间。
 *      注意，该问题中的时间采用 24 小时制。
 * 限制: 1 <= arrivaltime < 24
 *      1 <= delayedTime <= 24
 *
 * 链接: https://leetcode.cn/problems/calculate-delayed-arrival-time/description/?envType=daily-question&envId=2023-09-07
 *
 */
class Leetcode2651 {

    /**
     * 不知道怎么评价这道题
     * 时间 132ms
     * 内存 32.02MB
     */
    fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int {
        return (arrivalTime + delayedTime) % 24
    }

}