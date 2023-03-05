package page000

/**
 *
 * 题目: 回文数
 *
 * 描述: 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *      回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 限制: -231 <= x <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/palindrome-number/
 */
object Leetcode009 {

    /**
     * 转成字符串，然后用前一半的字符和后一半的字符相比较
     *
     * 执行用时：196 ms
     * 内存消耗：34.3 MB
     */
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        val loopLength = str.length / 2
        //抽出前一般的字符串和后面的比较 当不同的时候返回false
        for (i in 0..loopLength) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }

}