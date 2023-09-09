package page005

import java.util.*
import kotlin.collections.ArrayList

/**
 *
 * ��Ŀ: ������
 *
 * ����: ����һ���ַ������� words ��ֻ���ؿ���ʹ���� ��ʽ���� ͬһ�е���ĸ��ӡ�����ĵ��ʡ���������ͼ��ʾ��
 *      ��ʽ���� �У�
 *          ��һ�����ַ� "qwertyuiop" ��ɡ�
 *          �ڶ������ַ� "asdfghjkl" ��ɡ�
 *          ���������ַ� "zxcvbnm" ��ɡ�
 * ����: 1 <= words.length <= 20
 *      1 <= words[i].length <= 100
 *      words[i] ��Ӣ����ĸ��Сд�ʹ�д��ĸ�����
 *
 * ����: https://leetcode.cn/problems/keyboard-row/description/
 *
 */
class Leetcode500 {

    /**
     * ����
     * ʱ�� 144ms
     * �ڴ� 33.56MB
     */
    fun findWords(words: Array<String>): Array<String> {

        val result = ArrayList<String>()

        for (word in words) {
            if (word.isEmpty()) {
                result.add(word)
            } else {
                //ת��Сд
                val lowercase = word.lowercase(Locale.getDefault())
                //��һ���ַ��ڵڼ���
                val temp = findWords(lowercase[0])
                //��ǰ�ַ��ڵڼ���
                var temp1 = temp
                for (c in lowercase) {
                    temp1 = findWords(c)
                    if (temp !=temp1) break
                }
                if (temp == temp1) result.add(word)
            }
        }
        return result.toTypedArray()
    }


    private fun findWords(word: Char): Int {
        val first = "qwertyuiop"
        val second = "asdfghjkl"
        val third = "zxcvbnm"
        return when (word) {
            in first -> 1
            in second -> 2
            in third -> 3
            else -> 0
        }
    }


}