package page001

/**
 *
 * ��Ŀ: ��ת�ַ����еĵ���
 *
 * ����: ����һ���ַ��� s �����㷴ת�ַ����� ���� ��˳��
 *      ���� ���ɷǿո��ַ���ɵ��ַ�����s ��ʹ������һ���ո��ַ����е� ���� �ָ�����
 *      ���� ���� ˳��ߵ��� ���� ֮���õ����ո����ӵĽ���ַ�����
 *      ע�⣺�����ַ��� s�п��ܻ����ǰ���ո�β��ո���ߵ��ʼ�Ķ���ո�
 *      ���صĽ���ַ����У����ʼ�Ӧ�����õ����ո�ָ����Ҳ������κζ���Ŀո�
 *
 * ����: 1 <= s.length <= 104
 *      s ����Ӣ�Ĵ�Сд��ĸ�����ֺͿո� ' '
 *      s �� ���ٴ���һ�� ����
 *
 * ����: https://leetcode.cn/problems/reverse-words-in-a-string/description/
 *
 */
class Leetcode151 {

    /**
     * ԭ�ؽⷨ �ռ临�Ӷ�O(1) ʱ�临�Ӷȡ�����
     * ��ʱ��195ms
     * �ڴ棺36.82MB
     */
    fun reverseWords(s: String): String {
        //ת������ģ�� ��O(1)�ռ临�Ӷȵ�ԭ�ؽⷨ
        val array = s.toCharArray()
        //�ַ�����ת
        var temp: Char
        for (i in 0 until s.length / 2) {
            temp = array[i]
            array[i] = array[s.length - 1 - i]
            array[s.length - 1 - i] = temp
        }
        //ɾ������֮�����Ŀո� ���������ǰ�ÿո� �ַ���ǰ�����һ���ո� ��Ҫ���⴦������ո�
        deleteEmpty(array, 0)
        //���ǰ�ÿո� �о�ǰ��
        if (array[0] == ' ') {
            for (i in 0..array.size - 2) {
                array[i] = array[i + 1]
            }
            array[array.size - 1] = ' '
        }
        //��鵥�� ÿ�����ʵ�����ת
        var index = 0
        for (i in 1 until array.size) {
            //�����ո��˾ͷ�תǰ��ĵ��� ��ǰ�治�ǿո�
            if (array[i] == ' ' && array[i - 1] != ' ') {
                for (j in 0 until (i - index) / 2) {
                    temp = array[index + j]
                    array[index + j] = array[i - j - 1]
                    array[i - j - 1] = temp
                }
                index = i + 1
                continue
            }
            //����������Ŀո������涼�ǿո��� ����ѭ��
            if (array[i] == ' ' && array[i - 1] == ' ') {
                break
            }
        }
        //��������һλ���ǿո� ��תǰ��ĵ���
        if (array[array.size - 1] != ' ') {
            for (j in 0 until (array.size - index) / 2) {
                temp = array[index + j]
                array[index + j] = array[array.size - 1 - j]
                array[array.size - 1 - j] = temp
            }
        }
        //�Ӻ��濪ʼ���� �ҵ����ǿո������
        for (i in array.size - 1 downTo 0) {
            if (array[i] != ' ') {
                index = i + 1
                break
            }
        }
        //��ȡ���ݾ��ǽ����
        return String(array).substring(0, index)
    }

    //ɾ������֮�����Ŀո�
    private fun deleteEmpty(charArray: CharArray, start: Int) {
        //ɾ������֮�����Ŀո�
        //�������
        var index = 0
        var isEmpty = false
        for (i in start until charArray.size) {
            //��������ո���֮ǰû�������ո� �����ʼλ��
            if (charArray[i] == ' ' && !isEmpty) {
                isEmpty = true
                index = i
                continue
            }
            //���ǰ�������˿ո񵫱���û�������ո� �Ҿ������1 ���ݿ�ʼǰ��
            if (isEmpty && charArray[i] != ' ' && i - index > 1) {
                for (j in 0 until charArray.size - i) {
                    charArray[index + j + 1] = charArray[i + j]
                    charArray[i + j] = ' '
                }
                deleteEmpty(charArray, index)
                break
            }
            //��������˵��� ǰ��ֻ��һ���ո����û�пո� �޸ı��
            if (charArray[i] != ' ') {
                isEmpty = false
            }
        }
    }

}