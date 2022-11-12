package pwo.lab13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @ParameterizedTest
    @ValueSource(strings = { "aa234bb34sd", "1 2 3 4 5", "xx12x12x1x" })
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd", "1 2 x 4 5", "xx1x12x1x" })
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd5", "1 2 x 4 5 x 3", "xx1x12x1x2" })
    void countDigitsInTextTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertEquals(5, Text.countDigitsInText(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd5", "1 2 x 4 5 x 3", "xx1x12x1x2" })
    void countDigitsInTextTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertNotEquals(4, Text.countDigitsInText(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd5", "1 2 x 4 5 x 3", "xx1x12x1x2" })
    void hasDigitsTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.hasDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aabbsd", "x x x", "xxxxx" })
    void hasDigitsTest2(String str) {
        System.out.println("Test negatwyny dla: " + str);
        assertFalse(Text.hasDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "23345", "1 2 4 5 3", "11212" })
    void hasOnlyDigitsTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.hasOnlyDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd5", "1 2 x 4 5 x 3", "xx1x12x1x2" })
    void hasOnlyDigitsTest2(String str) {
        System.out.println("Test negatwyny dla: " + str);
        assertFalse(Text.hasOnlyDigits(str));
    }

}