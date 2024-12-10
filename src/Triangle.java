import java.util.*;
public class Triangle {
    private double a; // Сторона a
    private double b; // Сторона b
    private double c; // Сторона c

    // Конструктор
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод для вычисления периметра треугольника
    public double calculatePerimeter() {
        return a + b + c; // Периметр треугольника
    }

    // Метод для проверки, является ли треугольник действительным
    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений для сторон
        System.out.print("Введите длину стороны a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину стороны b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите длину стороны c: ");
        double c = scanner.nextDouble();

        // Создание объекта Triangle с введенными значениями
        Triangle triangle = new Triangle(a, b, c);

        // Проверка, является ли треугольник действительным
        if (triangle.isValid()) {
            double perimeter = triangle.calculatePerimeter();
            System.out.println("Периметр треугольника: " + perimeter);
        } else {
            System.out.println("Указанные стороны не могут образовать треугольник.");
        }

        scanner.close(); // Закрываем сканер для освобождения ресурсов
    }
}