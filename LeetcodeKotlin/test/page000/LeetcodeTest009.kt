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
object LeetcodeTest009 {

    @JvmStatic
    fun main(args: Array<String>) {
        val example = getExample()
        methodTest(example) { return@methodTest Leetcode009.isPalindrome(it) }
        methodTest(example) { return@methodTest Leetcode009.isPalindrome2(it) }
        methodTest(example) { return@methodTest Leetcode009.isPalindrome3(it) }
    }

    private fun methodTest(example: List<Int>, method: (x: Int) -> Boolean) {
        example.forEach {
            val isPalindrome = method(it)
            println("输入:x=${it}")
            println("输出:${isPalindrome}")
            println("====================")
        }
    }

    private fun getExample(): List<Int> {
        val examples = ArrayList<Int>()
        examples.add(121)
        examples.add(-121)
        examples.add(10)
        return examples
    }


}