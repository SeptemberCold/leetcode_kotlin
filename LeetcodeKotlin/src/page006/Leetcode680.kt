package page006

/**
 *
 * 题目: 验证回文串 II
 *
 * 描述: 给你一个字符串 s，最多 可以从中删除一个字符。
 *      请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 *
 * 限制: 1 <= s.length <= 105
 *      s 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/robot-return-to-origin/
 *
 */
class Leetcode680 {

    /**
     * 双指针
     * 时间：282ms
     * 内存：39.05MB
     */
    fun validPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1
        while (start < end) {
            val i = s[start]
            val j = s[end]
            if (i != j) {
                var fair = 0
                //删除左边
                var mStart = 1 + start
                var mEnd = end
                while (mStart < mEnd) {
                    val m = s[mStart]
                    val n = s[mEnd]
                    if (m != n) fair += 1
                    //下一轮循环
                    mStart += 1
                    mEnd -= 1
                }
                if (fair == 0) return true
                //删除右边
                mStart = start
                mEnd = end - 1
                fair = 0
                while (mStart < mEnd) {
                    val m = s[mStart]
                    val n = s[mEnd]
                    if (m != n) fair += 1
                    //下一轮循环
                    mStart += 1
                    mEnd -= 1
                }
                return fair == 0
            }
            //下一轮循环
            start += 1
            end -= 1
        }
        return true
    }

}