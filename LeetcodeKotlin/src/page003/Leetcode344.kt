package page003

/**
 *
 * 题目: 反转字符串
 *
 * 描述: 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *      不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 限制: 1 <= s.length <= 105
 *      s[i] 都是 ASCII 码表中的可打印字符
 *
 * 链接: https://leetcode.cn/problems/reverse-string/
 *
 */
class Leetcode344 {

    /**
     * 字符串缓存
     * 执行用时：316 ms
     * 内存消耗：42.1 MB
     */
    fun reverseString(s: CharArray) {
        val sb = StringBuilder()
        for (c in s.size - 1 downTo 0) {
            sb.append(s[c])
        }
        val str = sb.toString()

        for (i in str.indices) {
            s[i] = str[i]
        }
    }

}