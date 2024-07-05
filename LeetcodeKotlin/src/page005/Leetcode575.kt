package page005

/**
 *
 * ��Ŀ: ���ǹ�
 *
 * ����: Alice �� n ö�ǣ����е� i ö�ǵ�����Ϊ candyType[ i] ��Alice ע�⵽����������������������ǰȥ�ݷ���һλҽ����
 *      ҽ������ Alice Ҫ�������Ƿ֣�ֻ�Ե��������ǵ� n / 2 ���ɣ�n ��һ��ż������
 *      Alice �ǳ�ϲ����Щ�ǣ�����Ҫ����ѭҽ�����������£������ܳԵ���಻ͬ������ǡ�
 *      ����һ������Ϊ n ���������� candyType �����أ� Alice �ڽ��Ե� n / 2 ö�ǵ�����£����ԳԵ��ǵ� ��� ��������
 *
 * ����: n == candyType.length
 *      2 <= n <= 104
 *      n ��һ��ż��
 *      -105 <= candyType[i] <= 105
 *
 * ����: https://leetcode.cn/problems/distribute-candies/description/
 *
 */
class Leetcode575 {

    /**
     * ��ϣ��
     * ʱ�䣺548ms
     * �ڴ棺41.96MB
     */
    fun distributeCandies(candyType: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        for (i in candyType) {
            hashMap[i] = 1
        }
        return hashMap.size.coerceAtMost(candyType.size / 2)
    }


}