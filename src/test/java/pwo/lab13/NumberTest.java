package pwo.lab13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5, 7, 15, 101 })
    void isOddTest(int number) {
        System.out.println("Nieparzystość: " + number);
        assertTrue(Number.isOdd(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 16, 102 })
    void isEvenTest(int number) {
        System.out.println("Parzystość: " + number);
        assertTrue(Number.isEven(number));
    }

}