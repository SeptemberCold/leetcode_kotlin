package com.lin.leetcode.page023

/**
 *
 * @author lin
 * @date 2023/01/31/20:09
 *
 * �жϾ����Ƿ���һ�� X ����
 * ���һ�������ξ����������� ȫ�� ���������֮Ϊһ�� X ���� ��
 * ����Խ����ϵ�����Ԫ�ض� ���� 0
 * ��������������Ԫ�ض��� 0
 * ����һ����СΪ n x n �Ķ�ά�������� grid ����ʾһ�������ξ���
 * ��� grid ��һ�� X ���� ������ true �����򣬷��� false ��
 */
object Leetcode2319 {

    /**
     * ִ����ʱ��260 ms
     * �ڴ����ģ�44.3 MB
     */
    private fun checkXMatrix(grid: Array<IntArray>): Boolean {
        //��ȡ���ξ���ĳ���
        val length = grid.size
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                //��Խ��߲�������0 ����false
                if (i == j && grid[i][j] == 0) return false
                //�ҶԽ��߲�������0 ����false
                if (length - 1 - i == j && grid[i][j] == 0) return false
                //���ǶԽ��ߵĲ�����0 ����false
                if (i != j && length - 1 - i != j && grid[i][j] != 0) return false
            }
        }
        return true
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = checkXMatrix(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<Array<IntArray>> {
        val array = ArrayList<Array<IntArray>>()
        array.add(
            arrayOf(
                intArrayOf(5, 0, 0, 1), intArrayOf(0, 4, 1, 5), intArrayOf(0, 5, 2, 0), intArrayOf(4, 1, 0, 2)
            )
        )
        array.add(
            arrayOf(
                intArrayOf(2, 0, 0, 1), intArrayOf(0, 3, 1, 0), intArrayOf(0, 5, 2, 0), intArrayOf(4, 0, 0, 2)
            )
        )
        return array
    }

}