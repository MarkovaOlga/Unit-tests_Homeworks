package homework1.task1;

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

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (discountAmount <= 0) {
            throw new ArithmeticException("Размер скидки должен быть больше 0");
        }
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Сумма покупки должна быть больше 0");
        }
        if (discountAmount >= 100) {
            throw new ArithmeticException("Размер скидки должен быть меньше 100");
        }
        return purchaseAmount - purchaseAmount * (discountAmount/100); // Метод должен возвращать сумму покупки со скидкой
    }
}
