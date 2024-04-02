package page000

/**
 *
 * ��Ŀ: ��Ч������
 *
 * ����: �����ж�һ�� 9 x 9 �������Ƿ���Ч��ֻ��Ҫ �������¹��� ����֤�Ѿ�����������Ƿ���Ч���ɡ���
 *      ���� 1-9 ��ÿһ��ֻ�ܳ���һ�Ρ�
 *      ���� 1-9 ��ÿһ��ֻ�ܳ���һ�Ρ�
 *      ���� 1-9 ��ÿһ���Դ�ʵ�߷ָ��� 3x3 ����ֻ�ܳ���һ�Ρ�����ο�ʾ��ͼ��
 *
 * ����: һ����Ч�������������ѱ���䣩��һ���ǿɽ�ġ�
 *      ֻ��Ҫ�������Ϲ�����֤�Ѿ�����������Ƿ���Ч���ɡ�
 *      �հ׸��� '.' ��ʾ��
 *
 * ����: https://leetcode.cn/problems/valid-sudoku/description/
 *
 */
class Leetcode036 {

    /**
     * ÿ�С�ÿ�С�ÿ�������ж�
     * ʱ�䣺211ms
     * ʱ�䣺42.44MB
     */
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val sum = IntArray(9) { return@IntArray 0 }
        //���ÿһ��
        for (chars in board) {
            for (c in chars) {
                if (c in '1'..'9') {
                    val index = c.code - '1'.code
                    //���ͬһ���Ѿ���������� ������Ч
                    if (sum[index] == 1)
                        return false
                    sum[index] = 1
                }
            }
            sum.fill(0)
        }
        //���ÿһ��
        for (i in 0 until 9) {
            for (chars in board) {
                if (chars[i] in '1'..'9') {
                    val index = chars[i].code - '1'.code
                    //���ͬһ���Ѿ���������� ������Ч
                    if (sum[index] == 1)
                        return false
                    sum[index] = 1
                }
            }
            sum.fill(0)
        }
        //���ÿһ������
        for (i in 0 until 9 step 3) {
            for (j in 0 until 9 step 3) {
                for (x in i until i + 3) {
                    for (y in j until j + 3) {
                        if (board[x][y] in '1'..'9') {
                            val index = board[x][y].code - '1'.code
                            //���ͬһ�Ź����Ѿ���������� ������Ч
                            if (sum[index] == 1)
                                return false
                            sum[index] = 1
                        }
                    }
                }
                sum.fill(0)
            }
        }
        return true
    }

}