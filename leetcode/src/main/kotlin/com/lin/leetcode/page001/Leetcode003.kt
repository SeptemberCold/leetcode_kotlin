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
     * ����Ƚ�
     * ִ����ʱ��188 ms
     * �ڴ����ģ�35 MB
     */
    private fun lengthOfLongestSubstring02(s: String): Int {
        if (s.length == 1) return 1
        //���ڴ洢���
        var result = 0
        //���ڼ���
        var start = 0
        //ת������
        val charArray = s.toCharArray()
        //����
        for (end in charArray.indices) {
            //��ǰ����б���
            for (i in start until end) {
                //���ǰ���char�뵱ǰchar������� ���з���ֵ����
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
            println("���Խ��->${it}=${result}")
        }
        testData.forEach {
            val result = lengthOfLongestSubstring02(it)
            println("���Խ��->${it}=${result}")
        }
    }

    /**
     * ��ȡ��������
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