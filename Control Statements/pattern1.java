import java.util.*;
public class pattern1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a=sc.nextInt();

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
