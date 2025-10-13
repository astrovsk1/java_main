package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // Создаем обычный автомобиль
        Car car = new Car("Toyota Camry", "ABC123", "Red", 2020,
                "John Smith", "INS123456");

        // Создаем электромобиль - ТЕПЕРЬ РАБОТАЕТ!
        ElectricCar electricCar = new ElectricCar("Tesla Model 3", "TESLA001", "White",
                2023, "Alice Johnson", "INS789012", 75);

        // Тестируем
        System.out.println("Обычный автомобиль:");
        System.out.println(car.toString());
        System.out.println("Тип: " + car.vehicleType());

        System.out.println("\nЭлектромобиль:");
        System.out.println(electricCar.toString());
        System.out.println("Тип: " + electricCar.vehicleType());
        System.out.println("Емкость батареи: " + electricCar.getBatteryCapacity() + "kWh");

        // Тестируем сеттер
        electricCar.setBatteryCapacity(100);
        System.out.println("Новая емкость батареи: " + electricCar.getBatteryCapacity() + "kWh");
    }
}