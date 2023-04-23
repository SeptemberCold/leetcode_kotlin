package page010

import java.util.*


/**
 *
 * ��Ŀ: ��Ȳ�����
 *
 * ����: ����һ����������nums������ nums����Ȳ������еĳ��ȡ�
 *      ����һ�£�nums ����������һ���б�nums[i1], nums[i2], ..., nums[ik] ��
 *      ��0 <= i1 < i2 < ... < ik <= nums.length - 1��
 *      �������seq[i+1] - seq[i](0 <= i < seq.length - 1) ��ֵ����ͬ����ô����seq�ǵȲ�ġ�
 * ����: 2 <= nums.length <= 100
 *      0 <= nums[i] <= 500
 *
 * ����: https://leetcode.cn/problems/longest-arithmetic-subsequence/
 *
 */
class Leetcode1027 {

    /**
     * �����Ķ�̬�滮
     * ִ����ʱ��428 MS
     * �ڴ����ģ�44.6 MB
     */
    fun longestArithSeqLength(nums: IntArray?): Int {
        //����Ϊnull��ʱ�� ����0
        if (nums == null) return 0
        val min = Arrays.stream(nums).min().asInt
        val max = Arrays.stream(nums).max().asInt
        val diff = max - min
        //��ά���� ����˵һά���� ֵ��map
        val dp = Array(nums.size) { Array(diff * 2 + 1) { 1 } }
        var answer = 0
        //�ӵڶ�����ʼ����
        for (i in 1 until nums.size) {
            //��ǰ��ûһ��ֵ���бȽ� �������ֵ
            for (j in 0 until i) {
                //��ֵ
                val d = nums[i] - nums[j]
                //���ȼ�1
                dp[i][diff + d] = dp[j][diff + d] + 1
                //�Ƚ��Ƿ��
                answer = answer.coerceAtLeast(dp[i][diff + d])
            }
        }
        return answer
    }

}