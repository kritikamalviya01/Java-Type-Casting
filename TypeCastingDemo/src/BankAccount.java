public class BankAccount {
    //class variable
    static String bankName = "Bank of India";
    //instance variable
    String accountNumber;
    String accountHolderName;
    float balance;

    public static void main(String[] args) {
        //local variable
        float interestRate = 8.5f;
        System.out.println(interestRate);
        // object initialization
        BankAccount bankAccount = new BankAccount();
        System.out.println(BankAccount.bankName);
        bankAccount.accountHolderName = "Kritika";
        bankAccount.accountNumber = "123456789";
        bankAccount.balance = 88888f;
        System.out.println(bankAccount.balance);
    }
}
