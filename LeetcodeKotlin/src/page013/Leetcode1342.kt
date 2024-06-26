package page013

/**
 *
 * ��Ŀ: �����ֱ�� 0 �Ĳ�������
 *
 * ����: ����һ���Ǹ����� num �����㷵�ؽ������ 0 ����Ҫ�Ĳ����� �����ǰ������ż��������Ҫ�������� 2 �����򣬼�ȥ 1 ��
 * ����: 0 <= num <= 10^6
 *
 * ����: https://leetcode.cn/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 */
class Leetcode1342 {


    /**
     * λ����
     *
     * 115 ms
     * 32.84 MB
     */
    fun numberOfSteps(num: Int): Int {
        if (num == 0) return 0
        var temp = num
        var sum = 0
        while (temp != 0) {
            if (temp and 1 == 1) {
                sum += 1
            }
            sum += 1
            temp = temp shr 1
        }
        return sum - 1
    }


}