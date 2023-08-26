package page002

/**
 *
 * ��Ŀ: ��������
 *
 * ����: ����һ��  ���ظ�Ԫ�� �� ���� �������� nums ��
 *      ���� ǡ�ø����������������� �� ��С���� ���䷶Χ�б� ��
 *      Ҳ����˵��nums ��ÿ��Ԫ�ض�ǡ�ñ�ĳ�����䷶Χ�����ǣ����Ҳ���������ĳ����Χ�������� nums ������ x ��
 *      �б��е�ÿ�����䷶Χ [a,b] Ӧ�ð����¸�ʽ�����
 *      "a->b" ����� a != b
 *      "a" ����� a == b
 * ����: 0 <= nums.length <= 20
 *      -231 <= nums[i] <= 231 - 1
 *      nums �е�����ֵ�� ������ͬ
 *      nums ����������
 *
 * ����: https://leetcode.cn/problems/summary-ranges/description/
 *
 */
class Leetcode228 {

    /**
     * ģ��
     * ʱ�� 168ms
     * �ڴ� 32.72MB
     */
    fun summaryRanges(nums: IntArray): List<String> {
        //�ղδ���
        if (nums.isEmpty()) return ArrayList()

        //��ʼ��
        val result = ArrayList<String>()
        var start = nums[0]
        var temp = nums[0]

        for (i in 1 until nums.size) {
            val number = nums[i]
            if (number - temp != 1) {
                if (temp - start!=0){
                    result.add("${start}->${temp}")
                }else{
                    result.add("$start")
                }
                start = number
            }
            temp = number
        }
        if (temp - start!=0){
            result.add("${start}->${temp}")
        }else{
            result.add("$start")
        }
        return result
    }

}