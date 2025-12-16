package three_test.three_StatePattern.system.state;

import three_test.three_StatePattern.system.user.BankUser;

public class GreenState implements State{

    @Override
    public void depositMoney(BankUser bankUser, int money) {
        bankUser.setMoney(bankUser.getMoney() + money);
        System.out.println("用户"+bankUser.getName()+"存款成功,余额为"+bankUser.getMoney());
    }

    @Override
    public void withdrawMoney(BankUser bankUser, int money) {
        if (bankUser.getMoney()+2000 < money) {
            System.out.println("用户"+bankUser.getName()+"余额不足，取款失败,余额为"+bankUser.getMoney());
            return;
        }
        bankUser.setMoney(bankUser.getMoney() - money);
        System.out.println("用户"+bankUser.getName()+"取款成功,余额为"+bankUser.getMoney());
    }

    @Override
    public void showState(BankUser bankUser) {
        System.out.println("用户"+bankUser.getName()+"状态为绿,余额为"+bankUser.getMoney());
    }
}
