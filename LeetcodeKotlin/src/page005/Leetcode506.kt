package page005

/**
 *
 * ��Ŀ: �������
 *
 * ����: ����һ������Ϊ n ���������� score ������ score[ i ] �ǵ� i λ�˶�Ա�ڱ����еĵ÷֡����е÷ֶ� ������ͬ ��
 *      �˶�Ա�����ݵ÷� �������� ���������ε� 1 ���˶�Ա�÷���ߣ����ε� 2 ���˶�Ա�÷ֵ� 2 �ߣ��������ơ��˶�Ա�����ξ��������ǵĻ������
 *      ���ε� 1 ���˶�Ա����� "Gold Medal" ��
 *      ���ε� 2 ���˶�Ա������ "Silver Medal" ��
 *      ���ε� 3 ���˶�Ա��ͭ�� "Bronze Medal" ��
 *      �����ε� 4 ���� n ���˶�Ա��ֻ�ܻ�����ǵ����α�ţ��������ε� x ���˶�Ա��ñ�� "x"����
 *      ʹ�ó���Ϊ n ������ answer ���ػ񽱣����� answer[i] �ǵ� i λ�˶�Ա�Ļ������
 *
 * ����: n == score.length
 *      1 <= n <= 104
 *      0 <= score[i] <= 106
 *      score �е�����ֵ ������ͬ
 *
 * ����: https://leetcode.cn/problems/relative-ranks/description/
 *
 */
class Leetcode506 {

    /**
     * ��ϣ ����
     * ʱ�� 243ms
     * �ڴ� 40.11MB
     */
    fun findRelativeRanks(score: IntArray): Array<String> {
        val answer = Array(score.size) { "" }
        val hashMap = HashMap<Int, Int>()
        for (i in score.indices) {
            hashMap[score[i]] = i
        }
        score.sortDescending()
        for (i in score.indices) {
            val str: String = if (i > 2) {
                "${i + 1}"
            } else {
                when (i) {
                    0 -> "Gold Medal"
                    1 -> "Silver Medal"
                    2 -> "Bronze Medal"
                    else -> ""
                }
            }
            val index = hashMap[score[i]]!!
            answer[index] = str
        }
        return answer
    }

}