import java.util.ArrayList;

import java.util.Scanner;



public class AccountBookRun {
    private ArrayList<AccountBookRegistration> connecting = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addAccount() {
        input.nextLine();
        System.out.println("Enter Name of the Bank :");
        String nameoftheBank = input.nextLine();

        System.out.println("Enter  Name of the  branch :");
        String nameoftheBranch = input.nextLine();

        System.out.println("Enter Account Number   :");
        String accountNumber = input.nextLine();
        System.out.println("Enter Email :");
        String email = input.nextLine();

        //create a object connect
        AccountBookRegistration connect = new AccountBookRegistration(nameoftheBank, nameoftheBranch, accountNumber, email);
        connecting.add(connect);
        System.out.println("your information updated Succesfully");
    }

    public void viewAccount() {
        if (connecting.isEmpty()) {
            System.out.println(" Account Book is Empty ");
        } else {
            System.out.println("------Account------");
            for (AccountBookRegistration connect : connecting) {
                System.out.println(connect);

            }
        }

    }

    public void editAccount() {
        input.nextLine();
        if (connecting.isEmpty()) {
            System.out.println(" Account Book is Empty . You can't edit ");
            return;
        }

        System.out.println("Enter the name of the contact to edit :");
        String searchName = input.nextLine();
        for (AccountBookRegistration connect : connecting) {
            if (connect.getName().equals(searchName)) {
                System.out.println(" Enter new Account Number :");
                String newAccountNumber = input.nextLine();
                connect.setAccountNumber(newAccountNumber);

                System.out.println(" Enter new email :");
                String newEmail = input.nextLine();
                connect.setEmail(newEmail);

                System.out.println(" Enter new  Branch name :");
                String newBranch = input.nextLine();
                connect.setNameOftheBranch(newBranch);

                System.out.println("Account information updated succesfully");
                return;
            }
        }
        //System.out.println("Account not found");
    }

    public void deleteAccount() {
        if (connecting.isEmpty()) {
            System.out.println(" Account book is empty.Nothing to Delete.");
            return;
        }
        System.out.println("Enter the name of the Account" +
                " to edit :");
        String searchName = input.nextLine();

        //search for the account using for loop
        for (int i = 0; i < connecting.size(); i++) {
            if (connecting.get(i).getName().equalsIgnoreCase(searchName)) {
                connecting.remove(i);
                System.out.println(" Account deleted Succesfully");
                return;
            }
        }
        System.out.println("Account not found");

    }


    public void displayMenue() {
        while (true) {
            System.out.println("-----Address Book Menue-----");
            System.out.println("1.Add Account");
            System.out.println("2.View Account");
            System.out.println("3.Edit Account");
            System.out.println("4.Delete Account");
            System.out.println("5.Exit");

            System.out.println("Enter your choice : ");

            int choice = input.nextInt();



            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    editAccount();
                    break;
                case 4:
                    deleteAccount();
                    break;
                case 5:
                    System.out.println("Exiting the address Book .....Goodbye");
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");


            }

        }

    }
}




















