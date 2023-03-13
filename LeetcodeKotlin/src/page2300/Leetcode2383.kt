package page2300

/**
 *
 * ��Ŀ: Ӯ�ñ�����Ҫ������ѵ��ʱ��
 *
 * ����: �����ڲμ�һ���������������������� initialEnergy �� initialExperience �ֱ��ʾ��ĳ�ʼ�����ͳ�ʼ���顣
 *      ����������±�� 0 ��ʼ���������� energy �� experience�����Ⱦ�Ϊ n ��
 *      �㽫�� ���� ���� n �����֡��� i �����ֵľ����;���ֱ��� energy[i] �� experience[i] ��ʾ��
 *      ������϶���ʱ����Ҫ�ھ���;����϶� �ϸ� �������ֲ��ܻ������ǣ�Ȼ���ڿ��ܵ�����¼���������һ�����֡�
 *      ���ܵ� i �����ֻ�ʹ��ľ��� ���� experience[i]�����Ὣ��ľ��� ���� energy[i] ��
 *      �ڿ�ʼ����ǰ�������ѵ������Сʱ��ÿѵ��һ��Сʱ�������ѡ�����Ӿ������� 1 ���� ���������� 1 ��
 *      ���ػ���ȫ�� n ��������Ҫѵ��������Сʱ��Ŀ.
 * ����: n == energy.length == experience.length
 *      1 <= n <= 100
 *      1 <= initialEnergy, initialExperience, energy[i], experience[i] <= 100
 * ����:https://leetcode.cn/problems/minimum-hours-of-training-to-win-a-competition/
 *
 */
object Leetcode2383 {

    /**
     * ����ģ��
     * ִ����ʱ��168 ms ������ Kotlin �ύ�л�����100.00%���û�
     * �ڴ����ģ�37.6 MB  ������ Kotlin �ύ�л�����100.00%���û�
     *
     * ���⣬˵�Ѳ��ѣ��鷳����������Ȧ�Ӱ��Լ��ƽ�ȥ
     *
     */
    fun minNumberOfHours(initialEnergy: Int, initialExperience: Int, energy: IntArray, experience: IntArray): Int {
        //���������������ȹܹ�
        //������˾�������
        var energySum = 0
        energy.forEach {
            energySum += it
        }
        //���ǵľ���Ҫ�ȵ��˵ľ�����1
        //����������ʱ��
        val energyTime = if (initialEnergy > energySum) 0 else energySum - initialEnergy + 1
        //������������Ҫ׼�����پ���Ŵ�ù�ȥ
        var experienceTime = 0
        //��ǰ����
        var experienceNow = initialExperience
        experience.forEach {
            //��ǰ�������ڵ��˾���
            if (experienceNow <= it) {
                //��Ҫ��ǰ������ôЩ����Ź���ȥ
                val add = it - experienceNow + 1
                experienceTime += add
                experienceNow += add
            }
            //���յ�ǰ�ľ���
            experienceNow += it
        }
        return energyTime + experienceTime
    }


}