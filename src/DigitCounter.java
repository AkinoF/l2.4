public class DigitCounter {
    // Метод для определения количества цифр в числе
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int firstNumber = 12345; // Первое число
        int secondNumber = 678; // Второе число

        // Подсчет количества цифр
        int digitsInFirst = countDigits(firstNumber);
        int digitsInSecond = countDigits(secondNumber);

        // Сравнение и вывод результата
        if (digitsInFirst > digitsInSecond) {
            System.out.println("В первом числе больше цифр: " + firstNumber);
        } else if (digitsInSecond > digitsInFirst) {
            System.out.println("Во втором числе больше цифр: " + secondNumber);
        } else {
            System.out.println("Числа имеют одинаковое количество цифр");
        }
    }
}