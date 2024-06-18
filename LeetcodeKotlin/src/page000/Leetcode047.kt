package page000

/**
 *
 * ��Ŀ: ȫ���� II
 *
 * ����: ����һ���ɰ����ظ����ֵ����� nums ��������˳�� �������в��ظ���ȫ���С�
 *
 * ����: 1 <= nums.length <= 8
 *      -10 <= nums[i] <= 10
 *
 * ����: https://leetcode.cn/problems/permutations-ii/description/
 *
 */
class Leetcode047 {

    /**
     * ģ�� ��ϣ
     * ʱ�� 275ms
     * �ڴ� 40.63MB
     */
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        val hashMap = HashMap<String, Int>()
        answer.add(arrayListOf(nums[0]))
        //�õ������������
        for (i in 1 until nums.size) {
            val num = nums[i]
            val tempList = ArrayList<List<Int>>()
            //�������е��������
            for (list in answer) {
                //ÿ����϶���һ��
                for (j in 0..list.size) {
                    val temp = ArrayList(list)
                    temp.add(j, num)
                    //���һ���������б�
                    if (!hashMap.containsKey(temp.toString())) {
                        tempList.add(temp)
                        hashMap[temp.toString()] = 1
                    }
                }
            }
            answer.clear()
            answer.addAll(tempList)
        }
        return answer
    }

}