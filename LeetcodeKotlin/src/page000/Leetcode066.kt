package page000

/**
 *
 * 题目: 加一
 *
 * 描述: 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *      最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *      你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 限制: 1 <= digits.length <= 100
 *      0 <= digits[i] <= 9
 *
 * 链接: https://leetcode.cn/problems/plus-one/
 *
 */
class Leetcode066 {


    /**
     * 倒序遍历
     * 执行用时：160 ms
     * 内存消耗：33.4 MB
     */
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            val j = digits[i] + 1
            //如果计算结束 直接返回
            if (j < 10) {
                digits[i] = digits[i] + 1
                return digits
            } else {
                digits[i] = 0
            }
        }
        //数组扩容 如果都进位到了首位 后面都是0 比如999+1=1000
        val result = IntArray(digits.size + 1) { 0 }
        result[0] = 1
        return result
    }

}