package page003

/**
 *
 * 题目: 反转字符串
 *
 * 描述: 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *      不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 限制: 1 <= s.length <= 105
 *      s[i] 都是 ASCII 码表中的可打印字符
 *
 * 链接: https://leetcode.cn/problems/reverse-string/
 *
 */
class Leetcode344 {

    /**
     * 字符串缓存
     * 执行用时：316 ms
     * 内存消耗：42.1 MB
     */
    fun reverseString(s: CharArray) {
        val sb = StringBuilder()
        for (c in s.size - 1 downTo 0) {
            sb.append(s[c])
        }
        val str = sb.toString()

        for (i in str.indices) {
            s[i] = str[i]
        }
    }

    /**
     * 原地反转
     * 用时：226ms
     * 内存：50.07MB
     */
    fun reverseString2(s: CharArray){
        //i是左指针 s.length-1-i是右指针
        for (i in 0 until s.size / 2) {
            //第一步 s[i]负责存储两份数据  现在s[i]=a^b    s[s.length-1-i]=b
            s[i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
            //第二步 利用s[s.length-1-i]的数据解析出a,公式:a^b^b=a   现在s[i]=a^b    s[s.length-1-i]=a
            s[s.size - 1 - i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
            //最后再利用已解析处理的数据把另一份数据解析出来,公式:a^b^a=b  现在s[i]=b   s[s.length-1-i]=a
            s[i] = (s[i].code xor s[s.size - 1 - i].code).toChar()
        }
    }

}