package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/19/23:20
 * ���һ�����ʵĳ���
 * ����һ���ַ��� s�������ɵ�����ɣ�����ǰ����һЩ�ո��ַ�������
 * �����ַ����� ���һ�� ���ʵĳ��ȡ�
 * ������ָ������ĸ��ɡ��������κοո��ַ���������ַ�����
 */
object Leetcode058 {

    /**
     * ����ģ��
     * ִ����ʱ��200 ms
     * �ڴ����ģ�35.1 MB
     */
    private fun lengthOfLastWord(s: String): Int {
        val split = s.split(" ")
        if (split.isEmpty()) return 0
        for (i in split.size - 1 downTo 0) {
            if (split[i].isNotEmpty()) {
                return split[i].length
            }
        }
        return 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = lengthOfLastWord(it)
            println("answer=$answer")
        }
    }

    private fun getTestData(): List<String> {
        val example = ArrayList<String>()
        example.add("   fly me   to   the moon  ")
        return example
    }

}