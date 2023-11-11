package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;
public class Int101Homework02 {
    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }
    static void work01Utilitor() {
        System.out.println(Utilitor.testString(" "));
        System.out.println(Utilitor.testString(""));
        System.out.println(Utilitor.testString("Fah"));

        System.out.println(Utilitor.testPositive(0));
        System.out.println(Utilitor.testPositive(1));
        System.out.println(Utilitor.testPositive(-1));

        System.out.println(Utilitor.computeIsbn10(123456789));
    }
    static void work02Person() {
        Person person1 = new Person("Trin", "Meesuannil");
        System.out.println("Person 1: " + person1);

        Person person2 = new Person("Pannakan", "Tongsan");
        System.out.println("Person 2: " + person2);

        System.out.println("person1 equals person2: " + person1.equals(person2));
    }

    static void work03Account() {
        Person person1 = new Person("Trin", "Meesuannil");
        Account account1 = new Account(person1);
        Person person2 = new Person("Pannakan", "Tongsan");
        Account account2 = new Account(person2);
        System.out.println("Account 1: " + account1);
        System.out.println("Account 1: " + account2);

        account1.deposit(1000);
        account2.deposit(1500);
        System.out.println("Account 1 after deposit: " + account1);
        System.out.println("Account 2 after deposit: " + account2);
        account1.withdraw(100);
        account1.withdraw(1000);
        System.out.println("Account 1 after withdrawal: " + account1);
        System.out.println("Account 2 after withdrawal: " + account2);

        account1.transfer(300, account2);
        System.out.println("Account 1 after transfer: " + account1);
        System.out.println("Account 2 after transfer: " + account2);

        System.out.println("account1 equals account2: " + account1.equals(account2));
    }
}
