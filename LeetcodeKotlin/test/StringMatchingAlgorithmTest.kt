import base.BaseTest

object StringMatchingAlgorithmTest : BaseTest<StringMatchingAlgorithmTest.Data, Boolean>() {

    @JvmStatic
    fun main(args: Array<String>) {
//        methodTest(getExample()) { return@methodTest StringMatchingAlgorithm().bf(it.str1, it.str2) }
//        methodTest(getExample()) { return@methodTest StringMatchingAlgorithm().key(it.str1, it.str2) }
        methodTest(getExample()) { return@methodTest StringMatchingAlgorithm().kmp(it.str1, it.str2) }
    }

    override fun getExample(): List<Data> {
        return getArrayList().also {
            it.add(Data("sadbsdsad", "sssd"))
            it.add(Data("123456", "2"))
            it.add(Data("abcd", "def"))
        }
    }

    data class Data(val str1: String, val str2: String)

}