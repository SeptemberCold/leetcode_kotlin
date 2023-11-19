package page001

/**
 *
 * 题目: 位1的个数
 *
 * 描述: 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *      提示：
 *      请注意，在某些语言（如 Java）中，没有无符号整数类型。
 *      在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 *      在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在 示例 3 中，输入表示有符号整数 -3。
 * 限制: 输入必须是长度为 32 的 二进制串 。
 *
 * 链接: https://leetcode.cn/problems/number-of-1-bits/description/
 *
 */
class Leetcode191 {

    /**
     * 位运算
     * 132ms
     * 32.10MB
     */
    fun hammingWeight(n: Int): Int {
        var temp = n
        var sum = 0
        for (i in 0..31) {
            if (temp and 1 == 1) {
                sum += 1
            }
            temp = temp shr 1
        }
        return sum
    }

}