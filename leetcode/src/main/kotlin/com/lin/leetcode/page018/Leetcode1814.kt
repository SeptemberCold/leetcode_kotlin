package com.lin.leetcode.page018

/**
 *
 * @author lin
 * @date 2023/01/17/22:44
 *
 * ͳ��һ�������кö��ӵ���Ŀ
 * ����һ������nums��������ֻ�����Ǹ�����������rev(x)��ֵΪ������x��������λ��ת�õ��Ľ����
 * �ȷ�˵rev(123) = 321��rev(120) = 21��
 * ���ǳ����������������±��(i, j) �Ǻõģ�
 * 0 <= i < j < nums.length
 * nums[ i ] + rev(nums[ j ]) == nums[ j ] + rev(nums[ i ])
 * ���㷵�غ��±�Ե���Ŀ�����ڽ�����ܻ�ܴ��뽫�����109 + 7ȡ��󷵻ء�
 */
object Leetcode1814 {


    /**
     * ��ϣ��
     * ���۵�һ������֮�͵ı���
     * ִ����ʱ��440 ms
     * �ڴ����ģ�53.6 MB
     */
    fun countNicePairs(nums: IntArray): Int {
        val mod = 1000000007
        var result = 0
        //��ϣ��
        val map = HashMap<Int, Int>()
        for (i in nums) {
            //���ڸ�����ת�ı���
            var temp = i
            //��ת������� i=123 j=321
            var j = 0
            //��i��ת
            while (temp > 0) {
                j = j * 10 + temp % 10
                temp /= 10
            }
            //��ȡ�ö��ӵ���Ŀ ǰ��Ķ��ӻ��ȡ���������Ӧ�Ķ���
            result = (result + map.getOrDefault(i - j, 0)) % mod
            //�洢�ö��ӵ���Ŀ �����Ӧ�ĺö��Ӷ�ȡ���ܻ��
            map[i - j] = map.getOrDefault(i - j, 0) + 1
        }
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val result = countNicePairs(it)
            println(result)
        }
    }

    /**
     * ��ȡ��������
     */
    private fun getTestData(): List<IntArray> {
        val data = ArrayList<IntArray>()
        data.add(intArrayOf(42, 11, 1, 97))
        data.add(intArrayOf(13, 10, 35, 24, 76))
        return data
    }

}