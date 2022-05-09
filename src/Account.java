public class Account {
    String Owner, No_Account;
    int balance;

    public Account(String owner, String Acc_No, int balance) {
        this.Owner = owner;
        this.No_Account = Acc_No;
        this.balance = balance;
    }

    // Getters
    public String getOwner() {
        return Owner;
    }

    public String getNo_Account() {
        return No_Account;
    }

    public int getbalance() {
        return balance;
    }

    // Setters
    public void setOwner(String nv) {
        this.Owner = nv;
    }

    public void setNo_Account(String nv) {
        this.No_Account = nv;
    }

    public void setbalance(int nv) {
        this.balance = nv;
    }

    //Method Transfer
    public void Transfer(int amount) throws NotEnoughMoneyException {
        if (balance > amount) {
            balance -= amount;
        } else {
            throw new NotEnoughMoneyException("There is no enough money in your account");
        }
    }

}
