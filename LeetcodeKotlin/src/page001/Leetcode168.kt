package page001

/**
 *
 * 题目: Excel表列名称
 *
 * 描述: 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 * 限制: 1 <= columnNumber <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/excel-sheet-column-title/description/
 *
 */
class Leetcode168 {

    /**
     * 数学模拟
     * 时间 140ms
     * 内存 31.95MB
     */
    fun convertToTitle(columnNumber: Int): String {
        val result = StringBuilder()

        var temp = columnNumber
        while (temp > 0) {
            val i = temp % 26
            if (i == 0) {
                result.append('Z')
                temp = temp / 26 - 1
            } else {
                result.append('A' + i - 1)
                temp /= 26
            }
        }
        val result2 = StringBuilder()
        for (i in result.length - 1 downTo 0) {
            val c = result[i]
            result2.append(c)
        }

        return result2.toString()
    }


}