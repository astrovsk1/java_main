/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму юаней:");
        int yuan = scanner.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;
        int roundedRoubles = (int) Math.ceil(roubles);
        System.out.print(roundedRoubles + " " + "рублей");
        scanner.close();
    }
}
*/


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки

        Scanner input = new Scanner(System.in);

        // Получить сумму денег в китайских юанях
        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = input.nextInt();

        // Конвертировать сумму денег в российские рубли
        double roubles = ROUBLES_PER_YUAN * yuan;

        // Определить окончание для юаней
        String yuanEnding;
        int lastDigit = yuan % 10;
        int lastTwoDigits = yuan % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            yuanEnding = "юаней";
        } else if (lastDigit == 1) {
            yuanEnding = "юань";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            yuanEnding = "юаня";
        } else {
            yuanEnding = "юаней";
        }

        // Отобразить результат с правильными окончаниями
        System.out.printf("%d китайский %s = %.2f российских рублей%n", yuan, yuanEnding, roubles);
    }
}
*/



public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", "А123ВС", "Синий", 2018);
        Car car2 = new Car(); // конструктор по умолчанию
        Car car3 = new Car("BMW X5", 2020);

        System.out.println("Автомобиль 1: " + car1.To_String());
        System.out.println("Автомобиль 2: " + car2.To_String());
        System.out.println("Автомобиль 3: " + car3.To_String());


        System.out.println("Модель car1: " + car1.getModel());
        System.out.println("Год car2: " + car2.getYear());
        System.out.println("Цвет car3: " + car3.getColor());


        car2.setColor("Красный");
        car2.setYear(2020);
        System.out.println("\nПосле изменения car2: " + car2.To_String());


        System.out.println("\nВозраст автомобилей:");
        System.out.println("car1: " + car1.getCarAge() + " лет");
        System.out.println("car2: " + car2.getCarAge() + " лет");
        System.out.println("car3: " + car3.getCarAge() + " лет");
    }
}

