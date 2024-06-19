package page004

/**
 *
 * ��Ŀ: �ظ������ַ���
 *
 * ����: ����һ���ǿյ��ַ��� s ������Ƿ����ͨ��������һ���Ӵ��ظ���ι��ɡ�
 *
 * ����: 1 <= s.length <= 104
 *      s ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/repeated-substring-pattern/description/
 *
 */
class Leetcode459 {

    /**
     * ����ö��
     * ʱ�� 265ms
     * �ڴ� 38.65MB
     */
    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.length == 1) return false

        for (i in 1..(s.length / 2)) {
            //û������ ������
            if (s.length % i != 0) {
                continue
            }
            val substring = s.substring(0, i)
            val array = s.split(substring)
            var allEmpty = true
            for (j in array){
                if (j.isNotEmpty()) {
                    allEmpty = false
                    break
                }
            }
            if (allEmpty) return true
        }
        return false
    }

}