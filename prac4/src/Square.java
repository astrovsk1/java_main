public class Square extends GeometricObject implements Colorable {
    private double side = 0;

    // Безаргументный конструктор
    public Square() {
        super();
    }

    // Конструктор с указанной стороной
    public Square(double side) {
        super();
        this.side = side;
    }

    // Конструктор с полными параметрами
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    // Getter и Setter методы
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Реализация метода из интерфейса Colorable
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    // Реализация абстрактных методов из GeometricObject
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side + ", " + super.toString();
    }
}