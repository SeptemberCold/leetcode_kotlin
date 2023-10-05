package page000

/**
 *
 * ��Ŀ: N ���α任
 *
 * ����: ��һ�������ַ��� s ���ݸ��������� numRows ���Դ������¡������ҽ��� Z �������С�
 *      ���������ַ���Ϊ "PAYPALISHIRING" ����Ϊ 3 ʱ���������£�
 *      P   A   H   N
 *      A P L S I I G��
 *      Y   I   R
 *      ֮����������Ҫ�����������ж�ȡ��������һ���µ��ַ��������磺"PAHNAPLSIIGYIR"����
 *      ����ʵ��������ַ�������ָ�������任�ĺ�����
 *      string convert(string s, int numRows);
 * ����: 1 <= s.length <= 1000
 *      s ��Ӣ����ĸ��Сд�ʹ�д����',' �� '.' ���
 *      1 <= numRows <= 1000
 *
 * ����: https://leetcode.cn/problems/zigzag-conversion/description/
 *
 */
class Leetcode006 {

    /**
     * ���
     * ʱ�� 224ms
     * �ڴ� 36.02MB
     */
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s
        val temp = HashMap<Int, StringBuilder>()
        var count = 0
        var count2 = false
        for (i in s.indices) {
            if (temp[count] == null) {
                val stb = StringBuilder()
                stb.append(s[i])
                temp[count] = stb
            } else {
                temp[count]?.append(s[i])
            }
            //���ת��
            if (count2) {
                when (count) {
                    1 -> {
                        count2 = false
                        count = 0
                    }
                    0 -> {
                        count2 = true
                        count = 1
                    }
                    else -> count--
                }
            } else {
                if (count == numRows - 1) {
                    count2 = true
                    count = 0.coerceAtLeast(numRows - 2)
                } else {
                    count++
                }
            }
        }
        val result = StringBuilder()
        for (i in 0 until numRows) {
            result.append(temp[i])
        }

        return result.toString()
    }

}