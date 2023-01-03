package com.lin.leetcode.page001

/**
 * ����һ���ַ��� s �������ҳ����в������ظ��ַ��� ��Ӵ��ĳ��ȡ�
 */
object Leetcode003 {


    /**
     * ���Ϸ���
     * ִ����ʱ��872 ms
     * �ڴ����ģ�55.8 MB
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
            println("���Խ��->${it}=${result}")
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("operwabcdaefgh")
//        data.add("abcdrefgh")
        return data
    }

}