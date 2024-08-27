package Lesson_7_junit_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialPart1Test {

    @Test
    void testFactorialForZero() {
        assertEquals(1, FactorialPart1.factorial(0));
    }

    @Test
    void testFactorialForPositiveNumber() {
        assertEquals(1, FactorialPart1.factorial(1));
        assertEquals(120, FactorialPart1.factorial(5));
    }

    @Test
    void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialPart1.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> FactorialPart1.factorial(-25));
    }
}