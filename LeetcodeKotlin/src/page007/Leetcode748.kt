package page007

import java.util.*

/**
 *
 * ��Ŀ: ��̲�ȫ��
 *
 * ����: ����һ���ַ��� licensePlate ��һ���ַ������� words �������ҳ� words �е� ��̲�ȫ�� ��
 *      ��ȫ�� ��һ������ licensePlate ��������ĸ�ĵ��ʡ����� licensePlate �е� ���ֺͿո� ��
 *      �����ִ�Сд�����ĳ����ĸ�� licensePlate �г��ֲ�ֹһ�Σ���ô����ĸ�ڲ�ȫ���еĳ��ִ���Ӧ��һ�»��߸��ࡣ
 *      ���磺licensePlate = "aBc 12c"����ô���Ĳ�ȫ��Ӧ��������ĸ 'a'��'b' �����Դ�д�������� 'c' �����ܵ� ��ȫ�� �� "abccdef"��"caaacab" �Լ� "cbca" ��
 *      �뷵�� words �е� ��̲�ȫ�� ����Ŀ���ݱ�֤һ������һ����̲�ȫ�ʡ�
 *      ���ж�����ʶ�������̲�ȫ�ʵ�ƥ������ʱȡ words �� ��һ�� ���ֵ��Ǹ���
 * ����: 1 <= licensePlate.length <= 7
 *      licensePlate �����֡���Сд��ĸ��ո� ' ' ���
 *      1 <= words.length <= 1000
 *      1 <= words[i].length <= 15
 *      words[i] ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/shortest-completing-word/description/
 *
 */
class Leetcode748 {

    /**
     * ͳ��
     * ʱ�� 200ms
     * �ڴ� 35.99MB
     */
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        var result = ""
        //��������ͳ�Ƶ�����
        val array = getArray(licensePlate)

        //���ÿ���ַ����ֵĴ���
        for (word in words) {
            val wordArray = getArray(word)
            var isCompletingWord = true
            for (i in 0 until 26) {
                //���ǲ�ȫ������ѭ��
                if (wordArray[i] < array[i]) {
                    isCompletingWord = false
                    break
                }
            }
            //�ǲ�ȫ�ʵĻ����һ���Ƿ���Ҫ�滻���ؽ��
            if (isCompletingWord){
                if (result.isEmpty() || result.length > word.length ){
                    result = word
                }
            }
        }
        return result
    }

    private fun getArray(word: String): Array<Int> {
        val array = Array(26) { return@Array 0 }
        val lowercase = word.lowercase(Locale.getDefault())
        for (c in lowercase) {
            if (c in 'a'..'z') {
                val i = c - 'a'
                array[i] = array[i] + 1
            }
        }
        return array
    }

}