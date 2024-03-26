package oop1.ex;

public class AccountMain {
    
    public static void main(String[] args) {
        Account account = new Account();
        
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
    }
}
/*
 * 객체 지향 : 객체의 설계와 관계를 중요시한다
 * 절차 지향 : 데이터와 기능이 분리되어 있고, 프로그램이 어떻게 작동하는지 순서에 초점을 맞춘다.
 */