package three_test.three_StatePattern.system.factory;

import three_test.three_StatePattern.system.state.GreenState;
import three_test.three_StatePattern.system.state.RedState;
import three_test.three_StatePattern.system.state.State;
import three_test.three_StatePattern.system.state.YellowState;

public class StateFactory {
        public static State createState(int money) {
            if (money >= 0) {
                System.out.println("本用户状态目前为绿");
                return new GreenState();
            } else if (money >= -1000) {
                System.out.println("本用户状态目前为黄");
                return new YellowState();
            } else{
                System.out.println("本用户状态目前为红");
                return new RedState();
            }
        }
}
