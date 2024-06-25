package page004

/**
 *
 * 题目: 根据字符出现频率排序
 *
 * 描述: 给定一个字符串 s ，根据字符出现的 频率 对其进行 降序排序 。
 *      一个字符出现的 频率 是它出现在字符串中的次数。
 *      返回 已排序的字符串 。如果有多个答案，返回其中任何一个。
 *
 * 限制: 1 <= s.length <= 5 * 105
 *      s 由大小写英文字母和数字组成
 *
 * 链接: https://leetcode.cn/problems/sort-characters-by-frequency/description/
 *
 */
class Leetcode451 {

    /**
     * 模拟
     * 时间 246ms
     * 内存 38.44MB
     */
    fun frequencySort(s: String): String {
        val hashMap = HashMap<Char, Int>()
        val sb = StringBuilder()
        //索引
        for (c in s) {
            hashMap[c] = (hashMap[c] ?: 0) + 1
        }
        val charList = ArrayList<Char>()
        for ((key, _) in hashMap) {
            charList.add(key)
        }
        //排序
        charList.sortWith { a, b ->
            if (hashMap[a] == hashMap[b]) return@sortWith 0
            if (hashMap[a]!! > hashMap[b]!!) return@sortWith -1
            return@sortWith 1
        }
        //添加
        for (c in charList) {
            for (i in 0 until hashMap[c]!!) {
                sb.append(c)
            }
        }
        return sb.toString()
    }

}