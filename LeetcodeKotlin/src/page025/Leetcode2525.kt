package page025

/**
 *
 * ��Ŀ: ���ݹ������ӷ���
 *
 * ����: �����ĸ����� length ��width ��height �� mass ���ֱ��ʾһ�����ӵ�����ά�Ⱥ����������㷵��һ����ʾ���� ��� ���ַ�����
 *      �������������������ô������ "Bulky" �ģ�
 *          ���� ������һ�� ά�ȴ��ڵ��� 104 ��
 *          �������ӵ� ��� ���ڵ��� 109 ��
 *          ������ӵ��������ڵ��� 100 ����ô������ "Heavy" �ġ�
 *          �������ͬʱ�� "Bulky" �� "Heavy" ����ô�������Ϊ "Both" ��
 *          ������ӼȲ��� "Bulky" ��Ҳ���� "Heavy" ����ô�������Ϊ "Neither" ��
 *          ��������� "Bulky" ������ "Heavy" ����ô�������Ϊ "Bulky" ��
 *          ��������� "Heavy" ������ "Bulky" ����ô�������Ϊ "Heavy" ��
 *          ע�⣬���ӵ�����������ӵĳ��ȡ���Ⱥ͸߶ȵĳ˻���
 * ����: 1 <= length, width, height <= 105
 *      1 <= mass <= 103
 *
 * ����: https://leetcode.cn/problems/categorize-box-according-to-criteria/description/?envType=daily-question&envId=2023-10-20
 *
 */
class Leetcode2525 {

    /**
     * ��ѧ����
     * ʱ�� 132ms
     * �ڴ� 32.24MB
     */
    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        var result = ""
        if (length >= 10000 || width >= 10000 || height >= 10000 || (length.toDouble() * width * height) >= 1000000000) {
            result = "Bulky"
        }
        if (mass >= 100) {
            return if (result.isEmpty()) {
                "Heavy"
            } else {
                "Both"
            }
        }
        return result.ifEmpty { "Neither" }
    }

}