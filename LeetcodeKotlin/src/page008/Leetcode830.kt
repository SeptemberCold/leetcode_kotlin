package page008

/**
 *
 * ��Ŀ: �ϴ�����λ��
 *
 * ����: ��һ����Сд��ĸ���ɵ��ַ��� s �У�������һЩ��������ͬ�ַ������ɵķ��顣
 *      ���磬���ַ��� s = "abbxxxxzyy" �У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣
 *      ������������� [start, end] ��ʾ������ start �� end �ֱ��ʾ�÷������ʼ����ֹλ�õ��±ꡣ�����е� "xxxx" �����������ʾΪ [3,6] ��
 *      ���ǳ����а������ڻ�������������ַ��ķ���Ϊ �ϴ���� ��
 *      �ҵ�ÿһ�� �ϴ���� �����䣬����ʼλ���±����˳������󣬷��ؽ����
 *
 * ����: 1 <= s.length <= 1000
 *      s ����СдӢ����ĸ
 *
 * ����: https://leetcode.cn/problems/positions-of-large-groups/description/
 *
 */
class Leetcode830 {

    /**
     * ˫ָ��
     * ʱ�䣺218ms
     * �ڴ棺40.10MB
     */
    fun largeGroupPositions(s: String): List<List<Int>> {
        val answer = ArrayList<List<Int>>()
        var start = 0
        val array = s.toCharArray()
        for (index in 1 until array.size) {
            if (array[start] != array[index]) {
                if (index - start >= 3) {
                    answer.add(listOf(start, index - 1))
                }
                start = index
            }
        }
        if (array.size - start >= 3) {
            answer.add(listOf(start, array.size - 1))
        }
        return answer
    }

}