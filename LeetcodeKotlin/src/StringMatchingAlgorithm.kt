/**
 * 字符串匹配算法
 */
class StringMatchingAlgorithm {


    /**
     * 暴力的BF算法
     */
    fun bf(str1: String, str2: String): Boolean {
        var isSubstring: Boolean
        for (i in 0..str1.length - str2.length) {
            isSubstring = true
            for (j in str2.indices) {
                if (str1[i + j] != str2[j]) {
                    //不是子串
                    isSubstring = false
                    break
                }
            }
            if (isSubstring) return true
        }
        return false
    }

    /**
     * 不知道啥算法 自己想的 利用集合记录前缀匹配成功的下标
     */
    fun key(str1: String, str2: String): Boolean {
        //将空值处理一下
        if (str1.isEmpty() && str2.isNotEmpty()) return false
        if (str2.isEmpty()) return true
        //存储前缀匹配的索引
        val keys = ArrayList<Int>()
        val temp = ArrayList<Int>()
        //现在没有空值了 遍历获取第一个前缀的匹配索引
        for (i in str1.indices) {
            if (str1[i] == str2[0]) {
                keys.add(i)
            }
        }
        if (str2.length == 1) {
            return keys.isNotEmpty()
        }
        //从索引1开始检查 索引0已经匹配好了
        var index = 1
        while (keys.isNotEmpty()) {
            //从前缀匹配成功的索引遍历
            for (i in keys) {
                //检查是否在索引范围内
                if (i + 1 < str1.length) {
                    if (str1[i + 1] == str2[index]) {
                        temp.add(i + 1)
                    }
                }
            }
            //数据转存
            keys.clear()
            keys.addAll(temp)
            temp.clear()
            //用于匹配下一位
            index += 1
            //匹配到最后一位了 如果key值还有表示匹配成功
            if (index == str2.length) {
                return keys.isNotEmpty()
            }
        }
        return false
    }

    /**
     * 不知道啥算法 自己想的 利用集合记录前缀匹配成功的下标
     */
    fun key2(str1: String, str2: String): Boolean {
        //将空值处理一下
        if (str1.isEmpty() && str2.isNotEmpty()) return false
        if (str2.isEmpty()) return true

        val keys = ArrayList<Int>()
        for (i in 0 until str1.length - str2.length) {
            keys.add(i)
        }
        for (i in str2.indices) {
            val temp = HashSet<Int>()
            for (key in keys) {
                if (str1[key + i] != str2[i]) {
                    temp.add(key)
                }
            }
            keys.removeAll(temp)
        }
        return keys.isNotEmpty()
    }


    /**
     * kmp算法
     */
    fun kmp(haystack: String, needle: String): Boolean {
        //子串如果==0返回真
        if (needle.isEmpty()) return true
        var i = 0
        var j = 0
        //最长公共前缀标记表
        val next = nextBuilder(needle)
        while (i < haystack.length && j < needle.length) {
            //如果字符相同，指针移动到下一位
            if (haystack[i] == needle[j]) {
                i += 1
                j += 1
            }
            //如果字符不同 子字符串的指针移动到子字符串第一个有共同最长前缀的下标上
            else {
                //如果公共前缀下标等于-1表示没有公共前缀 从头比对下一个元素
                if (j == 0) {
                    i += 1
                } else {
                    j = next[j]
                }
            }
        }
        return j >= needle.length
    }

    /**
     * 构造next数组表
     */
    private fun nextBuilder(needle: String): IntArray {
        val m = needle.length
        //next数组表
        val next = IntArray(m)
        next[0] = -1
        var t = -1
        var i = 0

        while (i < m - 1) {
            if (t < 0 || needle[t] == needle[i]) {
                t += 1
                i += 1
                next[i] = t
            } else t = next[t]
        }
        return next
    }


}