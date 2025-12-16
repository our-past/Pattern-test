package three_test.three_StatePattern.system.state;

import three_test.three_StatePattern.system.user.BankUser;

public interface State {

    void depositMoney(BankUser bankUser, int money);

    void withdrawMoney(BankUser bankUser, int money);

    void showState(BankUser bankUser);
}
