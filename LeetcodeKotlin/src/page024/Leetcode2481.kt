package page024

/**
 *
 * ��Ŀ: �ָ�Բ�������и����
 *
 * ����: Բ��һ�� ��Ч�и�������¶���֮һ��
 *      ���и��������˵���Բ�ϵ��߶Σ��Ҹ��߶ξ���Բ�ġ�
 *      ���и���һ����Բ����һ����Բ�ϵ��߶Ρ�
 *      һЩ��Ч����Ч���и�����ͼ��ʾ��
 * ����: 1 <= n <= 100
 *
 * ����: https://leetcode.cn/problems/minimum-cuts-to-divide-a-circle/
 *
 */
class Leetcode2481 {

    /**
     * ��ѧ����
     * ִ����ʱ��124 ms
     * �ڴ����ģ�32.1 MB
     */
    fun numberOfCuts(n: Int): Int {
        if (n == 1) return 0
        return if (n % 2 == 0) n / 2 else n
    }

}