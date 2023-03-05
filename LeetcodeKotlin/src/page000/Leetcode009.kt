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

    /**
     * int翻转比较
     *
     * 执行用时：228 ms
     * 内存消耗：34.2 MB
     */
    fun isPalindrome2(x: Int): Boolean {
        //负数直接判断
        if (x < 0) return false
        //缓存数 以1234为列 temp = 1234
        var temp = x
        //翻转数
        var turnOver = 0
        while (temp != 0) {
            //求出余数 remainder = 4 3 2 1
            val remainder = temp % 10
            //计算总和 turnOver = 4 43 432 4321
            turnOver = turnOver * 10 + remainder
            //剩余翻转的数 temp = 123 12 1 0
            temp /= 10
        }
        return turnOver == x
    }


}