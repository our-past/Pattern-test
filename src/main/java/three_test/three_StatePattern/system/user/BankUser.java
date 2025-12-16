package three_test.three_StatePattern.system.user;


import lombok.Data;
import three_test.three_StatePattern.system.factory.StateFactory;
import three_test.three_StatePattern.system.state.State;

@Data
public class BankUser {
    private State state;
    private String name;
    private int money;
    public BankUser(String name, int money) {
        this.name = name;
        this.money = money;
        this.state= StateFactory.createState(this.money);
    }

    public void depositMoney(int money) {
        state.depositMoney(this, money);
        this.state = StateFactory.createState(this.money);
    }

    public void withdrawMoney(int money) {
        state.withdrawMoney(this, money);
        this.state = StateFactory.createState(this.money);
    }

    public void printUserInfo() {
        System.out.println("用户姓名：" + name + "，余额：" + money + "，状态：" + state.getClass().getSimpleName());
    }
}
