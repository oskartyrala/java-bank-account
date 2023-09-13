public class Result {
    private final String outcome;
    private final int balance;

    public Result(String outcome, int balance) {
        this.outcome = outcome;
        this.balance = balance;
    }

    public String getOutcome() {
        return outcome;
    }

    public int getBalance() {
        return balance;
    }
}
