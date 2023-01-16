/**
 * This service class is intended to contain the basic logic for deposits and
 * withdrawls to a bank account Separating menu logic and bank logic is good for
 * two reasons: it makes both classes as simple as they could be, and it also
 * makes this class capable of being tested with automated tests, since testing
 * a class that receives user input is difficult.
 */
public class BankService {
    /**
     * The balance should be kept private. If it were public, then other developers
     * could write code in other classes that could cause the balance to exhibit
     * unintended behavior, like being negative. The private access modifier will
     * allow only the methods within this class to interact with the balance.
     */
    private double balance;

    /**
     * A constructor to build a BankService object that will start the bank balance
     * at 0. There is no need to change anything in this constructor.
     */
    public BankService() {
        this.balance = 0;
    }

    /**
     * implement functionality to increase the user's balance by amount.
     *
     * @param amount the amount to be deposited.
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * implement functionality to decrease the user's balance by an amount.
     * If a withdrawl would result in the user having a negative balance, the
     * withdrawl should not occur.
     *
     * @param amount the amount to be withdrawn.
     */
    public void withdraw(double amount) {
        double tempBalance = this.balance - amount;
        if (tempBalance >= 0) {
            this.balance -= amount;
        }
    }

    /**
     * There is no need to change this method, it will be used in testing and in the
     * menu class.
     *
     * @return the user's balance.
     */
    public double getBalance() {
        return this.balance;
    }
}
