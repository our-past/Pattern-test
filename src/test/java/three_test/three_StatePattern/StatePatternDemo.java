package three_test.three_StatePattern;

import three_test.three_StatePattern.system.BankSystem;

public class StatePatternDemo {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        bankSystem.addUser("李四", 0);
        bankSystem.withdrawMoney("李四", 1001);
        bankSystem.depositMoney("李四", 999);
        bankSystem.depositMoney("李四", 500);
        bankSystem.withdrawMoney("李四", 2499);
    }
}
