package page024

import kotlin.math.abs

/**
 *
 * ��Ŀ: ɾ���ַ�ʹƵ����ͬ
 *
 * ����: ����һ���±�� 0��ʼ���ַ���word���ַ���ֻ����СдӢ����ĸ��
 *      ����Ҫѡ�� һ���±겢 ɾ���±괦���ַ���ʹ�� word��ʣ��ÿ����ĸ���� Ƶ����ͬ��
 *      ���ɾ��һ����ĸ��word��ʣ��������ĸ�ĳ���Ƶ�ʶ���ͬ����ô���� true�����򷵻� false��
 *      ע�⣺
 *      ��ĸ x �� Ƶ�� �������ĸ���ַ����г��ֵĴ�����
 *      �� ���� ǡ��ɾ��һ����ĸ������һ����ĸ����ɾ����
 *
 * ����: 2 <= word.length <= 100
 *      word ֻ����СдӢ����ĸ��
 *
 */
class Leetcode2423 {

    /**
     * ����ö��
     * ִ����ʱ��128 ms
     * �ڴ����ģ�32.2 MB
     */
    fun equalFrequency(word: String): Boolean {
        val map = HashMap<Char, Int>()
        //���Ƶ��
        for (c in word) {
            map[c] = (map[c] ?: 0) + 1
        }
        //�ַ����ֵ�Ƶ��
        var temp1 = -1
        var temp2 = -1
        //���ֵĴ���
        var temp1Sum = 0
        var temp2Sum = 0
        for (entry in map) {
            val value = entry.value
            //�ҵ���һ��Ƶ��
            if (temp1 == -1 || temp1 == value) {
                temp1 = value
                temp1Sum += 1
            }
            //�ҵ��ڶ���Ƶ��
            else if (temp2 == -1 || temp2 == value) {
                temp2 = entry.value
                temp2Sum += 1
            }
            //���ֵ�����Ƶ��
            else {
                return false
            }
        }
        //���ֻ��һ��Ԫ�� ֱ�ӷ���true
        if (map.size == 1) return true
        //ֻ���ֹ�һ��Ƶ�� ��Ƶ����1 ����ֱ�ӷ���true
        if (temp2Sum == 0 && temp1 == 1) return true
        //ֻ����һ�ε�Ƶ�� ��Ƶ����1 ����ֱ�ӷ���true
        if (temp2Sum == 1 && temp2 == 1) return true
        if (temp1Sum == 1 && temp1 == 1) return true
        //�������Ƶ�ʶ���γ��� ����false
        if (temp1Sum != 1 && temp2Sum != 1) return false
        //�������Ƶ�Ĳ�ֵ������1 ����false
        if (abs(temp1 - temp2) != 1) return false
        //�����ٵ�����Ƶ��һ����Ҫ�ȶ������Ƶ�ʴ�1
        if (temp1Sum > temp2Sum) return ((temp2 - temp1) == 1)
        if (temp2Sum > temp1Sum) return ((temp1 - temp2) == 1)
        //��1����Ƶ����ͬ
        return true
    }

}