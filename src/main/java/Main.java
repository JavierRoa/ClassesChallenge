public class Main {
    public static void main(String[] args) {
        Account account = new Account(123, 50000, "Javier", "javier@gmail.com", 12345678);

        account.deposit(50000);
        account.withdraw(130000);
        account.withdraw(30000);
    }
}
