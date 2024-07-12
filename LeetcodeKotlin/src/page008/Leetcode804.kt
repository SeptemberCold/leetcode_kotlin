package page008

import java.lang.StringBuilder

/**
 *
 * 题目: 唯一摩尔斯密码词
 *
 * 描述: 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如:
 *      'a' 对应 ".-" ，
 *      'b' 对应 "-..." ，
 *      'c' 对应 "-.-." ，以此类推。
 *      为了方便，所有 26 个英文字母的摩尔斯密码表如下：
 *      [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
 *      "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *      给你一个字符串数组 words ，每个单词可以写成每个字母对应摩尔斯密码的组合。
 *      例如，"cab" 可以写成 "-.-..--..." ，(即 "-.-." + ".-" + "-..." 字符串的结合)。我们将这样一个连接过程称作 单词翻译 。
 *      对 words 中所有单词进行单词翻译，返回不同 单词翻译 的数量。
 *
 * 限制: 1 <= words.length <= 100
 *      1 <= words[i].length <= 12
 *      words[i] 由小写英文字母组成
 *
 * 链接: https://leetcode.cn/problems/unique-morse-code-words/description/
 *
 */
class Leetcode804 {

    private val array = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    /**
     * 哈希
     * 时间：154ms
     * 内存：32.48MB
     */
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val set = HashSet<String>()
        val sb = StringBuilder()
        for (word in words) {
            for (c in word) {
                sb.append(array[c - 'a'])
            }
            set.add(sb.toString())
            sb.clear()
        }
        return set.size
    }

}