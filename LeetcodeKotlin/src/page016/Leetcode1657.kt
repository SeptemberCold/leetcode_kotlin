package page016

/**
 *
 * ��Ŀ: ȷ�������ַ����Ƿ�ӽ�
 *
 * ����: �������ʹ�����²�����һ���ַ����õ���һ���ַ���������Ϊ�����ַ��� �ӽ� ��
 *      ���� 1�������������� ���� �ַ���
 *          ���磬abcde -> aecdb
 *      ���� 2����һ�� ���� �ַ���ÿ�γ���ת��Ϊ��һ�� ���� �ַ���������һ���ַ�ִ����ͬ�Ĳ�����
 *          ���磬aacabb -> bbcbaa������ a ת��Ϊ b �������е� b ת��Ϊ a ��
 *      ����Ը�����Ҫ������һ���ַ������ʹ�������ֲ�����
 *      ���������ַ�����word1 �� word2 ����� word1 �� word2 �ӽ� ���ͷ��� true �����򣬷��� false ��
 * ����: 1 <= word1.length, word2.length <= 105
 *      word1 �� word2 ������СдӢ����ĸ
 *
 * ����: https://leetcode.cn/problems/determine-if-two-strings-are-close/description/?envType=daily-question&envId=2023-11-30
 *
 */
class Leetcode1657 {


    /**
     * ��ϣ��ͳ��
     * 416 ms
     * 40.15 MB
     */
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val word1Map = HashMap<Char, Int>()
        val word2Map = HashMap<Char, Int>()
        for (i in word1) {
            word1Map[i] = (word1Map[i] ?: 0) + 1
        }
        for (i in word2) {
            word2Map[i] = (word2Map[i] ?: 0) + 1
        }

        if (word1Map.size != word2Map.size) return false

        for (entity in word1Map) {
            if (word2Map[entity.key] == entity.value) {
                word2Map.remove(entity.key)
            } else {
                for (entity2 in word2Map) {
                    if (entity2.value == entity.value) {
                        word2Map[entity2.key] = word2Map[entity.key] ?: 0
                        word2Map.remove(entity.key)
                        break
                    }
                }
            }
        }

        return word2Map.size == 0
    }

}