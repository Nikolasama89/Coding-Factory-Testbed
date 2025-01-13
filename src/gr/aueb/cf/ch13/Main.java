package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class Main {

    public static void main(String[] args) {
        PointXYZ pointXYZ = new PointXYZ(5, 8, 4);

        System.out.println(pointXYZ.pointToString());
        System.out.println("X Y distance is: " + pointXYZ.getXYDistance());
        System.out.println("Y Z distance is: " + pointXYZ.getYZDistance());
        System.out.println("X Z distance is: " + pointXYZ.getXZDistance());
        System.out.println("Χ Y Z distance is: " + pointXYZ.getXYZDistance());
    }

}
