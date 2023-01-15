package com.lin.leetcode.page022

/**
 * 重排字符形成目标字符串
 * 给你两个下标从 0 开始的字符串 s 和 target 。你可以从 s 取出一些字符并将其重排，得到若干新的字符串。
 * 从 s 中取出字符并重新排列，返回可以形成 target 的 最大 副本数。
 */
object Leetcode2287 {

    /**
     * 执行用时：152 ms
     * 内存消耗：32.8 MB
     */
    private fun rearrangeCharacters(s: String, target: String): Int {
        //遍历对象存到map中
        val map = HashMap<Char, Int>()
        for (c in target) {
            map[c] = if (map.contains(c)) map[c]!! + 1 else 1
        }
        //遍历总字符串 获取对应字符的总数
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
     * 获取测试用例
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