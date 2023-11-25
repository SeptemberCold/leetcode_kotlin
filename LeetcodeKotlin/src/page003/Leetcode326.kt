package page003

/**
 *
 * 题目: 3 的幂
 *
 * 描述: 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *      整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 * 限制: -231 <= n <= 231 - 1
 *
 * 链接: https://leetcode.cn/problems/power-of-three/description/
 *
 */
class Leetcode326 {

    /**
     * 暴力枚举
     * 268 ms
     * 35.64 MB
     */
    fun isPowerOfThree(n: Int): Boolean {
        when (n) {
            1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467 -> return true
        }
        return false
    }

}