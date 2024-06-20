package page027

/**
 *
 * ��Ŀ: �����±�Ե���Ŀ
 *
 * ����: ����һ���±�� 0 ��ʼ���������� nums ��
 *      ����±�� i��j ���� 0 �� i < j < nums.length ��
 *      ��� nums[i] �� ��һ������ �� nums[j] �� ���һ������ ���� ��
 *      ����Ϊ nums[i] �� nums[j] ��һ�� �����±�� ��
 *      ���� nums �� �����±�� ������Ŀ��
 *      ������������ x �� y ����������ڴ��� 1 �����������������ǣ�
 *      ����Ϊ x �� y ���� ��������֮����� gcd(x, y) == 1 ��
 *      ����Ϊ x �� y ���ʣ����� gcd(x, y) �� x �� y �� ������� ��
 *
 * ����: 2 <= nums.length <= 100
 *      1 <= nums[i] <= 9999
 *      nums[i] % 10 != 0
 *
 * ����: https://leetcode.cn/problems/number-of-beautiful-pairs/description/?envType=daily-question&envId=2024-06-20
 *
 */
class Leetcode2748 {

    /**
     * �⺯��+ģ��
     * ʱ�䣺360ms
     * �ڴ棺56.50MB
     */
    fun countBeautifulPairs(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                var a = nums[i].toString().substring(0, 1).toInt()
                var b = nums[j] % 10
                //���������Ƿ���
                while (b != 0) {
                    val temp = b
                    b = a % b
                    a = temp
                }
                if (a == 1) count += 1
            }
        }
        return count
    }

}