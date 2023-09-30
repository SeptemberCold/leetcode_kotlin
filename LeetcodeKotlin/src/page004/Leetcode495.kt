package page004

/**
 *
 * ��Ŀ: ��Ī����
 *
 * ����: �ڡ�Ӣ�����ˡ��������У���һ���� ����Ī�� ��Ӣ�ۡ����Ĺ��������õз�Ӣ�۰�ϣ������ע���������֣������ж�״̬��
 *      ����Ī������ϣ����ϣ���ж�״̬���ó��� duration �롣
 *      ��ʽ�ؽ�����Ī�� t ���𹥻���ζ�Ű�ϣ��ʱ������ [t, t + duration - 1]���� t �� t + duration - 1�������ж�״̬��
 *      �����Ī���ж�Ӱ����� ǰ �ٴι������ж�״̬��ʱ������ ���� �����µĹ���֮���ж�Ӱ�콫���� duration ��������
 *      ����һ�� �ǵݼ� ���������� timeSeries ������ timeSeries[i] ��ʾ��Ī�� timeSeries[i] ��ʱ�԰�ϣ���𹥻���
 *      �Լ�һ����ʾ�ж�����ʱ������� duration ��
 *      ���ذ�ϣ�����ж�״̬�� �� ������
 * ����: 1 <= timeSeries.length <= 104
 *      0 <= timeSeries[i], duration <= 107
 *      timeSeries �� �ǵݼ� ˳������
 *
 * ����: https://leetcode.cn/problems/teemo-attacking/description/
 *
 */
class Leetcode495 {

    /**
     * ģ��
     * ʱ�� 264ms
     * �ڴ� 36.55MB
     */
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var sum = 0
        for (i in 1 until timeSeries.size) {
            val duration2 = timeSeries[i] - timeSeries[i - 1]
            sum += if (duration2 > duration) {
                duration
            } else {
                duration2
            }
        }
        return sum + duration
    }

}