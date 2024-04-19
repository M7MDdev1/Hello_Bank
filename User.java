class User{
    private String name;
    private Account bAccount;
    
    public User(String name, String Username, float Balance){
        this.name = name;
        bAccount = new Account(Username, Balance);
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Account getbAccount() {
        return bAccount;
    }
    public void setbAccount(Account bAccount) {
        this.bAccount = bAccount;
    }


}