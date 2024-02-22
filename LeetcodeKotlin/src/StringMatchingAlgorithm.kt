/**
 * �ַ���ƥ���㷨
 */
class StringMatchingAlgorithm {


    /**
     * ������BF�㷨
     */
    fun bf(str1: String, str2: String): Boolean {
        var isSubstring: Boolean
        for (i in 0..str1.length - str2.length) {
            isSubstring = true
            for (j in str2.indices) {
                if (str1[i + j] != str2[j]) {
                    //�����Ӵ�
                    isSubstring = false
                    break
                }
            }
            if (isSubstring) return true
        }
        return false
    }

    /**
     * ��֪��ɶ�㷨 �Լ���� ���ü��ϼ�¼ǰ׺ƥ��ɹ����±�
     */
    fun key(str1: String, str2: String): Boolean {
        //����ֵ����һ��
        if (str1.isEmpty() && str2.isNotEmpty()) return false
        if (str2.isEmpty()) return true
        //�洢ǰ׺ƥ�������
        val keys = ArrayList<Int>()
        val temp = ArrayList<Int>()
        //����û�п�ֵ�� ������ȡ��һ��ǰ׺��ƥ������
        for (i in str1.indices) {
            if (str1[i] == str2[0]) {
                keys.add(i)
            }
        }
        if (str2.length == 1) {
            return keys.isNotEmpty()
        }
        //������1��ʼ��� ����0�Ѿ�ƥ�����
        var index = 1
        while (keys.isNotEmpty()) {
            //��ǰ׺ƥ��ɹ�����������
            for (i in keys) {
                //����Ƿ���������Χ��
                if (i + 1 < str1.length) {
                    if (str1[i + 1] == str2[index]) {
                        temp.add(i + 1)
                    }
                }
            }
            //����ת��
            keys.clear()
            keys.addAll(temp)
            temp.clear()
            //����ƥ����һλ
            index += 1
            //ƥ�䵽���һλ�� ���keyֵ���б�ʾƥ��ɹ�
            if (index == str2.length) {
                return keys.isNotEmpty()
            }
        }
        return false
    }

    /**
     * kmp�㷨
     */
    fun kmp(str1: String, str2: String): Boolean {
        //TODO
        return false
    }


}