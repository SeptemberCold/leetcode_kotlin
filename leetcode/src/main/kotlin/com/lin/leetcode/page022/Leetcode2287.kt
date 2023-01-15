package com.lin.leetcode.page022

/**
 * �����ַ��γ�Ŀ���ַ���
 * ���������±�� 0 ��ʼ���ַ��� s �� target ������Դ� s ȡ��һЩ�ַ����������ţ��õ������µ��ַ�����
 * �� s ��ȡ���ַ����������У����ؿ����γ� target �� ��� ��������
 */
object Leetcode2287 {

    /**
     * ִ����ʱ��152 ms
     * �ڴ����ģ�32.8 MB
     */
    private fun rearrangeCharacters(s: String, target: String): Int {
        //��������浽map��
        val map = HashMap<Char, Int>()
        for (c in target) {
            map[c] = if (map.contains(c)) map[c]!! + 1 else 1
        }
        //�������ַ��� ��ȡ��Ӧ�ַ�������
        val mapSum = HashMap<Char, Int>()
        for (c in s) {
            if (map.containsKey(c)) {
                mapSum[c] = if (mapSum.contains(c)) mapSum[c]!! + 1 else 1
            }
        }
        var result = s.length
        map.forEach { (t, u) ->
            if (mapSum.containsKey(t)) {
                val i = mapSum[t]!! / u
                if (result > i) result = i
            } else {
                return 0
            }
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = rearrangeCharacters(it.key, it.value)
            println("result->$result")
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): Map<String, String> {
        val data = HashMap<String, String>()
//        data["ilovecodingonleetcode"] = "code"
//        data["abbaccaddaeea"] = "aaaaa"
        data["lrnvlcqukanpdnluowenfxquitzryponxsikhciohyostvmkapkfpglzikitwiraqgchxnpryhwpuwpozacjhmwhjvslprqlnxrk"] =
            "woijih"
        return data
    }

}