import org.example.Calc;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;

@DisplayName("Тесты для класса Calc")
public class CalcTest {

    @Test
    @DisplayName("Проверка сложения")
    void testSum() {
        Assertions.assertEquals(4, new Calc(2, 2).sum());
        Assertions.assertEquals(0, new Calc(-1, 1).sum());
        Assertions.assertEquals(10.5, new Calc(5.25, 5.25).sum());
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        Assertions.assertEquals(0, new Calc(2, 2).subtract());
        Assertions.assertEquals(-2, new Calc(-1, 1).subtract());
        Assertions.assertEquals(2.5, new Calc(5, 2.5).subtract());
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        Assertions.assertEquals(4, new Calc(2, 2).multiply());
        Assertions.assertEquals(-1, new Calc(-1, 1).multiply());
        Assertions.assertEquals(6.25, new Calc(2.5, 2.5).multiply());
    }


    @ParameterizedTest(name = "Деление: {0} / {1} = {2}")
    @CsvSource({
            "4, 2, 2",
            "10, 2, 5",
            "5, 2.5, 2",
            "-5, 2, -2.5",
            "5, -2, -2.5"
    })
    void testDivide(double num1, double num2, double expected) {
        Assertions.assertEquals(expected, new Calc(num1, num2).divide());
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, new Calc(2, 0).divide());
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, new Calc(-2, 0).divide());
        Assertions.assertEquals(1, new Calc(-2, -2).divide());
    }

    @Test
    @DisplayName("Проверка деления нуля на ноль")
    void testDivideZeroByZero() {
        Assertions.assertEquals(Double.NaN, new Calc(0, 0).divide());
    }

}
