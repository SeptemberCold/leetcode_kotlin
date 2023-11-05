package page001

/**
 *
 * 题目: 重复的DNA序列
 *
 * 描述: DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。
 *      例如，"ACGAATTCCG" 是一个 DNA序列 。
 *      在研究 DNA 时，识别 DNA 中的重复序列非常有用。
 *      给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。
 * 限制: 0 <= s.length <= 105
 *      s[i]=='A'、'C'、'G' or 'T'
 *
 * 链接: https://leetcode.cn/problems/repeated-dna-sequences/description/?envType=daily-question&envId=2023-11-05
 *
 */
class Leetcode187 {

    /**
     * 哈希表
     * 时间 292ms
     * 内存 45.70MB
     */
    fun findRepeatedDnaSequences(s: String): List<String> {
        if (s.length <= 10) return ArrayList()
        //将所有长度10的子字符串加入哈希表
        val hashMap = HashMap<String, Int>()
        for (i in 0..s.length - 10) {
            val substring = s.substring(i, i + 10)
            hashMap[substring] = (hashMap[substring] ?: 0) + 1
        }
        //遍历找到出现不止一次字符串
        val answer = ArrayList<String>()
        for (entry in hashMap) {
            if (entry.value >= 2) {
                answer.add(entry.key)
            }
        }
        return answer
    }

}