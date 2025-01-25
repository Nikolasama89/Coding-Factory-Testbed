package gr.aueb.cf.ch16;



import java.io.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Line line = new Line(10.5);
        Rectangle rec = new Rectangle(2, 5);

        System.out.println(circle.getCircumference());
        System.out.println(circle.getRadius());
        System.out.println(line.getLength());
        System.out.println(rec.getCircumference());

        Line line2 = new Line(line);
        line2.setLength(5);

        System.out.println(line);
        System.out.println(line2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\niqos\\Desktop\\circle.ser"))) {
            oos.writeObject(circle);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Not Serializable");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
