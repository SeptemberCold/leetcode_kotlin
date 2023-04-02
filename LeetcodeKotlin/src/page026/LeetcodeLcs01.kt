package page026

/**
 *
 * 题目:下载插件
 *
 * 描述: 小扣打算给自己的 VS code 安装使用插件，初始状态下带宽每分钟可以完成 1 个插件的下载。假定每分钟选择以下两种策略之一:
 *      使用当前带宽下载插件
 *      将带宽加倍（下载插件数量随之加倍）
 *      请返回小扣完成下载 n 个插件最少需要多少分钟。
 *      注意：实际的下载的插件数量可以超过 n 个
 * 限制: 1 <= n <= 10^5
 *
 * 链接: https://leetcode.cn/problems/Ju9Xwi/
 *
 */
object LeetcodeLcs01 {

    /**
     * 动态规划
     * 指数增长是很可怕的，除了特殊情况，都选择第二种策略
     *
     * 执行用时: 148 ms
     * 内存消耗: 32 MB
     */
    fun leastMinutes(n: Int): Int {
        if (n == 1) return 1
        val dp = intArrayOf(1, 1)
        while (true) {
            dp[1] = dp[1] + 1
            dp[0] = dp[0] * 2
            if (dp[0] >= n) {
                return dp[1]
            }
        }
    }

}