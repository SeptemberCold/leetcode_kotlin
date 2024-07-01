package page008

/**
 *
 * 题目: 矩形重叠
 *
 * 描述: 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，
 *      (x2, y2) 是右上角的坐标。矩形的上下边平行于 x 轴，左右边平行于 y 轴。
 *      如果相交的面积为 正 ，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
 *      给出两个矩形 rec1 和 rec2 。如果它们重叠，返回 true；否则，返回 false 。
 *
 * 限制: rect1.length == 4
 *      rect2.length == 4
 *      -109 <= rec1[i], rec2[i] <= 109
 *      rec1 和 rec2 表示一个面积不为零的有效矩形
 *
 * 链接: https://leetcode.cn/problems/rectangle-overlap/description/
 *
 */
class Leetcode836 {

    /**
     * 逆向判断
     * 用时：151ms
     * 内存：33.32MB
     */
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        //矩阵1最右边小于矩阵2最左边
        if (rec1[2] <= rec2[0]) return false
        //矩阵1最左边大于矩阵2最右边
        if (rec1[0] >= rec2[2]) return false
        //矩阵1最下边大于矩阵2最上边
        if (rec1[1] >= rec2[3]) return false
        //矩阵1最上边大于矩阵2最下边
        if (rec1[3] <= rec2[1]) return false
        //重叠
        return true
    }

}