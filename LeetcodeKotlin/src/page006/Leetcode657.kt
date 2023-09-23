package page006

/**
 *
 * 题目: 机器人能否返回原点
 *
 * 描述: 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 *      移动顺序由字符串 moves 表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 *      如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *      注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 * 限制: 1 <= moves.length <= 2 * 104
 *      moves 只包含字符 'U', 'D', 'L' 和 'R'
 *
 * 链接: https://leetcode.cn/problems/robot-return-to-origin/
 *
 */
class Leetcode657 {

    /**
     * 统计
     * 时间 180ms
     * 内存 35.65MB
     */
    fun judgeCircle(moves: String): Boolean {
        val array = IntArray(4)

        for (move in moves) {
            when (move) {
                'U' -> array[0] = array[0] + 1
                'D' -> array[1] = array[1] + 1
                'L' -> array[2] = array[2] + 1
                'R' -> array[3] = array[3] + 1
            }
        }
        return array[0] == array[1] && array[2] == array[3]
    }

}