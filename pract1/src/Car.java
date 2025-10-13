// Задача 3
/*
public class Car {
    // Поля класса
    String model;
    String license;
    String color;
    int year;

    // Включает все поля класса
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    // По умолчанию
    public Car() {
        this.model = "Неизвестно";
        this.license = "А000АА";
        this.color = "Белый";
        this.year = 2020;
    }
    // По выбору
    public Car(String model, int year) {
        this.model = model;
        this.license = "В000ВВ";
        this.color = "Черный";
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Модель: " + model);
        System.out.println("Номер: " + license);
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
        System.out.println("    ");
    }
    public static void main(String[] args){
        Car car1 = new Car("BMW", "A345ХХ", "Красный", 2025);
        Car car2 = new Car();
        Car car3 = new Car("Audi TT", 2021);

        System.out.println("Автомобиль 1: ");
        car1.displayInfo();

        System.out.println("Автомобиль 2: ");
        car2.displayInfo();

        System.out.println("Автомобиль 3: ");
        car3.displayInfo();
    }
}
*/

class Car {
    // Поля класса
    private String model;
    private String license;
    private String color;
    private int year;


    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }


    public Car() {
        this.model = "Неизвестно";
        this.license = "А000АА";
        this.color = "Белый";
        this.year = 2020;
    }


    public Car(String model, int year) {
        this.model = model;
        this.license = "В000ВВ";
        this.color = "Черный";
        this.year = year;
    }

    public String To_String() {
        return String.format("Модель: %s, Номер: %s, Цвет: %s, Год: %d",
                model, license, color, year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getCarAge() {
        final int CURRENT_YEAR = 2024;
        return CURRENT_YEAR - year;
    }
}
