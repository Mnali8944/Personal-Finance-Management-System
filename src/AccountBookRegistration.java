public class AccountBookRegistration{

    private String nameOftheBank;
    private String nameOftheBranch;
    private String accountNumber;
    private  String email;


    public void setNameOftheBranch(String nameOftheBranch) {
        this.nameOftheBranch = nameOftheBranch;
    }

    public String getNameOftheBank() {

        return nameOftheBank;
    }

    public void setNameOftheBank(String nameOftheBank) {
        this.nameOftheBank = nameOftheBank;
    }



    public String getName() {

        return nameOftheBank;
    }

    public void setName(String name) {

        this.nameOftheBranch = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;


    }

    @Override
    public String toString() {
        return  "Name of the Bank:  "+ nameOftheBank+ " , Name of the Branch: "+nameOftheBranch+", Account Number : "+accountNumber+" , Email: "+email;
    }

    public AccountBookRegistration(String nameOftheBank, String nameOftheBranch, String accountNumber, String email) {
        this.nameOftheBank = nameOftheBank;
        this.nameOftheBranch = nameOftheBranch;
        this.accountNumber = accountNumber;
        this.email = email;
    }



}
