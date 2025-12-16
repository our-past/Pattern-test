package three_test.three_StatePattern.system.state;

import three_test.three_StatePattern.system.user.BankUser;

public class RedState implements State{

    @Override
    public void depositMoney(BankUser bankUser, int money) {
        bankUser.setMoney(bankUser.getMoney() + money);
        System.out.println("用户"+bankUser.getName()+"存款成功,余额为"+bankUser.getMoney());
    }

    @Override
    public void withdrawMoney(BankUser bankUser, int money) {
        System.out.println("用户"+bankUser.getName()+"不能取款,余额为"+bankUser.getMoney());
    }
    @Override
    public void showState(BankUser bankUser) {
        System.out.println("用户"+bankUser.getName()+"状态为红,余额为"+bankUser.getMoney());
    }
}
