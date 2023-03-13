package OOPS;

public class GetSet {
    public static void main(String[] args) {
        Bank account = new Bank();
        account.setuserId(12345);
        account.setpassword("devansh");
        System.out.println(account.getuserId()); 
        System.out.println(account.getPassword()); 
    }
}

class Bank{
    private int userId;
    private String password;

    void setuserId(int userId){
        this.userId = userId;
    }
    void setpassword(String password){
        this.password = password;
    }
    int getuserId(){
        return this.userId;
    }
    String getPassword(){
        return this.password;
    }
}