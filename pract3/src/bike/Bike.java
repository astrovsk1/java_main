package bike;

public abstract class Bike implements BikeParts {
    private String model;
    private int gear;
    private double speed;

    public Bike(String model, int gear, double speed) {
        this.model = model;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String newValue) {
        this.model = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return COMPANY + " Model: " + model + ", Gear: " + gear + ", Speed: " + speed;
    }
}

