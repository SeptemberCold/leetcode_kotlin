package com.lin.leetcode.page023

/**
 * 解密信息
 * 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：
 * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
 * 将替换表与普通英文字母表对齐，形成对照表。
 * 按照对照表 替换 message 中的每个字母。
 * 空格 ' ' 保持不变。
 * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），
 * 据此，可以得到部分对照表（'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
 * 返回解密后的消息。
 */
object Leetcode2325 {

    /**
     * 执行用时：164 ms
     * 内存消耗：34.2 MB
     */
    private fun decodeMessage(key: String, message: String): String {
        val keyMap = HashMap<Char, Char>()
        var order = 0
        for (i in key) {
            if (i == ' ') continue
            if (!keyMap.containsKey(i)) {
                keyMap[i] = 'a' + order
                order++
            }
        }
        val answer = StringBuilder()
        for (c in message) {
            if (keyMap.containsKey(c)) {
                answer.append(keyMap[c])
            } else {
                answer.append(" ")
            }
        }
        return answer.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = decodeMessage(it.key, it.message)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<Data> {
        val array = ArrayList<Data>()
        array.add(Data("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"))
        return array
    }

    private class Data(val key: String, val message: String)

}