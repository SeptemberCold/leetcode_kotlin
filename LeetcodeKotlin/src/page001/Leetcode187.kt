package page001

/**
 *
 * ��Ŀ: �ظ���DNA����
 *
 * ����: DNA���� ��һϵ�к�������ɣ���дΪ 'A', 'C', 'G' �� 'T'.��
 *      ���磬"ACGAATTCCG" ��һ�� DNA���� ��
 *      ���о� DNA ʱ��ʶ�� DNA �е��ظ����зǳ����á�
 *      ����һ����ʾ DNA���� ���ַ��� s ������������ DNA �����г��ֲ�ֹһ�ε� ����Ϊ 10 ������(���ַ���)������԰� ����˳�� ���ش𰸡�
 * ����: 0 <= s.length <= 105
 *      s[i]=='A'��'C'��'G' or 'T'
 *
 * ����: https://leetcode.cn/problems/repeated-dna-sequences/description/?envType=daily-question&envId=2023-11-05
 *
 */
class Leetcode187 {

    /**
     * ��ϣ��
     * ʱ�� 292ms
     * �ڴ� 45.70MB
     */
    fun findRepeatedDnaSequences(s: String): List<String> {
        if (s.length <= 10) return ArrayList()
        //�����г���10�����ַ��������ϣ��
        val hashMap = HashMap<String, Int>()
        for (i in 0..s.length - 10) {
            val substring = s.substring(i, i + 10)
            hashMap[substring] = (hashMap[substring] ?: 0) + 1
        }
        //�����ҵ����ֲ�ֹһ���ַ���
        val answer = ArrayList<String>()
        for (entry in hashMap) {
            if (entry.value >= 2) {
                answer.add(entry.key)
            }
        }
        return answer
    }

}