package Access;

public class BankAccount {
    private int balance;

    // 기본 생성자
    public BankAccount() {
        this.balance = 0;
    }

    // 입금 메서드
    public void deposit(int amount) {
        if (test(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금 메서드
    public boolean withdraw(int amount) {
        if (test(amount) && balance - amount >= 0) {
            balance -= amount;
            return true; // 출금 성공
        } else {
            System.out.println("잔액이 부족하거나 유효하지 않은 금액입니다.");
            return false; // 출금 실패
        }
    }

    // 금액 검증 메서드
    private boolean test(int amount) {
        return amount > 0;
    }

    // 잔액 조회 메서드 (추가)
    public int getBalance() {
        return balance;
    }
}
