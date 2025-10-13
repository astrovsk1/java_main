package vehicles;

public class Car extends Vehicle {

    //@Override
    public String vehicleType() {
        return "Car";
    }
    //Конструктор Car использующий поля и методы родительского класса
    public Car(String model, String license, String color, int year,
               String ownerName, int insuranceNumber, String engineType ) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType);
    }
    public Car() {
    }
}
