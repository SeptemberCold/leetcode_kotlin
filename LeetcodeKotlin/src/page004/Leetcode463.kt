package page004


/**
 *
 * 题目: 岛屿的周长
 *
 * 描述: 给定一个 row x col 的二维网格地图 grid ，
 *      其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。
 *      网格中的格子 水平和垂直 方向相连（对角线方向不相连）。
 *      整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 *      岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
 *      格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 *
 * 限制: row == grid.length
 *      col == grid[i].length
 *      1 <= row, col <= 100
 *      grid[i][j] 为 0 或 1
 *
 * 链接: https://leetcode.cn/problems/island-perimeter/description/
 *
 */
class Leetcode463 {

    /**
     * 暴力枚举
     * 时间 335ms
     * 内存 58.10MB
     */
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var sum = 0
        for (x in grid[0].indices) {
            for (y in grid.indices) {
                //陆地格子
                if (grid[y][x] == 1) {
                    //检查上格子
                    if (y == 0 || grid[y - 1][x] == 0) {
                        sum += 1
                    }
                    //检查下格子
                    if (y == grid.size - 1 || grid[y + 1][x] == 0) {
                        sum += 1
                    }
                    //检查左格子
                    if (x == 0 || grid[y][x - 1] == 0) {
                        sum += 1
                    }
                    //检查右格子
                    if (x == grid[0].size - 1 || grid[y][x + 1] == 0) {
                        sum += 1
                    }
                }
            }
        }
        return sum
    }

}