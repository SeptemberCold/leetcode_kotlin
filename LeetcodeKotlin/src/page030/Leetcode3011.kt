package page030

/**
 *
 * ��Ŀ: �ж�һ�������Ƿ���Ա�Ϊ����
 *
 * ����: ����һ���±�� 0 ��ʼ��ȫ�� �� ���������� nums ��
 *      һ�� ���� �У�������� ���� Ԫ���ڶ���������λΪ 1 ����Ŀ ��ͬ ��
 *      ��ô����Խ�������Ԫ�ؽ����������ִ��������� ����� ��Ҳ���� 0 �Σ���
 *      ��������ʹ������������㷵�� true �����򷵻� false ��
 *
 * ����: 1 <= nums.length <= 100
 *      1 <= nums[i] <= 28
 *
 * ����: https://leetcode.cn/problems/find-if-array-can-be-sorted/description/?envType=daily-question&envId=2024-07-13
 *
 * ��ע��ʵ�ʲ������ֲ�����Ҫ����Ҫ����ſ��ԣ���Ŀ�����Ƿ�������Ե��
 *
 */
class Leetcode3011 {

    /**
     * ð������
     * ʱ�䣺253ms
     * �ڴ棺39MB
     */
    fun canSortArray(nums: IntArray): Boolean {
        val hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j] <= nums[j + 1]) continue
                //�ж����߶�����1�������Ƿ�һ�� ��һ�¾�û������
                val m = nums[j]
                val n = nums[j + 1]
                //m�Ķ����� 1�ĸ���
                var mCount = hashMap[m]
                if (mCount == null) {
                    mCount = 0
                    var temp = m
                    while (temp != 0) {
                        if (temp and 1 == 1) mCount += 1
                        temp = temp shr 1
                    }
                    hashMap[m] = mCount
                }
                //n�Ķ����� 1�ĸ���
                var nCount = hashMap[n]
                if (nCount == null) {
                    nCount = 0
                    var temp = n
                    while (temp != 0) {
                        if (temp and 1 == 1) nCount += 1
                        temp = temp shr 1
                    }
                    hashMap[n] = nCount
                }
                //��һ�����޷�����
                if (mCount != nCount) return false
                //���ݽ���
                nums[j] = n
                nums[j + 1] = m
            }
        }

        return true
    }

}