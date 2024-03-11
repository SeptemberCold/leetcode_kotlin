package page021

/**
 *
 * 题目: 将标题首字母大写
 *
 * 描述: 给你一个字符串 title ，它由单个空格连接一个或多个单词组成，每个单词都只包含英文字母。请你按以下规则将每个单词的首字母 大写 ：
 *      如果单词的长度为 1 或者 2 ，所有字母变成小写。
 *      否则，将单词首字母大写，剩余字母变成小写。
 *      请你返回 大写后 的 title 。
 *
 * 限制: 1 <= title.length <= 100
 *      title 由单个空格隔开的单词组成，且不含有任何前导或后缀空格。
 *      每个单词由大写和小写英文字母组成，且都是 非空 的。
 *
 * 链接: https://leetcode.cn/problems/capitalize-the-title/description/
 *
 */
class Leetcode2129 {

    /**
     * 字符操作
     * 用时:203ms
     * 操作:37.25MB
     */
    fun capitalizeTitle(title: String): String {
        val strings = title.split(" ")
        val sb = StringBuilder()

        val len = 'A' - 'a'

        for (str in strings) {
            if (str.length < 3) {
                val mStr = str.lowercase()
                sb.append(mStr)
            } else {
                val mStr = str.lowercase()
                if (mStr[0] in 'A'..'Z') {
                    sb.append(mStr)
                } else {
                    val charArray = mStr.toCharArray()
                    charArray[0] = charArray[0] + len
                    sb.append(charArray)
                }
            }
            sb.append(" ")
        }
        sb.deleteAt(sb.length - 1)
        return sb.toString()
    }

}