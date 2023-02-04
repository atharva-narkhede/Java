import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean circleatradious = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2)
                || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        System.out.println(
                "Point (" + x + ", " + y + ") is " + ((circleatradious) ? "in " : "not in ") + "the rectangle");
    }

}
