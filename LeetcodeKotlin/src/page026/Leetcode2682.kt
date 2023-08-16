package page026

/**
 *
 * 题目: 找出转圈游戏输家
 *
 * 描述: n 个朋友在玩游戏。这些朋友坐成一个圈，按 顺时针方向 从 1 到 n 编号。
 *      从第 i 个朋友的位置开始顺时针移动 1 步会到达第 (i + 1) 个朋友的位置（1 <= i < n），
 *      而从第 n 个朋友的位置开始顺时针移动 1 步会回到第 1 个朋友的位置。
 *      游戏规则如下：
 *          第 1 个朋友接球。
 *          接着，第 1 个朋友将球传给距离他顺时针方向 k 步的朋友。
 *          然后，接球的朋友应该把球传给距离他顺时针方向 2 * k 步的朋友。
 *          接着，接球的朋友应该把球传给距离他顺时针方向 3 * k 步的朋友，以此类推。
 *          换句话说，在第 i 轮中持有球的那位朋友需要将球传递给距离他顺时针方向 i * k 步的朋友。
 *          当某个朋友第 2 次接到球时，游戏结束。
 *          在整场游戏中没有接到过球的朋友是 输家 。
 *      给你参与游戏的朋友数量 n 和一个整数 k ，请按升序排列返回包含所有输家编号的数组 answer 作为答案。
 * 限制: 1 <= k <= n <= 50
 *
 * 链接: https://leetcode.cn/problems/find-the-losers-of-the-circular-game/description/
 *
 */
class Leetcode2682 {

    /**
     * 模拟
     * 时间 260ms
     * 内存 35.96mb
     */
    fun circularGameLosers(n: Int, k: Int): IntArray {
        //是否有第玩家第二次接到球
        var repeat = false
        //循环次数
        var i = 1
        //拿球的玩家
        var user = 1
        //拿过球的玩家
        val set = HashSet<Int>()
        set.add(1)
        //游戏开始
        while (!repeat) {
            //下一个获取的玩家
            user = (user + i * k) % n
            if (user == 0) user = n
            //如果该玩家已经拿过球结束循环
            if (set.contains(user)) {
                repeat = true
            }
            //没有循环次数加1
            else {
                i += 1
                set.add(user)
            }
        }
        //找到没有拿到过球的玩家
        val list = ArrayList<Int>()
        for (j in 1..n) {
            if (!set.contains(j)) {
                list.add(j)
            }
        }
        return list.toIntArray()
    }

}