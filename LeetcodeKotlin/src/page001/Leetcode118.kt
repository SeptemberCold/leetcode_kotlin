package page001

/**
 *
 * ��Ŀ: �������
 *
 * ����: ����һ���Ǹ����� numRows�����ɡ�������ǡ���ǰ numRows �С�
 *      �ڡ�������ǡ��У�ÿ�����������Ϸ������Ϸ������ĺ͡�
 * ����: 1 <= numRows <= 30
 *
 * ����: https://leetcode.cn/problems/pascals-triangle/
 *
 */
object Leetcode118 {

    /**
     * ��β��1
     * ������һ�����ڵ������㵱ǰ���
     *
     * ִ����ʱ: 164 ms
     * �ڴ�����: 34.4 MB
     */
    fun generate(numRows: Int): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        for (i in 0 until numRows) {
            val row = ArrayList<Int>()
            for (j in 0..i) {
                if (j == 0 || j == i) {
                    row.add(1)
                } else {
                    row.add(answer[i - 1][j - 1] + answer[i - 1][j])
                }
            }
            answer.add(row)
        }
        return answer
    }

    /**
     * ��̬�滮
     * ����119�ķ��� ���������ÿһ�е�����
     *
     * ִ����ʱ��176 ms
     * �ڴ����ģ�34.8 MB
     */
    fun generate2(numRows: Int): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        for (rowIndex in 0 until numRows) {
            val answerItem = ArrayList<Int>()
            answerItem.add(1)
            for (i in 1..rowIndex) {
                val item = answerItem[i - 1].toLong() * (rowIndex - i + 1) / i
                answerItem.add(item.toInt())
            }
            answer.add(answerItem)
        }
        return answer
    }


}