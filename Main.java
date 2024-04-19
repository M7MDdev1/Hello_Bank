public class Main {
    static Bank bank = new Bank();
    public static void main(String[] args) {
        while (true) {
        System.out.println("===============================");
        System.out.println("Welcome to \"Hello world bank\"");
        System.out.println("0 - make an account");
        System.out.println("1 - check balance");
        System.out.println("2 - withdraw cash");
        System.out.println("3 - insert cash");
        int Choose = Input.Int();

        switch (Choose) {
            case 0:
                MakeAccount();
                break;
            case 1:
                CheckBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                insertMoney();
                break;
            default:
                break;
        }
        }

    }

    static void MakeAccount(){
        String name = Input.Str("Name: ");
        String Username = Input.Str("Username: ");
        float Balance = Input.Flt("initial Balance: ");

        bank.AddUser(name, Username, Balance);
    }
    
    static void CheckBalance(){
        int ID = Input.Int("Enter You're ID: ");
        float Balance = bank.getUsers(ID).getbAccount().getBalance();
        System.out.println(Balance);
    }

    static void withdraw(){
        int ID = Input.Int("Enter You're ID: ");
        float withdrawMoney = Input.Flt("How much do you want: ");
        bank.getUsers(ID).getbAccount().withdraw(withdrawMoney);
    }
    static void insertMoney(){
        int ID = Input.Int("Enter You're ID: ");
        float cash = Input.Flt("How much do you want: ");
        bank.getUsers(ID).getbAccount().insert(cash);
    }

}
