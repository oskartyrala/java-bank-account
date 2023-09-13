public class Account {
    private final int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    // Methods to modify properties
    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}
