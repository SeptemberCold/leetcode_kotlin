package page003

/**
 *
 * ��Ŀ: 3 ����
 *
 * ����: ����һ��������дһ���������ж����Ƿ��� 3 ���ݴη�������ǣ����� true �����򣬷��� false ��
 *      ���� n �� 3 ���ݴη������㣺�������� x ʹ�� n == 3x
 * ����: -231 <= n <= 231 - 1
 *
 * ����: https://leetcode.cn/problems/power-of-three/description/
 *
 */
class Leetcode326 {

    /**
     * ����ö��
     * 268 ms
     * 35.64 MB
     */
    fun isPowerOfThree(n: Int): Boolean {
        when (n) {
            1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467 -> return true
        }
        return false
    }

}