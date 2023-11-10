package seminars.first.Calculator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void testWithAssertJ() {
        testZeroPercent();
        test101Percent();
        testNegativePurchaseAmount();
        testNegativeDiscount();
    }

    public static void testZeroPercent() {
        // zero percent discount
        assertThat(Calculator.calculatingDiscount(100, 0)).isEqualTo(100);
    }

    public static void test101Percent() {
        // one hundred and one percent discount
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101)).isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount amount exceeds 100%");
    }

    public static void testNegativePurchaseAmount() {
        // negative purchase amount
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-100, 1)).isInstanceOf(ArithmeticException.class)
                .hasMessage("negative purchase amount");
    }

    public static void testNegativeDiscount() {
        // negative discount
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1)).isInstanceOf(ArithmeticException.class)
                .hasMessage("negative discount");
    }

}