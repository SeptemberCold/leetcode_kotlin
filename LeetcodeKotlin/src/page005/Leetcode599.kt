package page005

/**
 *
 * ��Ŀ: �����б����С�����ܺ�
 *
 * ����: ���� Andy �� Doris �������ʱѡ��һ�Ҳ������������Ƕ���һ����ʾ��ϲ���������б�ÿ���������������ַ�����ʾ��
 *      ����Ҫ�������������ٵ��������ҳ����ǹ�ͬϲ���Ĳ����� ����𰸲�ֹһ������������д𰸲��Ҳ�����˳�� ����Լ�������Ǵ��ڡ�
 *
 * ����: 1 <= list1.length, list2.length <= 1000
 *      1 <= list1[i].length, list2[i].length <= 30
 *      list1[i] �� list2[i] �ɿո� ' ' ��Ӣ����ĸ��ɡ�
 *      list1 �������ַ������� Ψһ �ġ�
 *      list2 �е������ַ������� Ψһ �ġ�
 *
 * ����: https://leetcode.cn/problems/minimum-index-sum-of-two-lists/description/
 *
 */
class Leetcode599 {


    /**
     * ����˫��ϣ��
     * ʱ�� 292ms
     * �ڴ� 37.26MB
     */
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        //������һ��������
        val list1Map = HashMap<String, Int>()
        for (i in list1.indices) {
            list1Map[list1[i]] = i
        }
        //�����������ڶ���������
        val result = HashMap<Int, ArrayList<String>>()
        for (i in list2.indices) {
            //���list2�к�list1һ�����ֶ� �������ǵĺͼ��뵽result��
            val j = list1Map[list2[i]]
            if (j != null) {
                val key = i + j
                val arrayList = result[key]
                if (arrayList == null) {
                    result[key] = arrayListOf(list2[i])
                } else {
                    arrayList.add(list2[i])
                }
            }
        }
        //��ͷ��ʼ��������С��
        for (i in 0..(list1.size + list2.size)) {
            val strings = result[i]
            if (strings != null) return strings.toTypedArray()
        }

        return arrayOf()
    }

}