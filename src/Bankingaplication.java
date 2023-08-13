public interface Bankingaplication {
    String fatchbalance(String password);

    String addMoney(double amount);

    String withdrawalMoney(double amount, String password);

    String changePassword(String oldpassword, String newpassword);

    double calculateInterest(int year);
}

