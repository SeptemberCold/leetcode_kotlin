package com.lin.leetcode.page021


/**
 *
 * @author lin
 * @date 2023/01/08/14:13
 *
 * ͳ�ư�������ǰ׺���ַ���
 * ����һ���ַ������� words ��һ���ַ��� pref ��
 * ���� words ���� pref ��Ϊ ǰ׺ ���ַ�������Ŀ��
 * �ַ��� s �� ǰ׺ ���� s ����һǰ�������ַ�����
 */
object Leetcode2185 {

    /**
     * ִ����ʱ��184 ms
     * �ڴ����ģ�35.6 MB
     */
    private fun prefixCount01(words: Array<String>, pref: String): Int {
        var result = 0
        words.forEach {
            if (it.startsWith(pref)) {
                result += 1
            }
        }
        return result
    }

    /**
     * ��Ԥ���� ����Ҳû�õ�����
     * ִ����ʱ��188 ms
     * �ڴ����ģ�35.4 MB
     */
    private fun prefixCount02(words: Array<String>, pref: String): Int {
        var result = 0
        for (word in words) {
            if (word < pref) continue
            if (word.startsWith(pref)) {
                result += 1
            }
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val prefixCount = prefixCount01(it.value, it.key)
            println("${it.key} = $prefixCount")
        }
        println("======================")
        getTestData().forEach {
            val prefixCount = prefixCount02(it.value, it.key)
            println("${it.key} = $prefixCount")
        }
    }


    private fun getTestData(): Map<String, Array<String>> {
        val map = HashMap<String, Array<String>>()
        map["at"] = arrayOf("pay", "attention", "practice", "attend")
        return map
    }

}