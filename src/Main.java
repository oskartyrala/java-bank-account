public class Main {
    public static void main(String[] args) {

        Account account = new Account(1, 150);
        System.out.println("Account id: " + account.getId());
        System.out.println("Starting balance: " + account.getBalance());


        account.withdraw(70);

        account.withdraw(100);

        account.deposit(50);



    }
}