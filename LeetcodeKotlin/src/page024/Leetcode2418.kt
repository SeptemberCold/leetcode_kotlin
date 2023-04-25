package page024

/**
 *
 * ��Ŀ: ���������
 *
 * ����: ����һ���ַ������� names ����һ���� ������ͬ ����������ɵ����� heights ����������ĳ��Ⱦ�Ϊ n ��
 *      ����ÿ���±� i��names[i] �� heights[i] ��ʾ�� i ���˵����ֺ���ߡ�
 *      �밴��� ���� ˳�򷵻ض�Ӧ���������� names ��
 * ����: n == names.length == heights.length
 *      1 <= n <= 103��
 *      1 <= names[i].length <= 20
 *      1 <= heights[i] <= 105
 *      names[i] �ɴ�СдӢ����ĸ���
 *      heights �е�����ֵ������ͬ
 *
 * ����: https://leetcode.cn/problems/sort-the-people/
 *
 */
class Leetcode2418 {

    /**
     * ð������
     * ִ����ʱ��292 ms
     * �ڴ����ģ�36 MB
     */
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        for (j in heights.indices) {
            for (i in 1 until heights.size - j) {
                if (heights[i - 1] < heights[i]) {
                    val temp = heights[i - 1]
                    heights[i - 1] = heights[i]
                    heights[i] = temp

                    val strTemp = names[i - 1]
                    names[i - 1] = names[i]
                    names[i] = strTemp
                }
            }
        }
        return names
    }

}