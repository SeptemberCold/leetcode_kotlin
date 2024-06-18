package page022

import java.lang.StringBuilder

/**
 *
 * 题目: 价格减免
 *
 * 描述: 句子 是由若干个单词组成的字符串，单词之间用单个空格分隔，其中每个单词可以包含数字、小写字母、和美元符号 '$' 。如果单词的形式为美元符号后跟着一个非负实数，那么这个单词就表示一个 价格 。
 *      例如 "$100"、"$23" 和 "$6" 表示价格，而 "100"、"$" 和 "$1e5 不是。
 *      给你一个字符串 sentence 表示一个句子和一个整数 discount 。对于每个表示价格的单词，都在价格的基础上减免 discount% ，并 更新 该单词到句子中。所有更新后的价格应该表示为一个 恰好保留小数点后两位 的数字。
 *      返回表示修改后句子的字符串。
 *      注意：所有价格 最多 为  10 位数字。
 * 限制: 1 <= sentence.length <= 105
 *      sentence 由小写英文字母、数字、' ' 和 '$' 组成
 *      sentence 不含前导和尾随空格
 *      sentence 的所有单词都用单个空格分隔
 *      所有价格都是 正 整数且不含前导零
 *      所有价格 最多 为  10 位数字
 *      0 <= discount <= 100
 *
 * 链接: https://leetcode.cn/problems/apply-discount-to-prices/description/?envType=daily-question&envId=2024-06-18
 *
 */
class Leetcode2288 {

    /**
     * 模拟
     * 时间 708ms
     * 内存 59.91MB
     */
    fun discountPrices(sentence: String, discount: Int): String {
        val words = sentence.split(" ")
        val sb = StringBuilder()
        var isNumber: Boolean
        for (word in words) {
            //如果长度不足2位
            if (word.length < 2) {
                sb.append(word).append(" ")
                continue
            }
            //如果首位不是美元符号
            if (word[0] != '$') {
                sb.append(word).append(" ")
                continue
            }
            //检查是否是数字
            isNumber = true
            for (i in 1 until word.length) {
                if (word[i] !in '0'..'9') {
                    isNumber = false
                    break
                }
            }
            //不是数字
            if (!isNumber) {
                sb.append(word).append(" ")
                continue
            }
            //数字
            val number = word.substring(1, word.length).toDouble()
            val d = number - number * discount / 100
            val format = String.format("%.2f", d)
            sb.append("$").append(format).append(" ")
        }
        if (words.isNotEmpty()) {
            sb.deleteAt(sb.length - 1)
        }
        return sb.toString()
    }

}