package com.lin.leetcode.page018


object Leetcode1807 {

    /**
     * ʹ�������滻
     * ���������ú�
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


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = evaluate01(it.key, it.value)
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