package page001

/**
 *
 * ��Ŀ: Excel��������
 *
 * ����: ����һ������ columnNumber ���������� Excel �������Ӧ�������ơ�
 * ����: 1 <= columnNumber <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/excel-sheet-column-title/description/
 *
 */
class Leetcode168 {

    /**
     * ��ѧģ��
     * ʱ�� 140ms
     * �ڴ� 31.95MB
     */
    fun convertToTitle(columnNumber: Int): String {
        val result = StringBuilder()

        var temp = columnNumber
        while (temp > 0) {
            val i = temp % 26
            if (i == 0) {
                result.append('Z')
                temp = temp / 26 - 1
            } else {
                result.append('A' + i - 1)
                temp /= 26
            }
        }
        val result2 = StringBuilder()
        for (i in result.length - 1 downTo 0) {
            val c = result[i]
            result2.append(c)
        }

        return result2.toString()
    }


}