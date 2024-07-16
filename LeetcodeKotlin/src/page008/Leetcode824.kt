package page008

import java.lang.StringBuilder

/**
 *
 * ��Ŀ: ɽ��������
 *
 * ����: ����һ�������ɵ�����ɵľ��� sentence �����ʼ��ɿո�ָ���ÿ�����ʽ��ɴ�д��СдӢ����ĸ��ɡ�
 *      ���㽫����ת��Ϊ ��ɽ�������ģ�Goat Latin������һ�������� �������� - Pig Latin ���鹹���ԣ���ɽ�������ĵĹ������£�
 *          ���������Ԫ����ͷ��'a', 'e', 'i', 'o', 'u'�����ڵ��ʺ����"ma"��
 *              ���磬���� "apple" ��Ϊ "applema" ��
 *          ��������Ը�����ĸ��ͷ��������Ԫ����ĸ�����Ƴ���һ���ַ��������ŵ�ĩβ��֮�������"ma"��
 *              ���磬���� "goat" ��Ϊ "oatgma" ��
 *          ���ݵ����ھ����е��������ڵ�����������������ͬ��������ĸ'a'�������� 1 ��ʼ��
 *              ���磬�ڵ�һ�����ʺ���� "a" ���ڵڶ������ʺ���� "aa" ���Դ����ơ�
 *          ���ؽ� sentence ת��Ϊɽ�������ĺ�ľ��ӡ�
 *
 * ����: 1 <= sentence.length <= 150
 *      sentence ��Ӣ����ĸ�Ϳո����
 *      sentence ����ǰ����β��ո�
 *      sentence �е����е����ɵ����ո�ָ�
 *
 * ����: https://leetcode.cn/problems/goat-latin/description/
 *
 */
class Leetcode824 {

    /**
     * ģ��
     * ʱ�䣺172ms
     * �ڴ棺37.13MB
     */
    fun toGoatLatin(sentence: String): String {
        //�����и�
        val words = sentence.split(" ")
        val sb = StringBuilder()
        for (i in words.indices) {
            val word = words[i]
            if (word.isEmpty()) continue
            when (word[0]) {
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> sb.append(word).append("ma")
                else -> {
                    val str = word.substring(1, word.length)
                    sb.append(str).append(word[0]).append("ma")
                }
            }
            for (j in 0..i) {
                sb.append("a")
            }
            sb.append(" ")
        }
        sb.deleteAt(sb.length - 1)
        return sb.toString()
    }

}