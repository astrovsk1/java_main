package bike;

public class RoadBike extends Bike implements RoadParts {
    private String tyreWidth;
    private String postHeight;

    public RoadBike(String model, int gear, double speed, String tyreWidth, String postHeight) {
        super(model, gear, speed);
        this.tyreWidth = tyreWidth;
        this.postHeight = postHeight;
    }

    @Override
    public String getTyreWidth() {
        return tyreWidth;
    }

    @Override
    public void setTyreWidth(String newValue) {
        this.tyreWidth = newValue;
    }

    @Override
    public String getPostHeight() {
        return postHeight;
    }

    @Override
    public void setPostHeight(String newValue) {
        this.postHeight = newValue;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tyre Width: " + tyreWidth + ", Post Height: " + postHeight + ", Terrain: " + TERRAIN;
    }
}