package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 완료, 현재 잔액 : " + balance);
    }

    void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("잔액이 부족합니다, 현재 잔액 : " + balance);
            return;
        }

        balance -= amount;
        System.out.println("출금 완료, 현재 잔액 : " + balance);
    }
}
