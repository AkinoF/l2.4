public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Метод для вычисления периметра
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        // Пример использования
        Triangle triangle = new Triangle(3.5, 4.2, 5.6);
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Периметр треугольника: " + perimeter);
    }
}
