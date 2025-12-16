package three_test.three_StatePattern.system;

import lombok.NoArgsConstructor;
import three_test.three_StatePattern.system.state.GreenState;
import three_test.three_StatePattern.system.state.State;
import three_test.three_StatePattern.system.user.BankUser;

import java.util.HashMap;

public class BankSystem {
    HashMap<String, BankUser> stateMap = new HashMap<>();

    public BankSystem() {
        System.out.println("银行系统初始化成功,该银行最多支持余额为-2000");
    }

    public void addUser(String name, int money) {
        BankUser bankUser = new BankUser(name, money);
        stateMap.put(bankUser.getName(), bankUser);
    }
    public BankUser getUser(String name) {
        return stateMap.get(name);
    }
    public void removeUser(String name) {
        stateMap.remove(name);
    }

    public void depositMoney(String name, int money) {
        System.out.println("用户"+name+"存款"+money);
        BankUser bankUser = getUser(name);
        bankUser.depositMoney(money);
    }
    public void withdrawMoney(String name, int money) {
        System.out.println("用户"+name+"取款"+money);
        BankUser bankUser = getUser(name);
        bankUser.withdrawMoney(money);
    }

    public void printUserInfo(String name) {
        BankUser bankUser = getUser(name);
        System.out.println(bankUser);
    }
    public void printAllUserInfo() {
        stateMap.values().forEach(BankUser::printUserInfo);
    }
}
