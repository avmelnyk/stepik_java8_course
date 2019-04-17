package pp.ua.avmelnyk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

    private String number;
    private Long balance;
    private boolean isLocked;

    public Account(String number, Long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("123123", 100000001L, false );
        Account account2= new Account("123123", -12L, false );
        accounts.add(account1);
        accounts.add(account2);
        List<Account>noneEmptyAccounts = accounts.stream().filter(accountX -> accountX.getBalance()>0).collect(Collectors.toList());
        noneEmptyAccounts.forEach(System.out::println);
        List<Account>accountsWithToMuchMoney = accounts.stream().filter(accountY -> !accountY.isLocked&&accountY.getBalance()>=100000000).collect(Collectors.toList());
        accountsWithToMuchMoney.forEach(System.out::println);
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", isLocked=" + isLocked +
                '}';
    }
}
