package page002

/**
 *
 * ��Ŀ: ���ʹ���
 *
 * ����: ����һ�ֹ��� pattern��һ���ַ���s���ж� s�Ƿ���ѭ��ͬ�Ĺ��ɡ�
 *      �������ѭָ��ȫƥ�䣬���磬pattern���ÿ����ĸ���ַ���s�е�ÿ���ǿյ���֮�������˫�����ӵĶ�Ӧ���ɡ�
 * ����: 1 <= pattern.length <= 300
 *      patternֻ����СдӢ����ĸ
 *      1 <= s.length <= 3000
 *      sֻ����СдӢ����ĸ��' '
 *      s������ �κ�ǰ����β��Կո�
 *      s��ÿ�����ʶ��� �����ո� �ָ�
 * ����: https://leetcode.cn/problems/word-pattern/
 *
 */
class Leetcode290 {

    /**
     * ��ϣ��
     * ִ����ʱ��188 ms
     * �ڴ����ģ�34.2 MB
     */
    fun wordPattern(pattern: String, s: String): Boolean {
        val array = s.split(" ")

        if (pattern.length != array.size) return false

        val map = HashMap<Char, String>()
        val map2 = HashMap<String, Char>()

        for (i in pattern.indices) {
            val m = map[pattern[i]]
            val n = map2[array[i]]
            if (m == null && n == null) {
                map[pattern[i]] = array[i]
                map2[array[i]] = pattern[i]
            } else if (m != null && n != null) {
                if (map[pattern[i]] != array[i] || map2[array[i]] != pattern[i]) {
                    return false
                }
            } else {
                return false
            }
        }
        return true
    }


}