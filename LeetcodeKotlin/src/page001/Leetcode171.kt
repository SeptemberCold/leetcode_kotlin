package page001

import kotlin.math.pow

/**
 *
 * 题目: Excel 表列序号
 *
 * 描述: 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 * 限制: 1 <= columnTitle.length <= 7
 *      columnTitle 仅由大写英文组成
 *      columnTitle 在范围 ["A", "FXSHRXW"] 内
 *
 * 链接: https://leetcode.cn/problems/excel-sheet-column-number/description/
 *
 */
class Leetcode171 {

    /**
     * 数学模拟
     * 时间 136ms
     * 内存 33.02MB
     */
    fun titleToNumber(columnTitle: String): Int {
        var sum = 0
        val length = columnTitle.length
        for (i in 0..length - 2) {
            val temp = (columnTitle[i] - 'A' + 1) * (26.0.pow(length - i - 1.0))
            sum += temp.toInt()
        }
        sum += (columnTitle[columnTitle.length - 1] - 'A' + 1)
        return sum
    }

}