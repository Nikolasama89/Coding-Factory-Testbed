package gr.aueb.cf.ch16;

public class Circle extends Shape implements ITwoDimensional{


    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
