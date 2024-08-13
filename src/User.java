
import java.util.Scanner;
public class User {
    public  String name;
    public  String city;
    public  String phonenumber;

    //constructor
    public User(String name,String city,String phonenumber){
        this.name=name;
        this.city=city;
        this.phonenumber=phonenumber;

    }

    public static User display(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your city:");
        String city = scanner.nextLine();

        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();

        User user = new User(name, city, phoneNumber);

        System.out.println("Account Holder Name: " + user.name);
        System.out.println("Account Holder Location: " + user.city);
        System.out.println("Account Holder Phone Number : "+user.phonenumber);
        //scanner.close();

        return  user;
    }


    //methods
    public void purpose(){
        System.out.println("Hi,"+this.name+"  The purpose of the app is to solve your " +
                "Financial problems and save your account informations safely");
    }



}
