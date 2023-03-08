import kotlin.test.Test
import kotlin.test.assertEquals

class Testy {
    @Test
    fun doubleString_case1_isEquals1() {
        assertEquals("1.0E-5", 0.00001.toString())
    }

    @Test
    fun doubleString_case1_isEquals2() {
        assertEquals("1.0E-5", (0.00001).toString())
    }

    @Test
    fun doubleString_case1_isEquals3() {
        assertEquals("1.0E-5", "${0.00001}")
    }

    @Test
    fun doubleString_case2_isEquals1() {
        assertEquals("2.0", 2.0.toString())
    }
    @Test
    fun doubleString_case2_isEquals2() {
        assertEquals("2.0", (2.0).toString())
    }
    @Test
    fun doubleString_case2_isEquals3() {
        assertEquals("2.0", "${2.0}")
    }
}