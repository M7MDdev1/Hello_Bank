public class Account {
    private String Username;
    private float Balance;

    public Account(String user,float Balance){
        this.Username = user;
        this.Balance = Balance;
    }
    public String getUserName() {
        return Username;
    }
    
    public float getBalance() {
        return Balance;
    }

    public void withdraw(float cash) {
        if(Balance >= cash){
            float new_Balance = Balance - cash;
            System.out.println("new Balance is " + new_Balance);
            Balance = new_Balance;
        }
    }
    public void insert(float cash) {
        float new_Balance = Balance + cash;
        System.out.println("new Balance is " + new_Balance);
        Balance = new_Balance;
    }
}
