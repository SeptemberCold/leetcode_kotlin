package page008

/**
 *
 * ��Ŀ: ����ĵ���
 *
 * ����: ����һ���ַ��� paragraph ��һ����ʾ���ôʵ��ַ������� banned ��
 *      ���س���Ƶ����ߵķǽ��ôʡ���Ŀ���� ��֤ ���ٴ���һ���ǽ��ôʣ��Ҵ� Ψһ ��
 *      paragraph �еĵ��� �����ִ�Сд ����Ӧ�� Сд ��ʽ���ء�
 *
 * ����: 1 <= paragraph.length <= 1000
 *      paragraph ��Ӣ����ĸ���ո� ' '�������·�����ɣ�"!?',;."
 *      0 <= banned.length <= 100
 *      1 <= banned[i].length <= 10
 *      banned[i] ����СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/number-of-lines-to-write-string/description/
 *
 */
class Leetcode819 {

    /**
     * ��ϣ��
     * ʱ�䣺227ms
     * �ڴ棺38.70MB
     */
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        //�������
        var temp = paragraph.replace(".", " ")
        temp = temp.replace(",", " ")
        temp = temp.replace("!", " ")
        temp = temp.replace("?", " ")
        temp = temp.replace(";", " ")
        temp = temp.replace("'", " ")
        //��¼���ʳ��ֵĴ���
        val strings = temp.split(" ")
        val hashMap = HashMap<String, Int>()
        for (str in strings) {
            if (str.isNotEmpty()) {
                val s = str.lowercase()
                hashMap[s] = (hashMap[s] ?: 0) + 1
            }
        }
        //���������ĵ���
        var answer = ""
        var count = 0
        for ((key, value) in hashMap) {
            if (banned.contains(key)) continue
            if (value > count) {
                count = value
                answer = key
            }
        }
        return answer
    }

}