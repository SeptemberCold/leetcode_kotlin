package com.lin.leetcode.page023

/**
 * ������Ϣ
 * �����ַ��� key �� message ���ֱ��ʾһ��������Կ��һ�μ�����Ϣ������ message �Ĳ������£�
 * ʹ�� key �� 26 ��Ӣ��Сд��ĸ��һ�γ��ֵ�˳����Ϊ�滻���е���ĸ ˳�� ��
 * ���滻������ͨӢ����ĸ����룬�γɶ��ձ�
 * ���ն��ձ� �滻 message �е�ÿ����ĸ��
 * �ո� ' ' ���ֲ��䡣
 * ���磬key = "happy boy"��ʵ�ʵļ�����Կ�������ĸ����ÿ����ĸ ����һ�Σ���
 * �ݴˣ����Եõ����ֶ��ձ�'h' -> 'a'��'a' -> 'b'��'p' -> 'c'��'y' -> 'd'��'b' -> 'e'��'o' -> 'f'����
 * ���ؽ��ܺ����Ϣ��
 */
object Leetcode2325 {

    /**
     * ִ����ʱ��164 ms
     * �ڴ����ģ�34.2 MB
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