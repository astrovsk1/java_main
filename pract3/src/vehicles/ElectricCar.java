package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    // Конструктор по умолчанию
    public ElectricCar() {
        super("Unknown", "Unknown", "Unknown", 2023, "Unknown", "Unknown");
        this.engineType = "Electric";
        this.batteryCapacity = 0;
    }

    // Полный конструктор - ТЕПЕРЬ КОРРЕКТНЫЙ!
    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber, int batteryCapacity) {
        // Вызываем конструктор Car с 6 параметрами
        super(model, license, color, year, ownerName, insuranceNumber);
        this.engineType = "Electric"; // Переопределяем тип двигателя
        this.batteryCapacity = batteryCapacity;
    }

    // Реализация методов интерфейса ElectricVehicle
    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity=" + batteryCapacity + "kWh";
    }
}