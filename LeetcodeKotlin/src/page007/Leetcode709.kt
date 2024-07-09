package page007

/**
 *
 * 题目: 转换成小写字母
 *
 * 描述: 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
 *
 * 限制: 1 <= s.length <= 100
 *      s 由 ASCII 字符集中的可打印字符组成
 *
 * 链接: https://leetcode.cn/problems/to-lower-case/description/
 *
 */
class Leetcode709 {

    /**
     * 字符串加减
     * 时间：139ms
     * 内存：33.79MB
     */
    fun toLowerCase(s: String): String {

        val array = s.toCharArray()
        val gap = 'A' - 'a'
        for (i in array.indices) {
            if (array[i] in 'A'..'Z') {
                array[i] = array[i] - gap
            }
        }
        return String(array)
    }


}