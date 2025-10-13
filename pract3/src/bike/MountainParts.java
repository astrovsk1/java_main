package bike;

public interface MountainParts {
    String TERRAIN = "off_road";
    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}
