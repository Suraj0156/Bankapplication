import java.util.UUID;

public class HDFC implements Bankingaplication{
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    final double rateOfIntrest=7.1;
    final String IFSCcode="HDFC01180";
// Create default constructor
    public HDFC() {
    }
// create constructor
    public HDFC(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo= String.valueOf(UUID.randomUUID()) ;     // Create by UUID
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    @Override
    public String fatchbalance(String password) {
        if (this.password.equals(password)) {
            return "your balance is" + this.balance;
        }else {
            return "Inccorect password";

        }
    }

    @Override
    public String addMoney(double amount) {
        this.balance+=amount;
        return "Amount added succesfully New balance is"+ this.balance;
    }

    @Override
    public String withdrawalMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance<amount){
                return "Insufficient balanced";
            }
            this.balance-=amount;
            return "Balanced Wthdrawal Succesfully  New balance is"+this.balance;
            }
            return "Inccorect Password";
        }

    @Override
    public String changePassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            this.password=newpassword;
            return "password changed Succesfully";
        }
        return "Invalid old Password";
    }


    @Override
    public double calculateInterest(int year) {
     return (this.balance*year*rateOfIntrest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFC{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfIntrest=" + rateOfIntrest +
                ", IFSCcode='" + IFSCcode + '\'' +
                '}';
    }
}
