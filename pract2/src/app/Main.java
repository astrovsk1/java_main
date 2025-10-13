package app;

import vehicles.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Обращение к полям объектов:");

        //Создание объектов
        Car defaultCar = new Car();
        ElectricCar electrocar = new ElectricCar();

        //Демонстрация обращения к приватным полям
        defaultCar.setOwnerName("Audi");
        electrocar.setOwnerName("Tesla");

        System.out.println("Default car owner: "+defaultCar.getOwnerName()+"; ElectricCar owner: "+electrocar.getOwnerName());

        //Демонстрация обращения к публичным полям
        electrocar.batteryCapacity = 6;
        System.out.println("Battery capacity = "+electrocar.batteryCapacity);

        //Задание 3
        System.out.println("\n3 часть задания:\n");

        //Создание объектов
        Vehicle car = new Car();
        Vehicle electroCar = new ElectricCar();

        //Изменение параметров через сеттеры и вывод
        car.setColor("Красный");
        car.setLicense("AA777A");
        car.setEngineType("Gasoline");
        car.setModel("BMW M4");
        car.setOwnerName("Mr. Crabs");
        car.setInsuranceNumber(100);
        car.setYear(2025);
        System.out.println(car.toString()+"\n");

        //Проверка доступа через сеттеры
        System.out.println(car.getModel()+" "
                +car.getLicense()+" "
                +car.getColor()+ " "
                +car.getYear()+" "
                +car.getOwnerName()+" "
                +car.getInsuranceNumber()+" "
                +car.getEngineType());

    }
}