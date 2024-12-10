import java.util.*;
public class Triangle1 {
    private double AB; // Сторона AB
    private double AC; // Сторона AC
    private double CD; // Сторона CD

    // Конструктор
    public Triangle1(double AB, double AC, double CD) {
        this.AB = AB;
        this.AC = AC;
        this.CD = CD;
    }

    // Метод для вычисления гипотенузы
    public double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // Метод для вычисления периметра треугольника
    public double calculatePerimeter() {
        double BD = calculateHypotenuse(AC, AB); // Гипотенуза треугольника ABC
        double DA = CD; // Сторона CD
        return AB + AC + BD + DA; // Периметр треугольника
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений для сторон
        System.out.print("Введите длину стороны AB: ");
        double AB = scanner.nextDouble();

        System.out.print("Введите длину стороны AC: ");
        double AC = scanner.nextDouble();

        System.out.print("Введите длину стороны CD: ");
        double CD = scanner.nextDouble();

        // Создание объекта Triangle1 с введенными значениями
        Triangle1 triangle = new Triangle1(AB, AC, CD);

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Периметр треугольника ABCD: " + perimeter);
        scanner.close(); // Закрываем сканер для освобождения ресурсов
    }
}