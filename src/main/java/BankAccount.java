public class BankAccount {
    private String ownerName;
    private double balance ;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        bankAccount.setBalance(-500);

        System.out.println(bankAccount.getBalance());
    }
}
