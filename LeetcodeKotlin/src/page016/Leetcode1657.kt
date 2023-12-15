package page016

/**
 *
 * 题目: 确定两个字符串是否接近
 *
 * 描述: 如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 接近 ：
 *      操作 1：交换任意两个 现有 字符。
 *          例如，abcde -> aecdb
 *      操作 2：将一个 现有 字符的每次出现转换为另一个 现有 字符，并对另一个字符执行相同的操作。
 *          例如，aacabb -> bbcbaa（所有 a 转化为 b ，而所有的 b 转换为 a ）
 *      你可以根据需要对任意一个字符串多次使用这两种操作。
 *      给你两个字符串，word1 和 word2 。如果 word1 和 word2 接近 ，就返回 true ；否则，返回 false 。
 * 限制: 1 <= word1.length, word2.length <= 105
 *      word1 和 word2 仅包含小写英文字母
 *
 * 链接: https://leetcode.cn/problems/determine-if-two-strings-are-close/description/?envType=daily-question&envId=2023-11-30
 *
 */
class Leetcode1657 {


    /**
     * 哈希表统计
     * 416 ms
     * 40.15 MB
     */
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val word1Map = HashMap<Char, Int>()
        val word2Map = HashMap<Char, Int>()
        for (i in word1) {
            word1Map[i] = (word1Map[i] ?: 0) + 1
        }
        for (i in word2) {
            word2Map[i] = (word2Map[i] ?: 0) + 1
        }

        if (word1Map.size != word2Map.size) return false

        for (entity in word1Map) {
            if (word2Map[entity.key] == entity.value) {
                word2Map.remove(entity.key)
            } else {
                for (entity2 in word2Map) {
                    if (entity2.value == entity.value) {
                        word2Map[entity2.key] = word2Map[entity.key] ?: 0
                        word2Map.remove(entity.key)
                        break
                    }
                }
            }
        }

        return word2Map.size == 0
    }

}