package page031

/**
 *
 * ��Ŀ: ������������
 *
 * ����: ����һ���������� nums��
 *      ������������һ����ͬ�ģ������� nums �� �±� �� �����롣
 *
 * ����: 1 <= nums.length <= 3 * 105
 *      1 <= nums[i] <= 100
 *      ���뱣֤ nums ��������һ��������
 *
 * ����: https://leetcode.cn/problems/maximum-prime-difference/description/?envType=daily-question&envId=2024-07-02
 *
 */
class Leetcode3115 {

    /**
     * ����ɸ
     * ʱ�䣺609ms
     * �ռ䣺91.38MB
     */
    fun maximumPrimeDifference(nums: IntArray): Int {
        //����ɸ 100���ڵ�����
        val primes = ArrayList<Int>()
        val mNums = ArrayList<Int>()
        val temp = ArrayList<Int>()
        for (i in 2..100) {
            mNums.add(i)
        }
        while (mNums.isNotEmpty() && mNums[0] * mNums[0] < mNums[mNums.size - 1]) {
            val prime = mNums[0]
            temp.clear()
            for (i in mNums) {
                if (i % prime != 0) {
                    temp.add(i)
                }
            }
            mNums.clear()
            mNums.addAll(temp)
            primes.add(prime)
        }
        primes.addAll(mNums)
        var min = 0
        for (i in nums.indices) {
            if (primes.contains(nums[i])) {
                min = i
                break
            }
        }
        var max = 0
        for (i in nums.indices) {
            if (primes.contains(nums[nums.size - 1 - i])) {
                max = nums.size - 1 - i
                break
            }
        }
        return max - min
    }

}