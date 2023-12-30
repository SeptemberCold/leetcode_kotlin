package page011

import java.text.DateFormat
import java.text.SimpleDateFormat


/**
 *
 * 题目: 一周中的第几天
 *
 * 描述: 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 *      输入为三个整数：day、month 和 year，分别表示日、月、年。
 *      您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 * 限制: 给出的日期一定是在 1971 到 2100 年之间的有效日期。
 *
 * 链接: https://leetcode.cn/problems/day-of-the-week/description/?envType=daily-question&envId=2023-12-30
 *
 */
class Leetcode1185 {

    /**
     * 时间戳取模
     *
     * Leetcode上的时间戳计算好像有问题 是以1970-01-01 00:00:00作为标准的
     * 所以使用time = data.time可以得出正确答案
     *
     * 但标准时间戳从1970-01-01 08:00:00开始
     * 所以需要加上28800000 8小时的时间戳数才能计算成功
     *
     * 156 ms
     * 33.75 MB
     */
    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        val fmt: DateFormat = SimpleDateFormat("yyyy-MM-dd")
        val date = fmt.parse("${year}-${month}-${day}")
        val time = date.time + 28800000
        return when (((time / 86400000) % 7).toInt()) {
            0 -> "Thursday"
            1 -> "Friday"
            2 -> "Saturday"
            3 -> "Sunday"
            4 -> "Monday"
            5 -> "Tuesday"
            6 -> "Wednesday"
            else -> ""
        }
    }

}