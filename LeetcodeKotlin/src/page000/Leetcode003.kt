package page000

/**
 *
 * 题目:无重复字符的最长子串
 *
 * 描述: 给定一个字符串s,请你找出其中不含有重复字符的最长子串的长度。
 * 限制: 0 <= s.length <= 5 * 104
 *      s由英文字母、数字、符号和空格组成
 *
 * 链接: https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 *
 */
class Leetcode003 {

    /**
     * 滑动窗口加哈希表
     * 执行用时：204 ms
     * 内存消耗：34.6 MB
     */
    fun lengthOfLongestSubstring(s: String): Int {
        //key表示出现过的字符 value表示字符是否出现重复
        val hashMap = HashMap<Char, Int>()
        //答案
        var answer = 0
        var i = 0
        for (j in s.indices) {
            val index = hashMap[s[j]]
            //更新滑动窗口前索引
            if (index != null && i <= index) {
                i = index + 1
            }
            //判断滑动窗口长度
            if (j - i + 1 > answer) {
                answer = j - i + 1
            }
            //哈希存储
            hashMap[s[j]] = j
        }
        return answer
    }

}