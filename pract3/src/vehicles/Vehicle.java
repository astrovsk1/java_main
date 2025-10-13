package vehicles;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected int year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;

    // Конструктор
    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    // Геттеры и сеттеры
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    @Override
    public String toString() {
        return String.format("Vehicle [model=%s, license=%s, color=%s, year=%d, " +
                        "ownerName=%s, insuranceNumber=%s, engineType=%s, vehicleType=%s]",
                model, license, color, year, ownerName, insuranceNumber, engineType, vehicleType());
    }

    public abstract String vehicleType();
}