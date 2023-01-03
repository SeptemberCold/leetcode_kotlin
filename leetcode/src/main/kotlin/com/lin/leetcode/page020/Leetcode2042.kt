package com.lin.leetcode.page020


object Leetcode2042 {


    private fun areNumbersAscending(s: String): Boolean {
        //每个字符串分离
        val split = s.split(" ")
        //找出所有数字
        val temp = ArrayList<String>()
        split.forEach {
            if (it < "a") {
                temp.add(it)
            }
        }
        //有约束temp不小于2 就不做size值检查了
        for (i in 0..temp.size - 2) {
            //字符串相等
            if (temp[i].length == temp[i + 1].length) {
                //判断大小 前一个小于后一个就继续循环
                if (temp[i] >= temp[i + 1]) {
                    return false
                }
            } else if (temp[i].length > temp[i + 1].length) {
                //如果字符串前一个字符串长度大于后一个字符串 直接判负
                return false
            }
            //剩下字符串前一个字符串长度小于后一个字符串 不做处理继续循环
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val b = areNumbersAscending("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val c = areNumbersAscending("1 box has 20 blue 4 red 6 green and 12 yellow marbles")
        println(b)
        println(c)
    }

}