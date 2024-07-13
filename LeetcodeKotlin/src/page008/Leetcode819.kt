package page008

/**
 *
 * 题目: 最常见的单词
 *
 * 描述: 给你一个字符串 paragraph 和一个表示禁用词的字符串数组 banned ，
 *      返回出现频率最高的非禁用词。题目数据 保证 至少存在一个非禁用词，且答案 唯一 。
 *      paragraph 中的单词 不区分大小写 ，答案应以 小写 形式返回。
 *
 * 限制: 1 <= paragraph.length <= 1000
 *      paragraph 由英文字母、空格 ' '、和以下符号组成："!?',;."
 *      0 <= banned.length <= 100
 *      1 <= banned[i].length <= 10
 *      banned[i] 仅由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/number-of-lines-to-write-string/description/
 *
 */
class Leetcode819 {

    /**
     * 哈希表
     * 时间：227ms
     * 内存：38.70MB
     */
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        //标点清理
        var temp = paragraph.replace(".", " ")
        temp = temp.replace(",", " ")
        temp = temp.replace("!", " ")
        temp = temp.replace("?", " ")
        temp = temp.replace(";", " ")
        temp = temp.replace("'", " ")
        //记录单词出现的次数
        val strings = temp.split(" ")
        val hashMap = HashMap<String, Int>()
        for (str in strings) {
            if (str.isNotEmpty()) {
                val s = str.lowercase()
                hashMap[s] = (hashMap[s] ?: 0) + 1
            }
        }
        //检查出现最多的单词
        var answer = ""
        var count = 0
        for ((key, value) in hashMap) {
            if (banned.contains(key)) continue
            if (value > count) {
                count = value
                answer = key
            }
        }
        return answer
    }

}