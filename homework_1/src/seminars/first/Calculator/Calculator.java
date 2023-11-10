package seminars.first.Calculator;


    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:

public class Calculator {

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount < 0) {
            throw new ArithmeticException("Negative purchase amount");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("Negative discount");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("The discount amount exceeds 100%");
        }
        if (discountAmount == 0) {
            return purchaseAmount;
        } else {
            return purchaseAmount - purchaseAmount * (discountAmount / (double) 100);
        }
    }
}