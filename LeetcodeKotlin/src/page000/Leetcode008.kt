package page000

/**
 *
 * 题目: 字符串转换整数 (atoi)
 *
 * 描述: 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 *      函数 myAtoi(string s) 的算法如下：
 *      读入字符串并丢弃无用的前导空格
 *      检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 *      读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 *      将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 *      如果整数数超过 32 位有符号整数范围 [Int.MIN_VALUE,  Int.MAX_VALUE] ，需要截断这个整数，使其保持在这个范围内。
 *      具体来说，小于 Int.MIN_VALUE 的整数应该被固定为 Int.MIN_VALUE ，大于 Int.MAX_VALUE 的整数应该被固定为 Int.MAX_VALUE 。
 *      返回整数作为最终结果。
 *      注意：
 *          本题中的空白字符只包括空格字符 ' ' 。
 *          除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * 限制: 0 <= s.length <= 200
 *      s 由英文字母（大写和小写）、数字（0-9）、' '、'+'、'-' 和 '.' 组成
 *
 * 链接: https://leetcode.cn/problems/string-to-integer-atoi/description/
 *
 */
class Leetcode008 {


    /**
     * 条件判断
     * 时间 204ms
     * 内存 35.92MB
     */
    fun myAtoi(s: String): Int {
        //去掉空格
        val list = s.split(" ")
        for (i in list) {
            if (i.isEmpty()) continue
            val numberSb = StringBuilder()
            var isUp = true
            when (i[0]) {
                '+' -> isUp = true
                '-' -> isUp = false
                in '0'..'9' -> numberSb.append(i[0])
                else -> break
            }
            //添加数字
            for (j in 1 until i.length) {
                if (i[j] in '0'..'9') {
                    numberSb.append(i[j])
                } else {
                    break
                }
            }
            //转成int
            val numberStr = numberSb.toString()
            if (numberStr.isNotEmpty()) {
                val toDouble = if (isUp) numberStr.toDouble() else numberStr.toDouble() * -1
                if (toDouble < Int.MIN_VALUE) return Int.MIN_VALUE
                if (toDouble > Int.MAX_VALUE) return Int.MAX_VALUE
                return toDouble.toInt()
            }
            break
        }
        return 0
    }

}