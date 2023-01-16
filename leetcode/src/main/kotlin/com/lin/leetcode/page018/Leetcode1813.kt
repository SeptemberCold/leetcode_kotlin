package com.lin.leetcode.page018

import kotlin.math.min

/**
 *
 * @author lin
 * @date 2023/01/16/20:54
 *
 * 句子相似性 III
 * 一个句子是由一些单词与它们之间的单个空格组成，且句子的开头和结尾没有多余空格。
 * 比方说，"Hello World"，"HELLO"，"hello world hello world"都是句子。
 * 每个单词都 只包含大写和小写英文字母。
 * 如果两个句子sentence1 和sentence2，可以通过往其中一个句子插入一个任意的句子（可以是空句子）而得到另一个句子，那么我们称这两个句子是 相似的。
 * 比方说，sentence1 = "Hello my name is Jane" 且sentence2 = "Hello Jane"，
 * 我们可以往 sentence2中"Hello" 和"Jane"之间插入"my name is"得到 sentence1。
 * 给你两个句子sentence1 和sentence2，如果sentence1 和sentence2 是相似的，
 * 请你返回true，否则返回false。
 */
object Leetcode1813 {

    /**
     * 暴力破解
     * 执行用时：184 ms
     * 内存消耗：35.3 MB
     * 麻耶，中等都能被暴力破解双100
     */
    private fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        //两个字符串以空格分隔
        val split1 = sentence1.split(" ")
        val split2 = sentence2.split(" ")
        //储存短句子
        val short: List<String>
        //储存长句子
        val long = HashMap<Int, String>()
        if (split1.size == split2.size) {
            return sentence1 == sentence2
        } else if (split1.size > split2.size) {
            split1.indices.forEach { long[it] = split1[it] }
            short = split2
        } else {
            split2.indices.forEach { long[it] = split2[it] }
            short = split1
        }
        var b = false
        short.indices.forEach {
            //短句子有单词长句子没有 直接可以跳过了
            if (!long.containsValue(short[it])) return false
            //判断前面的句子是否一样 不一样开始判断后面的句子是否一样
            if (short[it] != long[it] && !b) {
                //向后方遍历
                b = true
            }
            if (b) {
                if (short[it] != long[long.size - (short.size - it)]) {
                    return false
                }
            }
        }
        return true
    }

    /**
     * 双指针写法
     * 执行用时：204 ms
     * 内存消耗：35.1 MB
     * 思路差不多，先计算前面相似的长度，再计算后面相似的长度
     * 两个长度相加等于最短的句子就表示句子相似
     */
    private fun areSentencesSimilar2(sentence1: String, sentence2: String): Boolean {
        //两个字符串以空格分隔
        val split1 = sentence1.split(" ")
        val split2 = sentence2.split(" ")
        var i = 0
        var j = 0
        while (i < split1.size && i < split2.size && split1[i] == split2[i]) {
            i++
        }
        while (j < split1.size - i && j < split2.size - i && split1[split1.size - j - 1] == split2[split2.size - j - 1]) {
            j++
        }
        return i + j == min(split1.size, split2.size)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = areSentencesSimilar(it.key, it.value)
            println("result=${result}")
        }
        println("===========================")
        getTestData().forEach {
            val result = areSentencesSimilar2(it.key, it.value)
            println("result=${result}")
        }

    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): Map<String, String> {
        val map = HashMap<String, String>()
        map["My name is Haley"] = "My Haley"
        map["of"] = "A lot of words"
        map["Eating right now"] = "Eating"
        map["Luky"] = "Lucccky"
        return map
    }


}