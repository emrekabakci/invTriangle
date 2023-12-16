import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //New scanner created.
        Scanner inp=new Scanner(System.in);

        //Data retrieved from user.
        System.out.println("Enter Number:");
        int num = inp.nextInt();

        //Inverted triangle printed with for loop.
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < num- i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}