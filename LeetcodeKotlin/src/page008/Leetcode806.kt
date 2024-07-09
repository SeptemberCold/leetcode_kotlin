package page008

/**
 *
 * 题目: 写字符串需要的行数
 *
 * 描述: 我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，
 *      如果我们在写某个字母的时候会使这行超过了100 个单位，那么我们应该把这个字母写到下一行。
 *      我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位，
 *      widths[1] 代表 'b' 需要的单位，...， widths[25] 代表 'z' 需要的单位。
 *      现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。
 *
 * 限制: 字符串 S 的长度在 [1, 1000] 的范围。
 *      S 只包含小写字母。
 *      widths 是长度为 26的数组。
 *      widths[i] 值的范围在 [2, 10]。
 *
 * 链接: https://leetcode.cn/problems/number-of-lines-to-write-string/description/
 *
 */
class Leetcode806 {

    /**
     * 模拟
     * 时间：159ms
     * 内存：34MB
     */
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var row = 1
        var sum = 0
        for (c in s) {
            val width = widths[c - 'a']
            sum += width
            if (sum > 100) {
                row += 1
                sum = width
            }
        }
        return intArrayOf(row, sum)
    }

}