import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    // Абстрактные методы
    public abstract double getArea();
    public abstract double getPerimeter();

    // Реализация Comparable
    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    // Статический метод max
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return obj1.compareTo(obj2) >= 0 ? obj1 : obj2;
    }

    // Getter/Setter методы
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public Date getDateCreated() { return dateCreated; }

    @Override
    public String toString() {
        return "цвет: " + color + ", закрашен: " + filled + ", площадь: " + getArea();
    }
}