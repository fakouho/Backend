package Access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.deposit(10000);
        bk.withdraw(3999);
        System.out.println(bk.getBalance());
    }
}
