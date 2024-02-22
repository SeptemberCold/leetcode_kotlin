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
     * kmp算法
     */
    fun kmp(str1: String, str2: String): Boolean {
        //TODO
        return false
    }


}