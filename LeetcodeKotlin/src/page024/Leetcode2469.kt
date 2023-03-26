package page024

/**
 *
 * 题目: 温度转换
 *
 * 描述:  给你一个四舍五入到两位小数的非负浮点数 celsius 来表示温度，以 摄氏度（Celsius）为单位。
 *       你需要将摄氏度转换为 开氏度（Kelvin）和 华氏度（Fahrenheit），并以数组 ans = [kelvin, fahrenheit] 的形式返回结果。
 *       返回数组 ans 。与实际答案误差不超过 10-5 的会视为正确答案。
 * 限制:  开氏度 = 摄氏度 + 273.15
 *       华氏度 = 摄氏度 * 1.80 + 32.00
 *
 * 链接:  https://leetcode.cn/problems/convert-the-temperature/
 *
 */
object Leetcode2469 {

    /**
     * 不知道怎么形容 这真的是算法题吗？
     * 执行用时：140 ms
     * 内存消耗：33.4 MB
     */
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32.00)
    }

}