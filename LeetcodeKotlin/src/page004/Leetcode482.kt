package page004

import java.lang.StringBuilder

/**
 *
 * 题目: 密钥格式化
 *
 * 描述: 给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。你也会得到一个整数 k 。
 *      我们想要重新格式化字符串 s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，
 *      但仍然必须包含至少一个字符。
 *      此外，两组之间必须插入破折号，并且应该将所有小写字母转换为大写字母。
 *      返回 重新格式化的许可密钥 。
 *
 * 限制: 1 <= s.length <= 105
 *      s 只包含字母、数字和破折号 '-'.
 *      1 <= k <= 104
 *
 * 链接: https://leetcode.cn/problems/license-key-formatting/description/
 *
 */
class Leetcode482 {

    /**
     * 模拟
     * 时间 213ms
     * 内存 39.01MB
     */
    fun licenseKeyFormatting(s: String, k: Int): String {
        //清理原来的破折号
        val s1 = s.replace("-", "").uppercase()
        if (s1.isEmpty()) return ""
        //计算第一个单词的长度
        val start = s1.length % k
        val sb = StringBuilder()
        if (start != 0) {
            sb.append(s1.substring(0, start)).append("-")
        }
        for (i in start..<s1.length step k) {
            sb.append(s1.substring(i, i + k)).append("-")
        }
        return sb.substring(0, sb.length - 1)
    }


}