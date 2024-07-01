package page008


/**
 *
 * ��Ŀ: ��תͼ��
 *
 * ����: ����һ�� n x n �Ķ����ƾ��� image ���� ˮƽ ��תͼ��Ȼ�� ��ת ͼ�񲢷��� ��� ��
 *      ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת�������򡣡�
 *      ���磬ˮƽ��ת [1,1,0] �Ľ���� [0,1,1]��
 *      ��תͼƬ����˼��ͼƬ�е� 0 ȫ���� 1 �滻�� 1 ȫ���� 0 �滻��
 *      ���磬��ת [0,1,1] �Ľ���� [1,0,0]��
 *
 * ����: n == image.length
 *      n == image[i].length
 *      1 <= n <= 20
 *      images[i][j] == 0 �� 1.
 *
 * ����: https://leetcode.cn/problems/flipping-an-image/
 *
 */
class Leetcode832 {

    /**
     * ģ�� λ����
     * ��ʱ��194ms
     * �ڴ棺39.87MB
     */
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (row in image) {
            val size = (row.size / 2) - (row.size and 1 xor 1)
            for (i in 0..size) {
                //������һ�¿��Բ��ý���
                if (row[i] == row[row.size - 1 - i]) {
                    if (i == row.size - 1 - i) {
                        row[i] = row[i] xor 1
                    } else {
                        row[i] = row[i] xor 1
                        row[row.size - 1 - i] = row[i]
                    }
                }
            }
        }
        return image
    }

}