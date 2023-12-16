package page003

/**
 *
 * 题目: 反转字符串中的元音字母
 *
 * 描述: 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *      元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
 * 限制: 1 <= s.length <= 3 * 105
 *      s 由 可打印的 ASCII 字符组成
 *
 * 链接: https://leetcode.cn/problems/reverse-vowels-of-a-string/description/
 *
 */
class Leetcode345 {

    /**
     * 双指针
     * 224 ms
     * 39.49 MB
     */
    fun reverseVowels(s: String): String {
        val array = s.toCharArray()

        var index = 0
        var end = array.size - 1

        val temp = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        while (index < end) {
            val c1 = array[index]
            val c2 = array[end]
            //反转
            if (c1 in temp && c2 in temp) {
                array[index] = c2
                array[end] = c1
                index += 1
                end -= 1
            }
            //前指针前进
            else if (c2 in temp) {
                index += 1
            }
            //后指针前进
            else if (c1 in temp) {
                end -= 1
            }
            //双指针都前进
            else {
                index += 1
                end -= 1
            }
        }
        return String(array)
    }

}