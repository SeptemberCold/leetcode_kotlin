package page007

/**
 *
 * ��Ŀ: ��ʯ��ʯͷ
 *
 * ����: ����һ���ַ��� jewels ����ʯͷ�б�ʯ�����ͣ�����һ���ַ��� stones ������ӵ�е�ʯͷ��
 *      stones ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
 *      ��ĸ���ִ�Сд����� "a" �� "A" �ǲ�ͬ���͵�ʯͷ��
 *
 * ����: 1 <= jewels.length, stones.length <= 50
 *      jewels �� stones ����Ӣ����ĸ���
 *      jewels �е������ַ����� Ψһ��
 *
 * ����: https://leetcode.cn/problems/jewels-and-stones/description/
 *
 */
class Leetcode771 {

    /**
     * ��ϣ��ͳ��
     * ʱ�䣺141ms
     * �ڴ棺33.94MB
     */
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val hashMap = HashMap<Char, Int>()
        for (stone in stones) {
            hashMap[stone] = (hashMap[stone] ?: 0) + 1
        }
        var sum = 0
        for (jewel in jewels) {
            sum += (hashMap[jewel] ?: 0)
        }
        return sum
    }

}