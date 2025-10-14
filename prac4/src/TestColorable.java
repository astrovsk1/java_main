public class TestColorable {
    public static void main(String[] args) {
        // Создание массива из пяти объектов GeometricObject
        GeometricObject[] shapes = new GeometricObject[5];

        shapes[0] = new Square(3, "красный", true);
        shapes[1] = new Circle(2, "синий", false);
        shapes[2] = new Square(5, "зеленый", true);
        shapes[3] = new Triangle(3, 4, 5, "желтый", false);
        shapes[4] = new Square(4, "оранжевый", true);

        // Обработка каждого объекта в массиве
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\n--- Фигура " + (i + 1) + " ---");
            System.out.println("Площадь: " + shapes[i].getArea());
            System.out.println("Тип: " + shapes[i].getClass().getSimpleName());

            // Проверка, можно ли раскрасить объект
            if (shapes[i] instanceof Colorable) {
                Colorable colorable = (Colorable) shapes[i];
                System.out.print("Инструкция по раскрашиванию: ");
                colorable.howToColor();
            } else {
                System.out.println("Эта фигура не раскрашиваемая");
            }
        }
    }
}