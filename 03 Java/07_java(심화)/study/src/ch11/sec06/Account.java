package ch11.sec06;

public class Account {
    private long balance;

    public Account() { }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (balance >= money){ // 잔액이 인출 금액보다 크면 인출 진행
            balance -= money;
        }
        else { // 잔액이 인출하려는 금액보다 작으면 예외 처리
            throw new InsufficientException;
        }
    }
}
