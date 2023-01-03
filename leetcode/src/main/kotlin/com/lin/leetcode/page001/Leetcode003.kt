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
                var b = ""
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

    /**
     * 结果比较
     * 执行用时：188 ms
     * 内存消耗：35 MB
     */
    private fun lengthOfLongestSubstring02(s: String): Int {
        if (s.length == 1) return 1
        //用于存储结果
        var result = 0
        //用于计数
        var start = 0
        //转成数组
        val charArray = s.toCharArray()
        //遍历
        for (end in charArray.indices) {
            //对前面进行遍历
            for (i in start until end) {
                //如果前面的char与当前char存在相等 进行返回值处理
                if (charArray[i] == charArray[end]) {
                    if (result < end - start ) {
                        result = end - start
                    }
                    start = i + 1
                    break
                }
            }
        }
        if (result < s.length  - start ) {
            return s.length  - start
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val testData = getTestData()
        testData.forEach {
            val result = lengthOfLongestSubstring01(it)
            println("测试结果->${it}=${result}")
        }
        testData.forEach {
            val result = lengthOfLongestSubstring02(it)
            println("测试结果->${it}=${result}")
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("operwabcdaefgh123456")
        data.add("abcdrefgh")
        data.add("aaabcdrefgh")
        data.add(" ")
        data.add("au")
        return data
    }

}