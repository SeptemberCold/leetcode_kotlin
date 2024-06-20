package page004

import kotlin.math.sqrt

/**
 *
 * 题目: 构造矩形
 *
 * 描述: 作为一位web开发者， 懂得怎样去规划一个页面的尺寸是很重要的。
 *      所以，现给定一个具体的矩形页面面积，你的任务是设计一个长度为 L 和宽度为 W 且满足以下要求的矩形的页面。要求：
 *      你设计的矩形页面必须等于给定的目标面积。
 *      宽度 W 不应大于长度 L ，换言之，要求 L >= W 。
 *      长度 L 和宽度 W 之间的差距应当尽可能小。
 *      返回一个 数组 [L, W]，其中 L 和 W 是你按照顺序设计的网页的长度和宽度。
 *
 * 限制: 1 <= area <= 107
 *
 * 链接: https://leetcode.cn/problems/construct-the-rectangle/description/
 *
 */
class Leetcode492 {

    /**
     * 数学计算
     * 时间 126ms
     * 内存 33.01MB
     */
    fun constructRectangle(area: Int): IntArray {
        //开方
        val maxW = sqrt(area.toDouble()).toInt()
        //逐渐减少宽度
        for (i in maxW downTo 1) {
            if (area % i == 0) {
                return intArrayOf(area / i, i)
            }
        }
        return intArrayOf(1, area)
    }

}