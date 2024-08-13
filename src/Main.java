import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        //User user;
        Date currentDate;
        SimpleDateFormat dateFormat;
        SimpleDateFormat timeFormat;
        BankAccount account;
        TaxCalculator2024 tax;
        AccountBookRun accountBook;

        User user = new User(" nasfan", "kalmunai", "0765401157");

        do {
            System.out.println("\nMenu:");
            //System.out.println("1. Initialize User");
            System.out.println("1. Display User Information");
            System.out.println("2. Display Current Date and Time  &&  save the date and time for all activities");
            System.out.println("3. Use Bank Account");
            System.out.println("4. Use Tax Calculator (2024)");
            System.out.println("5. Use Account Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    User user1 = User.display();
                    break;
                case 2:
                    currentDate = new Date();
                    dateFormat = new SimpleDateFormat("yyyy:MM:dd");
                    timeFormat = new SimpleDateFormat("hh:mm:ss");
                    System.out.println(dateFormat.format(currentDate));
                    System.out.println(timeFormat.format(currentDate));
                    break;
                case 3:
                    account = new BankAccount("saving", 5000);
                    account.show();
                    break;
                case 4:
                    tax = new TaxCalculator2024();
                    tax.calculateTax();
                    break;
                case 5:
                    accountBook = new AccountBookRun();
                    accountBook.displayMenue();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}







