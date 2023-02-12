package com.lin.leetcode.page011


/**
 *
 * @author lin
 * @date 2023/02/12/23:17
 *
 * ���Ǵ�һ����ĸ���ϵ�λ��(0, 0)�������������Ӧ���ַ�Ϊboard[0][0]��
 * �ڱ������ĸ��Ϊboard = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"]��������ʾ��
 * ���ǿ��԰������ָ������ж���
 * ���������ڣ�'U'��ζ�Ž����ǵ�λ������һ�У�
 * ���������ڣ�'D'��ζ�Ž����ǵ�λ������һ�У�
 * ���������ڣ�'L'��ζ�Ž����ǵ�λ������һ�У�
 * ���������ڣ�'R'R��ζ�Ž����ǵ�λ������һ�У�
 * '!'��������ǵ�ǰλ�� (r, c) ���ַ�board[ r ][ c ]��ӵ����С�
 * ��ע�⣬��ĸ����ֻ��������ĸ��λ�á���
 * ����ָ�����У�����С���ж������ô𰸺�Ŀ��target��ͬ������Է����κδ��Ŀ���·����
 *
 */
object Leetcode1138 {

    /**
     * ����ģ��
     * ִ����ʱ��144 ms
     * �ڴ����ģ�32.7 MB
     * ��Ϊ��ĸ�����'z'��ԭ����ҪһЩ����Ĵ���
     * ����Ҳ������ѭ�ϡ����¡���Ҳ���Աܿ���z���ĸ���
     */
    private fun alphabetBoardPath(target: String): String {
        val answer = StringBuilder()
        //��
        var i = 0
        //��
        var j = 0
        for (c in target) {
            val order = c - 'a'
            //��
            val orderI = order / 5
            //��
            val orderJ = order % 5
            //��ƫ��
            val sumI = orderI - i
            //��ƫ��
            val sumJ = orderJ - j
            //���c='z' �Ƚ�����ƫ��
            if (c == 'z') {
                if (sumJ > 0) for (r in 0 until sumJ) answer.append("R")
                else if (sumJ < 0) for (r in 0 until -sumJ) answer.append("L")
                //��ƫ��
                if (sumI > 0) for (r in 0 until sumI) answer.append("D")
                else if (sumI < 0) for (r in 0 until -sumI) answer.append("U")
            } else {
                //��ƫ��
                if (sumI > 0) for (r in 0 until sumI) answer.append("D")
                else if (sumI < 0) for (r in 0 until -sumI) answer.append("U")
                if (sumJ > 0) for (r in 0 until sumJ) answer.append("R")
                else if (sumJ < 0) for (r in 0 until -sumJ) answer.append("L")
            }
            answer.append("!")
            i = orderI
            j = orderJ
        }
        return answer.toString()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        getTestData().forEach {
            val answer = alphabetBoardPath(it)
            println("$it = $answer")
        }
    }

    private fun getTestData(): List<String> {
        val array = ArrayList<String>()
        array.add("leet")
        array.add("code")
        array.add("zdz")
        return array
    }


}