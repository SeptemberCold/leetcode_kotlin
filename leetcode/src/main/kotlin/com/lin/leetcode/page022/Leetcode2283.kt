package com.lin.leetcode.page022

/**
 * 判断一个数的数字计数是否等于数位的值
 * 给你一个下标从 0开始长度为 n的字符串num，它只包含数字。
 * 如果对于 每个0 <= i < n的下标i，
 * 都满足数位i在 num中出现了num[ i ]次，
 * 那么请你返回true，否则返回false.
 */
object Leetcode2283 {

    /**
     * 力扣的kotlin支持落后，
     * 不支持char类型的digitToInt方法
     * 可将char类型转成string类型在转int类型
     * 执行用时：148 ms
     * 内存消耗：34.4 MB
     */
    private fun digitCount(num: String): Boolean {
        val charArray = num.toCharArray()
        //计数map
        val map = HashMap<Int, Int>()
        //统计没种数字出现的次数
        for (char in charArray) {
            //获取数字
            val toInt = char.digitToInt()
            //数据填充
            if (map.containsKey(toInt)) {
                map[toInt]?.apply {
                    map[toInt] = this + 1
                }
            } else {
                map[toInt] = 1
            }
        }
        //如果有一个数对不上 返回false
        for (i in charArray.indices) {
            //获取数字
            val toInt = charArray[i].digitToInt()
            if (map.containsKey(i)) {
                map[i]?.apply { if (this != toInt) return false }
            } else {
                if (toInt != 0) return false
            }
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = digitCount(it)
            println("${it}=${result}")
        }
    }

    /**
     * 获取测试用例
     */
    private fun getTestData(): List<String> {
        val data = ArrayList<String>()
        data.add("123456")
        data.add("1210")
        data.add("11315")
        data.add("88458")
        data.add("66872")
        return data
    }

}