package page002

/**
 *
 * ��Ŀ: H ָ�� II
 *
 * ����: ����һ���������� citations ��
 *      ���� citations[i] ��ʾ�о��ߵĵ� i ƪ���ı����õĴ�����citations �Ѿ����� �������� ��
 *      ���㲢���ظ��о��ߵ� h ָ����
 *      h ָ���Ķ��壺h ���������ô�������high citations����
 *      һ��������Ա�� h ָ����ָ���������� ��n ƪ�����У��ܹ��� h ƪ���ķֱ����������� h �Ρ�
 *      ������Ʋ�ʵ�ֶ���ʱ�临�Ӷȵ��㷨��������⡣
 * ����: n == citations.length
 *      1 <= n <= 105
 *      0 <= citations[i] <= 1000
 *      citations �� ��������
 *
 * ����: https://leetcode.cn/problems/h-index-ii/description/?envType=daily-question&envId=2023-10-30
 *
 */
class Leetcode275 {

    /**
     *  ���ֲ�ѯ
     *  ʱ�� 204ms
     *  �ڴ� 41.41MB
     */
    fun hIndex(citations: IntArray): Int {
        var start = 0
        var end = citations.size - 1
        while (start <= end) {
            val index = (start + end) / 2
            if (citations[index] >= citations.size - index) {
                end = index - 1
            } else {
                start = index + 1
            }
        }
        return citations.size - start
    }

}