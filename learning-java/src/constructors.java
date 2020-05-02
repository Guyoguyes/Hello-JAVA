public class constructors {
    public static void main(String[] args) {
        // instance of the triangle class
        Triangle triangleA = new Triangle(15, 12, 15, 8, 10);
        Triangle triangleB = new Triangle(13, 12, 24, 12, 4);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenOne);
        System.out.println(triangleB.sideLenThree);
        System.out.println(Triangle.numOfSides);
    }
}
