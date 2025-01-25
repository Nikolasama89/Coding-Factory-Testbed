package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Line line = new Line(10.5);
        Rectangle rec = new Rectangle(2, 5);

        System.out.println(circle.getCircumference());
        System.out.println(circle.getRadius());
        System.out.println(line.getLength());
        System.out.println(rec.getCircumference());



    }
}
