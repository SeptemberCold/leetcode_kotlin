package page000

/**
 *
 * 题目: 二进制求和
 *
 * 描述: 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 * 限制: 1 <= a.length, b.length <= 104
 *      a 和 b 仅由字符 '0' 或 '1' 组成
 *      字符串如果不是 "0" ，就不含前导零
 *
 * 链接: https://leetcode.cn/problems/add-binary/
 *
 */
class Leetcode067 {

    /**
     * 字符串判断
     * 执行用时：152 ms
     * 内存消耗：33.9 MB
     */
    fun addBinary(a: String, b: String): String {
        val s1 = if (a.length > b.length) a else b
        val s2 = if (a.length > b.length) b else a
        val sb = StringBuilder()
        var add = false
        //两个数据进制相加
        for (i in s1.length - 1 downTo 0) {
            val s2Index = s2.length - s1.length + i
            //两个都是0
            if (s1[i] == '0' && s2[s2Index] == '0') {
                sb.append(if (add) '1' else '0')
                add = false
            }
            //有一个是1 另一个是0
            else if ((s1[i] == '1' && s2[s2Index] == '0') || (s1[i] == '0' && s2[s2Index] == '1')) {
                if (add) {
                    sb.append('0')
                } else {
                    sb.append('1')
                }
            }
            //两个都是1
            else if ((s1[i] == '1' && s2[s2Index] == '1')) {
                sb.append(if (add) '1' else '0')
                add = true
            }
            if (s2Index == 0) break
        }
        //进制处理
        for (i in s1.length - s2.length - 1 downTo 0) {
            if (s1[i] == '0' && add) {
                sb.append('1')
                add = false
            } else if (s1[i] == '1' && add) {
                sb.append('0')
                add = true
            } else if (!add) {
                sb.append(s1[i])
            }
        }
        //头部添加
        if (add) sb.append('1')
        //翻转
        val result = StringBuilder()
        for (i in sb.length - 1 downTo 0) {
            result.append(sb[i])
        }
        return result.toString()
    }

}