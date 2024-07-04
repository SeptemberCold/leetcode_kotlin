package page005


/**
 *
 * 题目: 反转字符串中的单词 III
 *
 * 描述: 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 限制: 1 <= s.length <= 5 * 104
 *      s 包含可打印的 ASCII 字符。
 *      s 不包含任何开头或结尾空格。
 *      s 里 至少 有一个词。
 *      s 中的所有单词都用一个空格隔开。
 *
 * 链接: https://leetcode.cn/problems/reverse-words-in-a-string-iii/description/
 *
 */
class Leetcode557 {

    /**
     * 堆栈
     * 时间：264ms
     * 内存：39.71MB
     */
    fun reverseWords(s: String): String {
        val deque = ArrayDeque<Char>()
        val sb = StringBuilder()
        for (str in s) {
            if (str != ' ') {
                deque.add(str)
            } else {
                while (deque.isNotEmpty()) {
                    val char = deque.removeLast()
                    sb.append(char)
                }
                sb.append(' ')
            }
        }
        while (deque.isNotEmpty()) {
            val char = deque.removeLast()
            sb.append(char)
        }
        return sb.toString()
    }

}