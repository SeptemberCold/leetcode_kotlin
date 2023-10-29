package page002

/**
 *
 * ��Ŀ: H ָ��
 *
 * ����: ����һ���������� citations ������ citations[ i] ��ʾ�о��ߵĵ� i ƪ���ı����õĴ��������㲢���ظ��о��ߵ� h ָ����
 *      ����ά���ٿ��� h ָ���Ķ��壺h ���������ô����� ��һ��������Ա�� h ָ�� ��ָ�����������ٷ����� h ƪ���ģ�����ÿƪ���� ���� ������ h �Ρ�
 *      ��� h �ж��ֿ��ܵ�ֵ��h ָ�� �����������Ǹ���
 * ����: n == citations.length
 *      1 <= n <= 5000
 *      0 <= citations[i] <= 1000
 *
 * ����: https://leetcode.cn/problems/h-index/description/?envType=daily-question&envId=2023-10-29
 *
 */
class Leetcode274 {

    /**
     * ���� + ����
     * ʱ�� 188ms
     * �ڴ� 32.79MB
     */
    fun hIndex(citations: IntArray): Int {
        //����1000�����ֵ ÿƪ������౻����1000��
        for (i in citations.indices) {
            for (j in i until citations.size) {
                if (citations[i] > citations[j]) {
                    val temp = citations[i]
                    citations[i] = citations[j]
                    citations[j] = temp
                }
            }
        }

        var h = 0
        var index = 0
        for (i in 1..1000) {
            //��sumƪ�������ô�������i
            var sum = 0
            for (j in index until citations.size) {
                if (i <= citations[j]) {
                    index = j
                    sum = citations.size - index
                    break
                }
            }
            if (i <= sum) {
                h = i
            }else{
                return h
            }
        }
        return h
    }


}