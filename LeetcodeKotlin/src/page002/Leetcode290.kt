package page002

/**
 *
 * 题目: 单词规律
 *
 * 描述: 给定一种规律 pattern和一个字符串s，判断 s是否遵循相同的规律。
 *      这里的遵循指完全匹配，例如，pattern里的每个字母和字符串s中的每个非空单词之间存在着双向连接的对应规律。
 * 限制: 1 <= pattern.length <= 300
 *      pattern只包含小写英文字母
 *      1 <= s.length <= 3000
 *      s只包含小写英文字母和' '
 *      s不包含 任何前导或尾随对空格
 *      s中每个单词都被 单个空格 分隔
 * 链接: https://leetcode.cn/problems/word-pattern/
 *
 */
class Leetcode290 {

    /**
     * 哈希表
     * 执行用时：188 ms
     * 内存消耗：34.2 MB
     */
    fun wordPattern(pattern: String, s: String): Boolean {
        val array = s.split(" ")

        if (pattern.length != array.size) return false

        val map = HashMap<Char, String>()
        val map2 = HashMap<String, Char>()

        for (i in pattern.indices) {
            val m = map[pattern[i]]
            val n = map2[array[i]]
            if (m == null && n == null) {
                map[pattern[i]] = array[i]
                map2[array[i]] = pattern[i]
            } else if (m != null && n != null) {
                if (map[pattern[i]] != array[i] || map2[array[i]] != pattern[i]) {
                    return false
                }
            } else {
                return false
            }
        }
        return true
    }


}