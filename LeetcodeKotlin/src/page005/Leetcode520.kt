package page005

/**
 *
 * ��Ŀ: ����д��ĸ
 *
 * ����: ���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
 *      ȫ����ĸ���Ǵ�д������ "USA" ��
 *      ������������ĸ�����Ǵ�д������ "leetcode" ��
 *      ������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google" ��
 *      ����һ���ַ��� word �������д�÷���ȷ������ true �����򣬷��� false ��
 *
 * ����: 1 <= word.length <= 100
 *      word ��Сд�ʹ�дӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/detect-capital/description/
 *
 */
class Leetcode520 {

    /**
     * ͳ��
     * ִ����ʱ��141 ms
     * �ڴ����ģ�36.61 MB
     */
    fun detectCapitalUse(word: String): Boolean {
        var count = 0
        for (i in word) {
            if (i < 'a') count += 1
        }
        //���Ǵ�д
        if (count == word.length) return true
        //����Сд
        if (count == 0) return true
        //����ĸ��д
        return count == 1 && word[0] < 'a'
    }

}