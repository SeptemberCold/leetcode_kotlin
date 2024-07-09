package page006

/**
 *
 * ��Ŀ: ��֤���Ĵ� II
 *
 * ����: ����һ���ַ��� s����� ���Դ���ɾ��һ���ַ���
 *      �����ж� s �Ƿ��ܳ�Ϊ�����ַ���������ܣ����� true �����򣬷��� false ��
 *
 * ����: 1 <= s.length <= 105
 *      s ��СдӢ����ĸ���
 *
 * ����: https://leetcode.cn/problems/robot-return-to-origin/
 *
 */
class Leetcode680 {

    /**
     * ˫ָ��
     * ʱ�䣺282ms
     * �ڴ棺39.05MB
     */
    fun validPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1
        while (start < end) {
            val i = s[start]
            val j = s[end]
            if (i != j) {
                var fair = 0
                //ɾ�����
                var mStart = 1 + start
                var mEnd = end
                while (mStart < mEnd) {
                    val m = s[mStart]
                    val n = s[mEnd]
                    if (m != n) fair += 1
                    //��һ��ѭ��
                    mStart += 1
                    mEnd -= 1
                }
                if (fair == 0) return true
                //ɾ���ұ�
                mStart = start
                mEnd = end - 1
                fair = 0
                while (mStart < mEnd) {
                    val m = s[mStart]
                    val n = s[mEnd]
                    if (m != n) fair += 1
                    //��һ��ѭ��
                    mStart += 1
                    mEnd -= 1
                }
                return fair == 0
            }
            //��һ��ѭ��
            start += 1
            end -= 1
        }
        return true
    }

}