import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int n = sc.nextInt();
        int first, scnd, third, Add = 0;
        first = n / 100;
        n = n % 100;
        scnd = n / 10;
        third = n % 10;
        Add = first + scnd + third;
        System.out.println("The Sum of digits is: " + Add);
    }

}
