package CircleAndCylinder;

class TestShapes {
    public static void main(String[] args) {

        Circle circle = new Circle(3.0, "green");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0, "green", 5.0);
        System.out.println(cylinder);
    }
}
