package page004


/**
 *
 * ��Ŀ: ������ܳ�
 *
 * ����: ����һ�� row x col �Ķ�ά�����ͼ grid ��
 *      ���У�grid[i][j] = 1 ��ʾ½�أ� grid[i][j] = 0 ��ʾˮ��
 *      �����еĸ��� ˮƽ�ʹ�ֱ �����������Խ��߷�����������
 *      ��������ˮ��ȫ��Χ��������ǡ����һ�����죨����˵��һ��������ʾ½�صĸ���������ɵĵ��죩��
 *      ������û�С������������� ָˮ���ڵ����ڲ��Ҳ��͵�����Χ��ˮ��������
 *      �����Ǳ߳�Ϊ 1 �������Ρ�����Ϊ�����Σ��ҿ�Ⱥ͸߶Ⱦ������� 100 ���������������ܳ���
 *
 * ����: row == grid.length
 *      col == grid[i].length
 *      1 <= row, col <= 100
 *      grid[i][j] Ϊ 0 �� 1
 *
 * ����: https://leetcode.cn/problems/island-perimeter/description/
 *
 */
class Leetcode463 {

    /**
     * ����ö��
     * ʱ�� 335ms
     * �ڴ� 58.10MB
     */
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var sum = 0
        for (x in grid[0].indices) {
            for (y in grid.indices) {
                //½�ظ���
                if (grid[y][x] == 1) {
                    //����ϸ���
                    if (y == 0 || grid[y - 1][x] == 0) {
                        sum += 1
                    }
                    //����¸���
                    if (y == grid.size - 1 || grid[y + 1][x] == 0) {
                        sum += 1
                    }
                    //��������
                    if (x == 0 || grid[y][x - 1] == 0) {
                        sum += 1
                    }
                    //����Ҹ���
                    if (x == grid[0].size - 1 || grid[y][x + 1] == 0) {
                        sum += 1
                    }
                }
            }
        }
        return sum
    }

}