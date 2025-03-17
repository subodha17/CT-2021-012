package Q_01;


public class MathExpressions {
    public static void main(String[] args) {

        double A = 10.0;
        double B = 8.25;
        double C = 6.2;
        double X = 25.75;
        double Y = 10.0;
        double radius = 21.0;

        double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        System.out.println("a. √(B² + 4AC) = " + resultA);

        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("b. √(X + 4Y³) = " + resultB);

        double resultC = Math.cbrt(X * Y);
        System.out.println("c. ∛(X * Y) = " + resultC);

        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("d. Area of circle with radius " + radius + " = " + areaOfCircle);
    }
}