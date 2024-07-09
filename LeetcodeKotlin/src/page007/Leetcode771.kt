package page007

/**
 *
 * 题目: 宝石与石头
 *
 * 描述: 给你一个字符串 jewels 代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。
 *      stones 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *      字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。
 *
 * 限制: 1 <= jewels.length, stones.length <= 50
 *      jewels 和 stones 仅由英文字母组成
 *      jewels 中的所有字符都是 唯一的
 *
 * 链接: https://leetcode.cn/problems/jewels-and-stones/description/
 *
 */
class Leetcode771 {

    /**
     * 哈希表统计
     * 时间：141ms
     * 内存：33.94MB
     */
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val hashMap = HashMap<Char, Int>()
        for (stone in stones) {
            hashMap[stone] = (hashMap[stone] ?: 0) + 1
        }
        var sum = 0
        for (jewel in jewels) {
            sum += (hashMap[jewel] ?: 0)
        }
        return sum
    }

}