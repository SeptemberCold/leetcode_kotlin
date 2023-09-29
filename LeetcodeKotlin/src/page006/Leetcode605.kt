package page006

/**
 *
 * ��Ŀ: �ֻ�����
 *
 * ����: ������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С�
 *      ���ǣ���������ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
 *      ����һ���������� flowerbed ��ʾ��̳�������� 0 �� 1 ��ɣ����� 0 ��ʾû��ֲ����1 ��ʾ��ֲ�˻���
 *      ����һ���� n ���ܷ��ڲ�������ֲ�������������� n �仨�����򷵻� true �������򷵻� false ��
 * ����: 1 <= flowerbed.length <= 2 * 104
 *      flowerbed[i] Ϊ 0 �� 1
 *      flowerbed �в��������ڵ����仨
 *      0 <= n <= flowerbed.length
 *
 * ����: https://leetcode.cn/problems/can-place-flowers/description/?envType=daily-question&envId=2023-09-29
 *
 */
class Leetcode605 {

    /**
     *  ģ��
     *  ʱ�� 200ms
     *  �ڴ� 35.77MB
     */
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var sum = 0

        if (flowerbed.size >= 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1
                sum += 1
            }
        } else {
            if (flowerbed[0] == 0) {
                sum += 1
            }
        }

        for (i in 1..flowerbed.size - 2) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1
                sum += 1
            }
        }

        if (flowerbed.size >= 2) {
            if (flowerbed[flowerbed.size - 1] == 0 && flowerbed[flowerbed.size - 2] == 0) {
                sum += 1
            }
        }

        return sum >= n
    }

}