package page003

/**
 *
 * ��Ŀ: ��ת�ַ����е�Ԫ����ĸ
 *
 * ����: ����һ���ַ��� s ������ת�ַ����е�����Ԫ����ĸ�������ؽ���ַ�����
 *      Ԫ����ĸ���� 'a'��'e'��'i'��'o'��'u'���ҿ����Դ�Сд������ʽ���ֲ�ֹһ�Ρ�
 * ����: 1 <= s.length <= 3 * 105
 *      s �� �ɴ�ӡ�� ASCII �ַ����
 *
 * ����: https://leetcode.cn/problems/reverse-vowels-of-a-string/description/
 *
 */
class Leetcode345 {

    /**
     * ˫ָ��
     * 224 ms
     * 39.49 MB
     */
    fun reverseVowels(s: String): String {
        val array = s.toCharArray()

        var index = 0
        var end = array.size - 1

        val temp = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        while (index < end) {
            val c1 = array[index]
            val c2 = array[end]
            //��ת
            if (c1 in temp && c2 in temp) {
                array[index] = c2
                array[end] = c1
                index += 1
                end -= 1
            }
            //ǰָ��ǰ��
            else if (c2 in temp) {
                index += 1
            }
            //��ָ��ǰ��
            else if (c1 in temp) {
                end -= 1
            }
            //˫ָ�붼ǰ��
            else {
                index += 1
                end -= 1
            }
        }
        return String(array)
    }

}