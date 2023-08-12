package page003

/**
 *
 * ��Ŀ: �����
 *
 * ����: ���������ַ�����ransomNote �� magazine ���ж� ransomNote �ܲ����� magazine ������ַ����ɡ�
 *      ������ԣ����� true �����򷵻� false ��
 *      magazine �е�ÿ���ַ�ֻ���� ransomNote ��ʹ��һ�Ρ�
 * ����: 1 <= ransomNote.length, magazine.length <= 105
 *      ransomNote �� magazine ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/ransom-note/description/
 *
 */
class Leetcode383 {

    /**
     * ��ϣ��
     * ʱ�� 268ms
     * �ڴ� 35.67mb
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val hash = HashMap<Char, Int>()
        for (c in magazine) {
            hash[c] = (hash[c] ?: 0) + 1
        }

        for (c in ransomNote) {
            val number = hash[c] ?: 0
            if (number == 0) {
                return false
            } else {
                hash[c] = number - 1
            }
        }
        return true
    }

}