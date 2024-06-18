package page022

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: �۸����
 *
 * ����: ���� �������ɸ�������ɵ��ַ���������֮���õ����ո�ָ�������ÿ�����ʿ��԰������֡�Сд��ĸ������Ԫ���� '$' ��������ʵ���ʽΪ��Ԫ���ź����һ���Ǹ�ʵ������ô������ʾͱ�ʾһ�� �۸� ��
 *      ���� "$100"��"$23" �� "$6" ��ʾ�۸񣬶� "100"��"$" �� "$1e5 ���ǡ�
 *      ����һ���ַ��� sentence ��ʾһ�����Ӻ�һ������ discount ������ÿ����ʾ�۸�ĵ��ʣ����ڼ۸�Ļ����ϼ��� discount% ���� ���� �õ��ʵ������С����и��º�ļ۸�Ӧ�ñ�ʾΪһ�� ǡ�ñ���С�������λ �����֡�
 *      ���ر�ʾ�޸ĺ���ӵ��ַ�����
 *      ע�⣺���м۸� ��� Ϊ  10 λ���֡�
 * ����: 1 <= sentence.length <= 105
 *      sentence ��СдӢ����ĸ�����֡�' ' �� '$' ���
 *      sentence ����ǰ����β��ո�
 *      sentence �����е��ʶ��õ����ո�ָ�
 *      ���м۸��� �� �����Ҳ���ǰ����
 *      ���м۸� ��� Ϊ  10 λ����
 *      0 <= discount <= 100
 *
 * ����: https://leetcode.cn/problems/apply-discount-to-prices/description/?envType=daily-question&envId=2024-06-18
 *
 */
class Leetcode2288 {

    /**
     * ģ��
     * ʱ�� 708ms
     * �ڴ� 59.91MB
     */
    fun discountPrices(sentence: String, discount: Int): String {
        val words = sentence.split(" ")
        val sb = StringBuilder()
        var isNumber: Boolean
        for (word in words) {
            //������Ȳ���2λ
            if (word.length < 2) {
                sb.append(word).append(" ")
                continue
            }
            //�����λ������Ԫ����
            if (word[0] != '$') {
                sb.append(word).append(" ")
                continue
            }
            //����Ƿ�������
            isNumber = true
            for (i in 1 until word.length) {
                if (word[i] !in '0'..'9') {
                    isNumber = false
                    break
                }
            }
            //��������
            if (!isNumber) {
                sb.append(word).append(" ")
                continue
            }
            //����
            val number = word.substring(1, word.length).toDouble()
            val d = number - number * discount / 100
            val format = String.format("%.2f", d)
            sb.append("$").append(format).append(" ")
        }
        if (words.isNotEmpty()) {
            sb.deleteAt(sb.length - 1)
        }
        return sb.toString()
    }

}