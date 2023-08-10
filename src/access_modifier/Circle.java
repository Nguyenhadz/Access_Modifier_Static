package access_modifier;

public class Circle {
    private double radius;
    private String color;
    Circle() {
        this.color = "red";
        this.radius = 1.0;
    }
    Circle (double a) {
        radius = a;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius;
    }
}
