package access;

public class BankAccount {
    
    private int balance;

    public BankAccount(){
        balance = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
        
    }

    //public 메서드: withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance-amount>=0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
        }
    }

    //public 메서드: getBalance
    public int getBalance(){
        return balance;
    }

    //private 메서드(내부에서만 사용하기 때문에)
    private boolean isAmountValid(int amount){
        return amount > 0;
    }
    
}
/*
 * 캡슐화
 * 
 * 1. 데이터(멤버변수)를 숨겨라
 *  - 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 클래스 내부 데이터를 다루는 모든 로직을 무시하고 변경 가능하기 때문
 *  - 대부분 멤버변수는 private를 선언한다
 * 2. 기능을 숨겨라(가급적이면 필요한 기능 제외하고)
 *  - 외부에서 사용하지 않고 내부에서만 사용하는 이런 기능도 모두 감추는 것이 좋다
 * 
 * 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다
 */
