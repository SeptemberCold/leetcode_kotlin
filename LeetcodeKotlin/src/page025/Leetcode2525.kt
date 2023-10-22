package page025

/**
 *
 * 题目: 根据规则将箱子分类
 *
 * 描述: 给你四个整数 length ，width ，height 和 mass ，分别表示一个箱子的三个维度和质量，请你返回一个表示箱子 类别 的字符串。
 *      如果满足以下条件，那么箱子是 "Bulky" 的：
 *          箱子 至少有一个 维度大于等于 104 。
 *          或者箱子的 体积 大于等于 109 。
 *          如果箱子的质量大于等于 100 ，那么箱子是 "Heavy" 的。
 *          如果箱子同时是 "Bulky" 和 "Heavy" ，那么返回类别为 "Both" 。
 *          如果箱子既不是 "Bulky" ，也不是 "Heavy" ，那么返回类别为 "Neither" 。
 *          如果箱子是 "Bulky" 但不是 "Heavy" ，那么返回类别为 "Bulky" 。
 *          如果箱子是 "Heavy" 但不是 "Bulky" ，那么返回类别为 "Heavy" 。
 *          注意，箱子的体积等于箱子的长度、宽度和高度的乘积。
 * 限制: 1 <= length, width, height <= 105
 *      1 <= mass <= 103
 *
 * 链接: https://leetcode.cn/problems/categorize-box-according-to-criteria/description/?envType=daily-question&envId=2023-10-20
 *
 */
class Leetcode2525 {

    /**
     * 数学计算
     * 时间 132ms
     * 内存 32.24MB
     */
    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        var result = ""
        if (length >= 10000 || width >= 10000 || height >= 10000 || (length.toDouble() * width * height) >= 1000000000) {
            result = "Bulky"
        }
        if (mass >= 100) {
            return if (result.isEmpty()) {
                "Heavy"
            } else {
                "Both"
            }
        }
        return result.ifEmpty { "Neither" }
    }

}