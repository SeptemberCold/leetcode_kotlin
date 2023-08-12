package page003

/**
 *
 * 题目: 赎金信
 *
 * 描述: 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *      如果可以，返回 true ；否则返回 false 。
 *      magazine 中的每个字符只能在 ransomNote 中使用一次。
 * 限制: 1 <= ransomNote.length, magazine.length <= 105
 *      ransomNote 和 magazine 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/ransom-note/description/
 *
 */
class Leetcode383 {

    /**
     * 哈希表
     * 时间 268ms
     * 内存 35.67mb
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val hash = HashMap<Char, Int>()
        for (c in magazine) {
            hash[c] = (hash[c] ?: 0) + 1
        }

        for (c in ransomNote) {
            val number = hash[c] ?: 0
            if (number == 0) {
                return false
            } else {
                hash[c] = number - 1
            }
        }
        return true
    }

}