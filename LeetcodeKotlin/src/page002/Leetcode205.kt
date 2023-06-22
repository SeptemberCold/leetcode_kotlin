package page002

/**
 *
 * 题目: 同构字符串
 *
 * 描述: 给定两个字符串s和t，判断它们是否是同构的。
 *      如果s中的字符可以按某种映射关系替换得到t，那么这两个字符串是同构的。
 *      每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * 限制: 1 <= s.length <= 5 * 104
 *      t.length == s.length
 *      s 和 t 由任意有效的 ASCII 字符组成
 *
 * 链接: https://leetcode.cn/problems/isomorphic-strings/
 *
 */
class Leetcode205 {


    /**
     * 双哈希表
     * 执行用时：200 ms
     * 内存消耗：35.8 MB
     */
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map1 = HashMap<Char, Char>()
        val map2 = HashMap<Char, Char>()
        for (i in s.indices) {
            val x = s[i]
            val y = t[i]
            //两个哈希表都是空的 赋值
            if (map1[x] == null && map2[y] == null) {
                map1[x] = y
                map2[y] = x
            }
            //只有一个哈希表示空的 映射失败
            else if ((map1[x] != null && map2[y] == null) || (map1[x] == null && map2[y] != null)) {
                return false
            }
            //两个哈希表不为空 映射判断
            else {
                if (map1[x] != y) return false
            }
        }
        return true
    }

}