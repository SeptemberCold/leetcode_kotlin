package page008

/**
 *
 * 题目: 比较含退格的字符串
 *
 * 描述: 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 *      注意：如果对空文本输入退格字符，文本继续为空。
 *
 * 限制: 1 <= s.length, t.length <= 200
 *      s 和 t 只含有小写字母以及字符 '#'
 *
 * 链接: https://leetcode.cn/problems/backspace-string-compare/description/
 *
 */
class Leetcode844 {

    /**
     * 重构字符串
     * 时间：148ms
     * 内存：33.46MB
     */
    fun backspaceCompare(s: String, t: String): Boolean {
        val sChars = s.toCharArray()
        for (i in sChars.indices) {
            if (sChars[i] == '#') {
                sChars[i] = ' '
                for (j in i - 1 downTo 0) {
                    if (sChars[j] != ' ') {
                        sChars[j] = ' '
                        break
                    }
                }
            }
        }
        val tChars = t.toCharArray()
        for (i in tChars.indices) {
            if (tChars[i] == '#') {
                tChars[i] = ' '
                for (j in i - 1 downTo 0) {
                    if (tChars[j] != ' ') {
                        tChars[j] = ' '
                        break
                    }
                }
            }
        }
        val mS = StringBuilder()
        for (sChar in sChars) {
            if (sChar != ' ') mS.append(sChar)
        }
        val mT = StringBuilder()
        for (tChar in tChars) {
            if (tChar != ' ') mT.append(tChar)
        }
        return mS.toString() == mT.toString()
    }

}