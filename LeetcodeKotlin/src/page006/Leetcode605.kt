package page006

/**
 *
 * 题目: 种花问题
 *
 * 描述: 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。
 *      可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 *      给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
 *      另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false 。
 * 限制: 1 <= flowerbed.length <= 2 * 104
 *      flowerbed[i] 为 0 或 1
 *      flowerbed 中不存在相邻的两朵花
 *      0 <= n <= flowerbed.length
 *
 * 链接: https://leetcode.cn/problems/can-place-flowers/description/?envType=daily-question&envId=2023-09-29
 *
 */
class Leetcode605 {

    /**
     *  模拟
     *  时间 200ms
     *  内存 35.77MB
     */
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var sum = 0

        if (flowerbed.size >= 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1
                sum += 1
            }
        } else {
            if (flowerbed[0] == 0) {
                sum += 1
            }
        }

        for (i in 1..flowerbed.size - 2) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1
                sum += 1
            }
        }

        if (flowerbed.size >= 2) {
            if (flowerbed[flowerbed.size - 1] == 0 && flowerbed[flowerbed.size - 2] == 0) {
                sum += 1
            }
        }

        return sum >= n
    }

}