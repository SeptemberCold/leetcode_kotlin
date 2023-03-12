package page001

/**
 *
 * ��Ŀ:������� II
 *
 * ����: ����һ���Ǹ����� rowIndex�����ء�������ǡ��ĵ� rowIndex �С�
 *      �ڡ�������ǡ��У�ÿ�����������Ϸ������Ϸ������ĺ͡�
 * ����: 0 <= rowIndex <= 33
 *
 * ����: https://leetcode.cn/problems/pascals-triangle-ii/
 *
 */
object Leetcode119 {

    /**
     * ��̬�滮
     * ʹ��������漯�� �ڷ���ʱ��ת�ɼ��� ����ʱ�������ϻ��Щ
     *
     * ִ����ʱ��164 ms
     * �ڴ����ģ�32.4 MB
     *
     */
    fun getRow(rowIndex: Int): List<Int> {
        val answer = ArrayList<Int>()
        answer.add(1)
        for (i in 1..rowIndex) {
            val item = answer[i - 1].toLong() * (rowIndex - i + 1) / i
            answer.add(item.toInt())
        }
        return answer
    }

}