package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide) {
            System.out.print("this is a valid triangle");
        } else if ((firstSide + thirdSide <= secondSide) && (secondSide + thirdSide <= firstSide)) {
            System.out.print("This is not a valid triangle.");
        } else {
            System.out.println("it's not a triangle");

        }
    }

    public static void main(String[] args) {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
        triangleSidesValidator.validate(1, 5, 6);
    }
}
