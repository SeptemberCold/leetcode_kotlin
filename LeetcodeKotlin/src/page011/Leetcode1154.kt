package page011

import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 *
 * 题目: 一年中的第几天
 *
 * 描述: 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。返回该日期是当年的第几天。
 * 限制: date.length == 10
 *      date[4] == date[7] == '-'，其他的 date[i] 都是数字
 *      date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日
 *
 * 链接: https://leetcode.cn/problems/day-of-the-year/description/?envType=daily-question&envId=2023-12-31
 *
 */
class Leetcode1154 {

    /**
     * 时间戳
     * 516 ms
     * 40.82 MB
     */
    fun dayOfYear(date: String): Int {
        val fmt: DateFormat = SimpleDateFormat("yyyy-MM-dd")
        val year = date.split("-")[0]
        val startDate = fmt.parse("${year}-01-01").time
        val mDate = fmt.parse(date).time
        return ((mDate - startDate) / 86400000).toInt() + 1
    }

}