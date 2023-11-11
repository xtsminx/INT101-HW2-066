package work03;
import work01.Utilitor;
import work02.Person;
public class Account {
    private static long nextNo = 100_000_000L;
    private final long no;
    private Person owner;
    private double balance;
    public Account(Person owner){
        if (owner == null) {
            throw new NullPointerException("Owner cannot be null");
        }
        this.owner = owner;
        this.balance = 0.0;

        long result;
        do {
            result = Utilitor.computeIsbn10(nextNo);
            if (result == 10) {
                nextNo++;
            }
        } while (result == 10);

        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {return no;}
    public Person getOwner() {return owner;}
    public double getBalance() {return balance;}

    public double deposit(double amount) {
        Utilitor.testPositive(amount);
        balance +=amount ;
        return balance;
    }

    public double withdraw(double amount) {
        Utilitor.testPositive(amount);
        balance -= amount;
        Utilitor.testPositive(balance);
        return balance;
    }

    public void transfer(double amount, Account account) {
        if (account == null || amount > balance) {
            throw new IllegalArgumentException("Invalid target account");
        }
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account(no=" + no + ", balance=" + balance + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account other = (Account) obj;
        return no == other.no;
    }
}
