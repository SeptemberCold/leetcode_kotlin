package page000

/**
 *
 * 题目: N 字形变换
 *
 * 描述: 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *      比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *      P   A   H   N
 *      A P L S I I G、
 *      Y   I   R
 *      之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。、
 *      请你实现这个将字符串进行指定行数变换的函数：
 *      string convert(string s, int numRows);
 * 限制: 1 <= s.length <= 1000
 *      s 由英文字母（小写和大写）、',' 和 '.' 组成
 *      1 <= numRows <= 1000
 *
 * 链接: https://leetcode.cn/problems/zigzag-conversion/description/
 *
 */
class Leetcode006 {

    /**
     * 标记
     * 时间 224ms
     * 内存 36.02MB
     */
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s
        val temp = HashMap<Int, StringBuilder>()
        var count = 0
        var count2 = false
        for (i in s.indices) {
            if (temp[count] == null) {
                val stb = StringBuilder()
                stb.append(s[i])
                temp[count] = stb
            } else {
                temp[count]?.append(s[i])
            }
            //标记转移
            if (count2) {
                when (count) {
                    1 -> {
                        count2 = false
                        count = 0
                    }
                    0 -> {
                        count2 = true
                        count = 1
                    }
                    else -> count--
                }
            } else {
                if (count == numRows - 1) {
                    count2 = true
                    count = 0.coerceAtLeast(numRows - 2)
                } else {
                    count++
                }
            }
        }
        val result = StringBuilder()
        for (i in 0 until numRows) {
            result.append(temp[i])
        }

        return result.toString()
    }

}