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
        for(i in 0 until numRows){
            val row = ArrayList<Int>()
            for(j in 0..i){
                if (j==0||j==i){
                    row.add(1)
                }else{
                    row.add(answer[i-1][j-1]+answer[i-1][j])
                }
            }
            answer.add(row)
        }
        return answer
    }


}