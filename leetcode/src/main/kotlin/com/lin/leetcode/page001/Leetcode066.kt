package com.lin.leetcode.page001

/**
 *
 * @author lin
 * @date 2023/02/22/23:09
 * ��һ
 * ����һ���� ���� ��ɵ� �ǿ� ��������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢�������֡�
 * ����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 */
object Leetcode066 {

    /**
     * ִ����ʱ��180 ms
     * �ڴ����ģ�33.7 MB
     */
    private fun plusOne(digits: IntArray): IntArray {
        //�������
        for (i in digits.size - 1 downTo 0) {
            val add = digits[i] + 1
            if (add == 10) {
                digits[i] = 0
            } else {
                digits[i] = add
                return digits
            }
        }
        //��1�Ľ���������� ���� 99+1=100 ��Ҫ��Ϊ��һ��λ��
        val answer = IntArray(digits.size + 1)
        answer[0] = 1
        for (i in 1 until answer.size) {
            answer[i] = digits[i - 1]
        }
        return answer
    }

    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val valid = plusOne(it)
            println("${it}=$valid")
        }
    }

    private fun getTestData(): List<IntArray> {
        val example = ArrayList<IntArray>()
        example.add(intArrayOf(9,9))
        return example
    }

}