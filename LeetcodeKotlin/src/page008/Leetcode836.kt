package page008

/**
 *
 * ��Ŀ: �����ص�
 *
 * ����: �������б� [x1, y1, x2, y2] ����ʽ��ʾ������ (x1, y1) Ϊ���½ǵ����꣬
 *      (x2, y2) �����Ͻǵ����ꡣ���ε����±�ƽ���� x �ᣬ���ұ�ƽ���� y �ᡣ
 *      ����ཻ�����Ϊ �� ������������ص�����Ҫ��ȷ���ǣ�ֻ�ڽǻ�߽Ӵ����������β������ص���
 *      ������������ rec1 �� rec2 ����������ص������� true�����򣬷��� false ��
 *
 * ����: rect1.length == 4
 *      rect2.length == 4
 *      -109 <= rec1[i], rec2[i] <= 109
 *      rec1 �� rec2 ��ʾһ�������Ϊ�����Ч����
 *
 * ����: https://leetcode.cn/problems/rectangle-overlap/description/
 *
 */
class Leetcode836 {

    /**
     * �����ж�
     * ��ʱ��151ms
     * �ڴ棺33.32MB
     */
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        //����1���ұ�С�ھ���2�����
        if (rec1[2] <= rec2[0]) return false
        //����1����ߴ��ھ���2���ұ�
        if (rec1[0] >= rec2[2]) return false
        //����1���±ߴ��ھ���2���ϱ�
        if (rec1[1] >= rec2[3]) return false
        //����1���ϱߴ��ھ���2���±�
        if (rec1[3] <= rec2[1]) return false
        //�ص�
        return true
    }

}