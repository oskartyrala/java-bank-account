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
        System.out.println("Attempting to withdraw: " + amount);
        String outcome;
        if (this.balance >= amount) {
            this.balance -= amount;
            outcome = "success";
        } else {
            outcome="fail";
        }

       Result result = new Result(outcome, this.balance);
        System.out.println("Withdrawal outcome: " + result.getOutcome());
        System.out.println("New balance: " + result.getBalance());
    }
}
