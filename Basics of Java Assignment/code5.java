import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int u = sc.nextInt();

        System.out.print("The computer is ");
        switch (c) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");
        }
        System.out.print(" You are ");
        switch (u) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper ");
        }
        if (c == u)
            System.out.println(" too. It is a draw");
        else {
            boolean w = (u == 0 && c == 2) || (u == 1 && c == 0) || (u == 2 && c == 1);
            if (w)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }

}
