package page2300

/**
 *
 * 题目: 赢得比赛需要的最少训练时长
 *
 * 描述: 你正在参加一场比赛，给你两个正整数 initialEnergy 和 initialExperience 分别表示你的初始精力和初始经验。
 *      另给你两个下标从 0 开始的整数数组 energy 和 experience，长度均为 n 。
 *      你将会 依次 对上 n 个对手。第 i 个对手的精力和经验分别用 energy[i] 和 experience[i] 表示。
 *      当你对上对手时，需要在经验和精力上都 严格 超过对手才能击败他们，然后在可能的情况下继续对上下一个对手。
 *      击败第 i 个对手会使你的经验 增加 experience[i]，但会将你的精力 减少 energy[i] 。
 *      在开始比赛前，你可以训练几个小时。每训练一个小时，你可以选择将增加经验增加 1 或者 将精力增加 1 。
 *      返回击败全部 n 个对手需要训练的最少小时数目.
 * 限制: n == energy.length == experience.length
 *      1 <= n <= 100
 *      1 <= initialEnergy, initialExperience, energy[i], experience[i] <= 100
 * 链接:https://leetcode.cn/problems/minimum-hours-of-training-to-win-a-competition/
 *
 */
object Leetcode2383 {

    /**
     * 问题模拟
     * 执行用时：168 ms 在所有 Kotlin 提交中击败了100.00%的用户
     * 内存消耗：37.6 MB  在所有 Kotlin 提交中击败了100.00%的用户
     *
     * 简单题，说难不难，麻烦的是容易绕圈子把自己绕进去
     *
     */
    fun minNumberOfHours(initialEnergy: Int, initialExperience: Int, energy: IntArray, experience: IntArray): Int {
        //打怪升级嘛，精力条先管够
        //求出敌人精力总数
        var energySum = 0
        energy.forEach {
            energySum += it
        }
        //我们的精力要比敌人的精力多1
        //修炼精力的时间
        val energyTime = if (initialEnergy > energySum) 0 else energySum - initialEnergy + 1
        //接下来计算需要准备多少经验才打得过去
        var experienceTime = 0
        //当前经验
        var experienceNow = initialExperience
        experience.forEach {
            //当前经验少于敌人经验
            if (experienceNow <= it) {
                //需要提前修炼这么些经验才过得去
                val add = it - experienceNow + 1
                experienceTime += add
                experienceNow += add
            }
            //吸收当前的经验
            experienceNow += it
        }
        return energyTime + experienceTime
    }


}