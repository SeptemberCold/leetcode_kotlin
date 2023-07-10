package page000

/**
 *
 * ��Ŀ: ��ӽ�������֮��
 *
 * ����: ����һ������Ϊ n ����������nums�� һ��Ŀ��ֵtarget������� nums ��ѡ������������ʹ���ǵĺ���target��ӽ���
 *      �������������ĺ͡�
 *      �ٶ�ÿ������ֻ����ǡ��һ���⡣
 * ����: 3 <= nums.length <= 1000
 *      -1000 <= nums[i] <= 1000
 *      -104 <= target <= 104
 *
 * ����: https://leetcode.cn/problems/3sum-closest/
 *
 */
class Leetcode016 {

    /**
     * ����ѭ�������ƽ�
     * ִ����ʱ��692 ms
     * �ڴ����ģ�36.8 MB
     */
    fun threeSumClosest(nums: IntArray, target: Int): Int {

        var sum = 0
        var temp = Int.MAX_VALUE

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (o in j + 1 until nums.size) {
                    val mSum = nums[i] + nums[j] + nums[o]
                    val mTemp = if (mSum > target) mSum - target else target - mSum
                    //����0
                    if (mTemp == 0) {
                        return mSum
                    }
                    //С��0
                    else if (mTemp < 0) {
                        if (mTemp * -1 < temp) {
                            temp = mTemp * -1
                            sum = mSum
                        }
                    }
                    //����0
                    else {
                        if (mTemp < temp) {
                            temp = mTemp
                            sum = mSum
                        }
                    }
                }
            }
        }
        return sum
    }

}