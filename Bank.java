import java.util.ArrayList;

public class Bank {
    ArrayList<User> Users = new ArrayList<>();
    
    public void AddUser(String name, String Username, float Balance) {
        Users.add(new User(name, Username, Balance));
        System.out.println("You're IBAN : "+ (Users.size() - 1));
    }

    public User getUsers(int ID) {
        return Users.get(ID);
    }
    
}
