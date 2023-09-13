public class Main {
    public static void main(String[] args) {

        Account account = new Account(1, 150);
        System.out.println("Id: " + account.getId());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(20);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());


    }
}