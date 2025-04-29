package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
//        long balance = account.getBalance();

        account.deposit(10000);
        System.out.println("잔액은 " + account.getBalance() + "원 입니다.");

        try {
            account.withdraw(5000);
            account.withdraw(7000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
