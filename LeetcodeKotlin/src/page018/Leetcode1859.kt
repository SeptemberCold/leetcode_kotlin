package page018

/**
 *
 * 题目: 将句子排序
 *
 * 描述: 一个 句子 指的是一个序列的单词用单个空格连接起来，且开头和结尾没有任何空格。每个单词都只包含小写或大写英文字母。
 *      我们可以给一个句子添加 从 1 开始的单词位置索引 ，并且将句子中所有单词 打乱顺序 。
 *      比方说，句子 "This is a sentence" 可以被打乱顺序得到 "sentence4 a3 is2 This1" 或者 "is2 sentence4 This1 a3" 。
 *      给你一个 打乱顺序 的句子 s ，它包含的单词不超过 9 个，请你重新构造并得到原本顺序的句子。
 * 限制: 2 <= s.length <= 200
 *      s 只包含小写和大写英文字母、空格以及从 1 到 9 的数字。
 *      s 中单词数目为 1 到 9 个。
 *      s 中的单词由单个空格分隔。
 *      s 不包含任何前导或者后缀空格。
 *
 * 链接: https://leetcode.cn/problems/sorting-the-sentence/description/
 *
 */
class Leetcode1859 {

    /**
     * 哈希表
     * 时间 188ms
     * 内存 33.94mb
     */
    fun sortSentence(s: String): String {
        val array = s.split(" ")
        val map = HashMap<Int, String>()
        for (item in array) {
            map[item[item.length - 1].code - 48] = item.substring(0, item.length - 1)
        }
        val sb = StringBuilder()
        for (i in 1..9) {
            if (map[i] != null) {
                sb.append(map[i]).append(" ")
            } else break
        }
        if (sb.isEmpty()) return ""
        return sb.substring(0, sb.length - 1)
    }

}