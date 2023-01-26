package com.lin.leetcode.page016

/**
 *
 * @author lin
 * @date 2023/01/26/22:02
 *
 * ���и�����ֵ����С�ַ���
 * Сд�ַ� �� ��ֵ ��������ĸ���е�λ�ã��� 1 ��ʼ������� a ����ֵΪ 1 ��b ����ֵΪ 2 ��c ����ֵΪ 3 ���Դ����ơ�
 * �ַ���������Сд�ַ���ɣ��ַ�������ֵ Ϊ���ַ�����ֵ֮�͡����磬�ַ��� "abe" ����ֵ���� 1 + 2 + 5 = 8 ��
 * ������������ n �� k ������ ���� ���� n �� ��ֵ ���� k �� �ֵ�����С ���ַ�����
 * ע�⣬����ַ��� x ���ֵ�������λ�� y ֮ǰ������Ϊ x �ֵ���� y С�����������������
 * x �� y ��һ��ǰ׺��
 * ��� i ��x[ i ] != y[ i ] �ĵ�һ��λ�ã��� x[ i ]����ĸ���е�λ�ñ�y[ i ]��ǰ��
 */
object Leetcode1663 {

    /**
     * ִ����ʱ��200 ms
     * �ڴ����ģ�36 MB
     */
    private fun getSmallestString(n: Int, k: Int): String {
        //����һ������ ��ʼ��Ϊ z
        val answer = CharArray(n) { return@CharArray 'z' }
        //��ǰ�ַ�����ֵ
        var sum = n * 26
        //����
        for (i in answer.indices) {
            //������sumС��k�����
            if (sum <= k) break
            //��ȡ��ǰ�ַ�����ֵ��Ԥ����ֵ�Ĳ�ֵ
            val j = sum - k
            if (j >= 26) {
                answer[i] = 'a'
                sum -= 25
            } else {
                answer[i] = 'z' - j
                break
            }
        }
        return String(answer)
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = getSmallestString(it.key, it.value)
            println("${it.key} = $answer")
        }
    }

    private fun getTestData(): Map<Int, Int> {
        val map = HashMap<Int, Int>()
        map[3] = 27
        map[5] = 73
        return map
    }


}