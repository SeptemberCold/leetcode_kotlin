package page005

/**
 *
 * 题目: 分糖果
 *
 * 描述: Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[ i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
 *      医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。
 *      Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
 *      给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的 最多 种类数。
 *
 * 限制: n == candyType.length
 *      2 <= n <= 104
 *      n 是一个偶数
 *      -105 <= candyType[i] <= 105
 *
 * 链接: https://leetcode.cn/problems/distribute-candies/description/
 *
 */
class Leetcode575 {

    /**
     * 哈希表
     * 时间：548ms
     * 内存：41.96MB
     */
    fun distributeCandies(candyType: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        for (i in candyType) {
            hashMap[i] = 1
        }
        return hashMap.size.coerceAtMost(candyType.size / 2)
    }


}