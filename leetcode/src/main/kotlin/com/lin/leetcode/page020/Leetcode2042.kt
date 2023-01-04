package com.lin.leetcode.page020

/**
 *  检查句子中的数字是否递增
 *
 *  句子是由若干token组成的一个列表，token 间用单个空格分隔，句子没有前导或尾随空格。
 *  每个 token 要么是一个由数字 0-9 组成的不含前导零的 正整数，要么是一个由小写英文字母组成的单词 。
 *  示例，"a puppy has 2 eyes 4 legs" 是一个由 7 个 token 组成的句子："2" 和 "4" 是数字，其他像"puppy" 这样的 tokens 属于单词。
 *  给你一个表示句子的字符串 s ，你需要检查 s 中的 全部 数字是否从左到右严格递增（即，除了最后一个数字，s 中的 每个 数字都严格小于它 右侧 的数字）。
 *  如果满足题目要求，返回 true，否则，返回 false 。
 *
 */
object Leetcode2042 {


    /**
     * 执行用时：156 ms
     * 内存消耗：34.6 MB
     */
    private fun areNumbersAscending01(s: String): Boolean {
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

    /**
     * 执行用时：152 ms
     * 内存消耗：34.7 MB
     * 优化了一下 不用集合存储，但效果并不明显
     */
    private fun areNumbersAscending02(s: String): Boolean {
        //每个字符串分离
        val split = s.split(" ")
        var temp = ""
        split.forEach {
            //找出所有数字
            if (it < "a") {
                //检查长度相等时候的是否小于等于temp 长度不等的时候短于temp
                if (temp.length == it.length && temp >= it || temp.length > it.length) {
                    return false
                } else {
                    temp = it
                }
            }
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = areNumbersAscending01("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val b = areNumbersAscending01("1 box has 3 blue 4 red 6 green and 12 yellow marbles")
        val c = areNumbersAscending02("1 box has 1 blue 4 red 6 green and 12 yellow marbles")
        val d = areNumbersAscending02("1 box has 3 blue 4 red 6 green and 12 yellow marbles")
        println(a)
        println(b)
        println(c)
        println(d)
    }

}