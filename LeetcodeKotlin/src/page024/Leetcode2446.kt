package page024

/**
 *
 * ��Ŀ: �ж������¼��Ƿ���ڳ�ͻ
 *
 * ����: ���������ַ������� event1 ��event2����ʾ������ͬһ�������������ʱ����¼������У�
 *          event1 = [startTime1, endTime1] ��
 *          event2 = [startTime2, endTime2]
 *      �¼���ʱ��Ϊ��Ч�� 24 Сʱ���Ұ�HH:MM��ʽ������
 *      �������¼�����ĳ���ǿյĽ���ʱ������ĳЩʱ���������¼��������ģ�������Ϊ���� ��ͻ��
 *      ��������¼�֮����ڳ�ͻ������true�����򣬷���false ��
 * ����: event1.length == event2.length == 2.
 *      event1[i].length == event2[i].length == 5
 *      startTime1 <= endTime1
 *      startTime2 <= endTime2
 *      �����¼���ʱ�䶼����HH:MM��ʽ����
 *
 * ����: https://leetcode.cn/problems/determine-if-two-events-have-conflict/
 *
 */
object Leetcode2446 {


    /**
     * �ֵ�����
     * ִ����ʱ: 144 ms
     * �ڴ�����: 32.8 MB
     */
    fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean {
        return !(event1[1] < event2[0] || event2[1] < event1[0])
    }

}