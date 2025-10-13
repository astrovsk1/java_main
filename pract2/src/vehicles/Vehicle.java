package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    //Конструктор Vehicle
    public Vehicle(String model, String license, String color, int year,
                   String ownerName, int insuranceNumber, String engineType) {
        this.model = model; this.license = license; this.color = color; this.year = year;
        this.ownerName = ownerName; this.insuranceNumber = insuranceNumber; this.engineType = engineType;
    }
    public Vehicle() {}

    //Геттеры
    public String getModel() {
        return this.model;}
    public String getLicense() {
        return this.license;}
    public String getColor() {
        return this.color;}
    public int getYear() {
        return this.year;}
    public String getOwnerName() {
        return this.ownerName;}
    public int getInsuranceNumber() {
        return this.insuranceNumber;}
    public String getEngineType() {
        return this.engineType;}

    // Сеттеры
    public void setModel(String model) {
        this.model = model;}
    public void setLicense(String license) {
        this.license = license;}
    public void setColor(String color) {
        this.color = color;}
    public void setYear(int year) {
        this.year = year;}
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;}
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;}
    public void setEngineType(String engineType) {
        this.engineType = engineType;}

    //Абстрактный метод vehicleType
    public abstract String vehicleType();


    @Override
    public String toString(){
        return (getClass().getSimpleName()+":"+
                "\n  model: "+this.model+
                "\n  license: "+this.license+
                "\n  color: "+this.color+
                "\n  year: "+this.year+
                "\n  ownerName: "+this.ownerName+
                "\n  insuranceNumber: "+this.insuranceNumber+
                "\n  engineType: "+this.engineType
        );
    }
}