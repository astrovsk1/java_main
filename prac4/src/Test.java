import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ввод данных для треугольника
        System.out.println("=== Ввод данных для треугольника ===");
        System.out.print("Введите сторону 1: ");
        double side1 = input.nextDouble();

        System.out.print("Введите сторону 2: ");
        double side2 = input.nextDouble();

        System.out.print("Введите сторону 3: ");
        double side3 = input.nextDouble();

        System.out.print("Введите цвет: ");
        String color = input.next();

        System.out.print("Закрашен (true/false): ");
        boolean filled = input.nextBoolean();

        // Создание треугольника
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        // Вывод информации о треугольнике
        System.out.println("\n=== Информация о треугольнике ===\n");
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Закрашен: " + triangle.isFilled());
        System.out.println(triangle.toString());

        // 4-5. Тестирование метода max для кругов
        System.out.println("\nСравнение кругов методом max()\n");
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Больший круг: " + maxCircle);

        // 6. Тестирование ComparableCircle
        System.out.println("\nСравнение ComparableCircle\n");
        ComparableCircle compCircle1 = new ComparableCircle(4);
        ComparableCircle compCircle2 = new ComparableCircle(6);

        int result = compCircle1.compareTo(compCircle2);
        if (result > 0) {
            System.out.println("Первый круг больше второго");
        } else if (result < 0) {
            System.out.println("Второй круг больше первого");
        } else {
            System.out.println("Круги равны по площади");
        }

        input.close();
    }
}