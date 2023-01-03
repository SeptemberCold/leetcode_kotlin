package com.lin.leetcode.page001

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 */
object Leetcode003 {


    /**
     * 集合方法
     * 执行用时：872 ms
     * 内存消耗：55.8 MB
     */
    private fun lengthOfLongestSubstring01(s: String): Int {
        val all = ArrayList<String>()
        val temp = ArrayList<Char>()
        for (c in s) {
            val contains = temp.contains(c)
            if (!contains) {
                temp.add(c)
            } else {
                var str = ""
                var b= ""
                for (tempC in temp) {
                    str += tempC
                }
                for (tempC in temp) {
                    if (tempC != c) {
                        b += tempC
                    } else {
                        b += tempC
                        break
                    }
                }
                all.add(str)
                temp.removeAll(b.toCharArray().toList())
                temp.add(c)
            }
        }
        var str = ""
        for (tempC in temp) {
            str += tempC
        }
        all.add(str)
        var i = 0
        for (string in all) {
            if (string.length > i) {
                i = string.length
            }
        }
        return i
    }




    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        testData.forEach {
            val result = lengthOfLongestSubstring01(it)
            println("测试结果->${it}=${result}")
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("operwabcdaefgh")
//        data.add("abcdrefgh")
        return data
    }

}