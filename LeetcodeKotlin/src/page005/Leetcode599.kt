package page005

/**
 *
 * 题目: 两个列表的最小索引总和
 *
 * 描述: 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 *      你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。
 *
 * 限制: 1 <= list1.length, list2.length <= 1000
 *      1 <= list1[i].length, list2[i].length <= 30
 *      list1[i] 和 list2[i] 由空格 ' ' 和英文字母组成。
 *      list1 的所有字符串都是 唯一 的。
 *      list2 中的所有字符串都是 唯一 的。
 *
 * 链接: https://leetcode.cn/problems/minimum-index-sum-of-two-lists/description/
 *
 */
class Leetcode599 {


    /**
     * 建立双哈希表
     * 时间 292ms
     * 内存 37.26MB
     */
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        //建立第一个索引表
        val list1Map = HashMap<String, Int>()
        for (i in list1.indices) {
            list1Map[list1[i]] = i
        }
        //遍历并建立第二个索引表
        val result = HashMap<Int, ArrayList<String>>()
        for (i in list2.indices) {
            //如果list2有和list1一样的字段 计算他们的和加入到result中
            val j = list1Map[list2[i]]
            if (j != null) {
                val key = i + j
                val arrayList = result[key]
                if (arrayList == null) {
                    result[key] = arrayListOf(list2[i])
                } else {
                    arrayList.add(list2[i])
                }
            }
        }
        //从头开始找所以最小的
        for (i in 0..(list1.size + list2.size)) {
            val strings = result[i]
            if (strings != null) return strings.toTypedArray()
        }

        return arrayOf()
    }

}