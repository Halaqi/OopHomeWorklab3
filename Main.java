import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passWord = 1234;
        int pass;
        int tries = 0;
        float savedBla;
        System.out.println("Welcome to Al-Halqi bank please enter the password:");

        while (tries <= 3) {
            Scanner input = new Scanner(System.in);
            pass = input.nextInt();
            if (pass == passWord) {
                float amount;
                int op;

                Account a1 = new Account();
                int n = 1;
                while (n != 0) {
                    System.out.println("Enter the operation you want to do");
                    System.out.println("Press (1): to deposit" +
                            "  (2) to check the balance" +
                            "  (3) to withdraw");
                    op = input.nextInt();
                    switch (op) {

                        case 1:
                            System.out.println("Enter the amount you want to deposit:");
                            amount = input.nextFloat();
                            savedBla = a1.getDeposit(amount);
                            break;
                        case 2:
                            System.out.println("Your  balance is: " + a1.checkBalance());
                            break;
                        case 3:
                            System.out.println("Enter the amount you want to withdraw:");
                            amount = input.nextFloat();
                            a1.getWithDraw(amount);
                            System.out.println("Your balance is: " + a1.checkBalance());
                            break;
                    }
                    System.out.println("Press '0' to exit, or any other number to continue");
                    n = input.nextInt();
                }
                break;
            } else {
                System.out.println("incorrect password Please enter the password again:");
            }
            tries++;
        }
        System.out.println("You have reached the limit of tries. Close the app and open it later.");
    }
}
