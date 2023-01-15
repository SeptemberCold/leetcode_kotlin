package com.lin.leetcode.page018

/**
 * �滻�ַ����е���������
 * ����һ���ַ���s��������һЩ���Ŷԣ�ÿ�������а���һ�� �ǿյļ���
 * �ȷ�˵���ַ���"(name)is(age)yearsold"�У����������Ŷԣ��ֱ������"name" ��"age"��
 * ��֪��������Ӧ��ֵ����Щ��ϵ�ɶ�ά�ַ�������knowledge��ʾ������knowledge[ i ] = [key i, value i]����ʾ��key i��Ӧ��ֵΪvalue i��
 * ����Ҫ�滻 ���е����Ŷԡ������滻һ�����Ŷԣ����������ļ�Ϊkeyiʱ������Ҫ��
 * ��key i�������ö�Ӧ��ֵvalue i�滻��
 * ����� knowledge���޷���֪ĳ������Ӧ��ֵ������Ҫ��key i���������ʺ�"?"�滻������Ҫ���ţ�.
 * knowledge��ÿ�������ֻ�����һ�Ρ�s�в�����Ƕ�׵����š�
 * ���㷵���滻 �������ŶԺ�Ľ���ַ�����
 */
object Leetcode1807 {

    /**
     * ʹ�������滻
     * ���������ú�
     * ������ js�����������д���ͨ��leetcode��kotlin��javaȴ����
     */
    private fun evaluate01(s: String, knowledge: List<List<String>>): String {
        // ������ʽ��ȡ��key
        var result = s
        knowledge.forEach {
            if (result.contains("(${it[0]})")) {
                result = result.replace("(${it[0]})", it[1])
            }
        }
        return result.replace(Regex("\\([a-zA-Z]*\\)"), "?")
    }

    /**
     * ѭ��������ӵ���ʽ
     * ִ����ʱ��620 ms
     * �ڴ����ģ�95.8 MB
     */
    private fun evaluate02(s: String, knowledge: List<List<String>>): String {
        //knowledge�浽map��
        val keyValue = HashMap<String, String>()
        knowledge.forEach {
            keyValue[it[0]] = it[1]
        }
        //���ս��
        val result = StringBuilder()
        val charArray = s.toCharArray()
        //����ѭ��
        var index = 0
        while (index < charArray.size) {
            //�����ǰ���������� �ԽӼӵ�StringBuilder��
            if (charArray[index] != '(') {
                result.append(charArray[index])
            } else {
                //����������� �������ŵ������ż��char���뵽temp��
                val temp = StringBuilder()
                //��һ������һλ
                index += 1
                while (charArray[index] != ')') {
                    //�������ŵ������ż��char���뵽temp��
                    temp.append(charArray[index])
                    index += 1
                }
                //�ַ��滻
                if (keyValue.contains(temp.toString())) {
                    result.append(keyValue[temp.toString()])
                } else {
                    result.append("?")
                }
            }
            //��һ������һλ ������������һ������
            index += 1
        }
        return result.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = evaluate01(it.key, it.value)
            println("${it.key}->result=${result}")
        }
        println("=========================================")
        getTestData().forEach {
            val result = evaluate02(it.key, it.value)
            println("${it.key}->result=${result}")
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): Map<String, List<List<String>>> {
        val map = HashMap<String, List<List<String>>>()
        map["(name)is(age)yearsold"] = listOf(arrayListOf("name", "bob"), arrayListOf("age", "two"))
        map["hi(name)"] = listOf(arrayListOf("name", "bob"), arrayListOf("age", "two"))
        return map
    }

}