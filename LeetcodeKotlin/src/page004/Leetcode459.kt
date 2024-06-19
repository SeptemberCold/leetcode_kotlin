package page004

/**
 *
 * 题目: 重复的子字符串
 *
 * 描述: 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 *
 * 限制: 1 <= s.length <= 104
 *      s 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/repeated-substring-pattern/description/
 *
 */
class Leetcode459 {

    /**
     * 暴力枚举
     * 时间 265ms
     * 内存 38.65MB
     */
    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.length == 1) return false

        for (i in 1..(s.length / 2)) {
            //没法整除 不处理
            if (s.length % i != 0) {
                continue
            }
            val substring = s.substring(0, i)
            val array = s.split(substring)
            var allEmpty = true
            for (j in array){
                if (j.isNotEmpty()) {
                    allEmpty = false
                    break
                }
            }
            if (allEmpty) return true
        }
        return false
    }

}