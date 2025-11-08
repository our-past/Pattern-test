package two_test.two_BridgePattern.api.system.impl;

import two_test.two_BridgePattern.api.system.SystemAPI;

public class Windows implements SystemAPI {
    @Override
    public void userPlay() {
        System.out.println("Windows用户播放视频");
    }
}
