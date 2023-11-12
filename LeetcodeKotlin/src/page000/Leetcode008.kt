package page000

/**
 *
 * ��Ŀ: �ַ���ת������ (atoi)
 *
 * ����: ������ʵ��һ�� myAtoi(string s) ������ʹ���ܽ��ַ���ת����һ�� 32 λ�з������������� C/C++ �е� atoi ��������
 *      ���� myAtoi(string s) ���㷨���£�
 *      �����ַ������������õ�ǰ���ո�
 *      �����һ���ַ������軹δ���ַ�ĩβ��Ϊ�����Ǹ��ţ���ȡ���ַ�������У��� ȷ�����ս���Ǹ������������� ������߶������ڣ���ٶ����Ϊ����
 *      ������һ���ַ���ֱ��������һ���������ַ��򵽴�����Ľ�β���ַ��������ಿ�ֽ������ԡ�
 *      ��ǰ�沽��������Щ����ת��Ϊ����������"123" -> 123�� "0032" -> 32�������û�ж������֣�������Ϊ 0 ����Ҫʱ���ķ��ţ��Ӳ��� 2 ��ʼ����
 *      ������������� 32 λ�з���������Χ [Int.MIN_VALUE,  Int.MAX_VALUE] ����Ҫ�ض����������ʹ�䱣���������Χ�ڡ�
 *      ������˵��С�� Int.MIN_VALUE ������Ӧ�ñ��̶�Ϊ Int.MIN_VALUE ������ Int.MAX_VALUE ������Ӧ�ñ��̶�Ϊ Int.MAX_VALUE ��
 *      ����������Ϊ���ս����
 *      ע�⣺
 *          �����еĿհ��ַ�ֻ�����ո��ַ� ' ' ��
 *          ��ǰ���ո�����ֺ�������ַ����⣬������� �κ������ַ���
 * ����: 0 <= s.length <= 200
 *      s ��Ӣ����ĸ����д��Сд�������֣�0-9����' '��'+'��'-' �� '.' ���
 *
 * ����: https://leetcode.cn/problems/string-to-integer-atoi/description/
 *
 */
class Leetcode008 {


    /**
     * �����ж�
     * ʱ�� 204ms
     * �ڴ� 35.92MB
     */
    fun myAtoi(s: String): Int {
        //ȥ���ո�
        val list = s.split(" ")
        for (i in list) {
            if (i.isEmpty()) continue
            val numberSb = StringBuilder()
            var isUp = true
            when (i[0]) {
                '+' -> isUp = true
                '-' -> isUp = false
                in '0'..'9' -> numberSb.append(i[0])
                else -> break
            }
            //�������
            for (j in 1 until i.length) {
                if (i[j] in '0'..'9') {
                    numberSb.append(i[j])
                } else {
                    break
                }
            }
            //ת��int
            val numberStr = numberSb.toString()
            if (numberStr.isNotEmpty()) {
                val toDouble = if (isUp) numberStr.toDouble() else numberStr.toDouble() * -1
                if (toDouble < Int.MIN_VALUE) return Int.MIN_VALUE
                if (toDouble > Int.MAX_VALUE) return Int.MAX_VALUE
                return toDouble.toInt()
            }
            break
        }
        return 0
    }

}