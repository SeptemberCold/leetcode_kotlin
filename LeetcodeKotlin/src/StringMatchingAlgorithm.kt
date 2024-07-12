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
     * ��֪��ɶ�㷨 �Լ���� ���ü��ϼ�¼ǰ׺ƥ��ɹ����±�
     */
    fun key2(str1: String, str2: String): Boolean {
        //����ֵ����һ��
        if (str1.isEmpty() && str2.isNotEmpty()) return false
        if (str2.isEmpty()) return true

        val keys = ArrayList<Int>()
        for (i in 0 until str1.length - str2.length) {
            keys.add(i)
        }
        for (i in str2.indices) {
            val temp = HashSet<Int>()
            for (key in keys) {
                if (str1[key + i] != str2[i]) {
                    temp.add(key)
                }
            }
            keys.removeAll(temp)
        }
        return keys.isNotEmpty()
    }


    /**
     * kmp�㷨
     */
    fun kmp(haystack: String, needle: String): Boolean {
        //�Ӵ����==0������
        if (needle.isEmpty()) return true
        var i = 0
        var j = 0
        //�����ǰ׺��Ǳ�
        val next = nextBuilder(needle)
        while (i < haystack.length && j < needle.length) {
            //����ַ���ͬ��ָ���ƶ�����һλ
            if (haystack[i] == needle[j]) {
                i += 1
                j += 1
            }
            //����ַ���ͬ ���ַ�����ָ���ƶ������ַ�����һ���й�ͬ�ǰ׺���±���
            else {
                //�������ǰ׺�±����-1��ʾû�й���ǰ׺ ��ͷ�ȶ���һ��Ԫ��
                if (j == 0) {
                    i += 1
                } else {
                    j = next[j]
                }
            }
        }
        return j >= needle.length
    }

    /**
     * ����next�����
     */
    private fun nextBuilder(needle: String): IntArray {
        val m = needle.length
        //next�����
        val next = IntArray(m)
        next[0] = -1
        var t = -1
        var i = 0

        while (i < m - 1) {
            if (t < 0 || needle[t] == needle[i]) {
                t += 1
                i += 1
                next[i] = t
            } else t = next[t]
        }
        return next
    }


}