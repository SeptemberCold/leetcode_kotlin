package page000

/**
 *
 * 题目: 罗马数字转整数
 *
 * 描述: 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *      例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 *      通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。
 *      数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 *      同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 *
 *      I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 *      X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 *      C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 *
 *      给定一个罗马数字，将其转换成整数。
 *
 *      字符          数值
 *      I             1
 *      V             5
 *      X             10
 *      L             50
 *      C             100
 *      D             500
 *      M             1000
 *
 * 限制: 1 <= s.length <= 15s
 *      仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
 *      题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
 *      题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
 *      IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
 *      关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。
 *
 * 链接: https://leetcode.cn/problems/roman-to-integer/
 *
 */
class Leetcode013 {

    /**
     * 枚举
     * 执行用时：300 ms
     * 内存消耗：38.8 MB
     */
    fun romanToInt(s: String): Int {
        var answer = 0
        //先找到6种特殊的字符
        //找到4
        val replace1 = s.replace("IV", "")
        if (replace1.length != s.length) answer += 4
        //找到9
        val replace2 = replace1.replace("IX", "")
        if (replace2.length != replace1.length) answer += 9
        //找到40
        val replace3 = replace2.replace("XL", "")
        if (replace2.length != replace3.length) answer += 40
        //找到90
        val replace4 = replace3.replace("XC", "")
        if (replace4.length != replace3.length) answer += 90
        //找到400
        val replace5 = replace4.replace("CD", "")
        if (replace4.length != replace5.length) answer += 400
        //找到900
        val replace6 = replace5.replace("CM", "")
        if (replace6.length != replace5.length) answer += 900

        //计算后续数值
        for (c in replace6) {
            answer += when (c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }

        //返回结果
        return answer
    }


}