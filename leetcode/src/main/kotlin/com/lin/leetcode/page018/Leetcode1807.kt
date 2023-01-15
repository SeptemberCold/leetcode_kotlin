package com.lin.leetcode.page018

/**
 * 替换字符串中的括号内容
 * 给你一个字符串s，它包含一些括号对，每个括号中包含一个 非空的键。
 * 比方说，字符串"(name)is(age)yearsold"中，有两个括号对，分别包含键"name" 和"age"。
 * 你知道许多键对应的值，这些关系由二维字符串数组knowledge表示，其中knowledge[ i ] = [key i, value i]，表示键key i对应的值为value i。
 * 你需要替换 所有的括号对。当你替换一个括号对，且它包含的键为keyi时，你需要：
 * 将key i和括号用对应的值value i替换。
 * 如果从 knowledge中无法得知某个键对应的值，你需要将key i和括号用问号"?"替换（不需要引号）.
 * knowledge中每个键最多只会出现一次。s中不会有嵌套的括号。
 * 请你返回替换 所有括号对后的结果字符串。
 */
object Leetcode1807 {

    /**
     * 使用正则替换
     * 这玩意慢得很
     * 特喵的 js能用正则两行代码通过leetcode，kotlin和java却不行
     */
    private fun evaluate01(s: String, knowledge: List<List<String>>): String {
        // 正则表达式获取的key
        var result = s
        knowledge.forEach {
            if (result.contains("(${it[0]})")) {
                result = result.replace("(${it[0]})", it[1])
            }
        }
        return result.replace(Regex("\\([a-zA-Z]*\\)"), "?")
    }

    /**
     * 循环遍历添加的形式
     * 执行用时：620 ms
     * 内存消耗：95.8 MB
     */
    private fun evaluate02(s: String, knowledge: List<List<String>>): String {
        //knowledge存到map里
        val keyValue = HashMap<String, String>()
        knowledge.forEach {
            keyValue[it[0]] = it[1]
        }
        //最终结果
        val result = StringBuilder()
        val charArray = s.toCharArray()
        //遍历循环
        var index = 0
        while (index < charArray.size) {
            //如果当前不是左括号 自接加到StringBuilder中
            if (charArray[index] != '(') {
                result.append(charArray[index])
            } else {
                //如果是左括号 把左括号到右括号间的char加入到temp中
                val temp = StringBuilder()
                //加一跳到下一位
                index += 1
                while (charArray[index] != ')') {
                    //把左括号到右括号间的char加入到temp中
                    temp.append(charArray[index])
                    index += 1
                }
                //字符替换
                if (keyValue.contains(temp.toString())) {
                    result.append(keyValue[temp.toString()])
                } else {
                    result.append("?")
                }
            }
            //加一跳到下一位 右括号在这里一起跳过
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
     * 获取测试用例
     */
    private fun getTestData(): Map<String, List<List<String>>> {
        val map = HashMap<String, List<List<String>>>()
        map["(name)is(age)yearsold"] = listOf(arrayListOf("name", "bob"), arrayListOf("age", "two"))
        map["hi(name)"] = listOf(arrayListOf("name", "bob"), arrayListOf("age", "two"))
        return map
    }

}