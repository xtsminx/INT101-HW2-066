package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;
public class Int101Homework02 {

    public static void main(String[] args) {
//       work01Utilitor();
       work02Person();
//       work03Account();
    }

    static void work01Utilitor() {
        System.out.println(Utilitor.testString(" "));//blank
        System.out.println(Utilitor.testString(""));//null
        System.out.println(Utilitor.testString("AAA"));
    }

    static void work02Person() {
        Person person1 = new Person("John", "Doe");
        System.out.println("Person 1: " + person1);

        Person person2 = new Person("Alice", "Smith");
        System.out.println("Person 2: " + person2);

        // Testing getters and setters
        System.out.println("Person 1's ID: " + person1.getId());
        person1.setFirstname("James");
        person1.setLastname("Wilson");
        System.out.println("Updated Person 1: " + person1);

        // Testing equals method
        System.out.println("person1 equals person2: " + person1.equals(person2));
    }

    static void work03Account() {
        // Create a Person and an Account
        Person person1 = new Person("FAH", "SHO");
        Account account1 = new Account(person1);
        System.out.println("Account 1: " + account1);

        // Deposit and withdraw from Account
        account1.deposit(1000.0);
        System.out.println("Account 1 after deposit: " + account1);
        account1.withdraw(500.0);
        System.out.println("Account 1 after withdrawal: " + account1);

        // Create another Account and transfer funds
        Person person2 = new Person("Alice", "Smith");
        Account account2 = new Account(person2);
        account1.transfer(300.0, account2);
        System.out.println("Account 1 after transfer: " + account1);
        System.out.println("Account 2 after transfer: " + account2);

        // Testing equals method
        System.out.println("account1 equals account2: " + account1.equals(account2));
    }
}
