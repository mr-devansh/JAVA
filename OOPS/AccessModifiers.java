package OOPS;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.username = "Devansh";
        account.setPassword("123dev");
        System.out.println(account.checkPassword("123dev"));
    }
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String password){
        this.password = password;
    }
    boolean checkPassword(String password){
        if (password.equals(this.password)) {
            return true;
        }else{
            return false;
        }
    }
}

// Private ----
// within class *
// within package
// outside package by subclass only
// outside package

// Default ----
// within class *
// within package *
// outside package by subclass only
// outside package

// Protected ----
// within class *
// within package *
// outside package by subclass only *
// outside package

// Public ----
// within class *
// within package *
// outside package by subclass only *
// outside package *