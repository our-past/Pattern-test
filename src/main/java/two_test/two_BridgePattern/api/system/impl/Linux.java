package two_test.two_BridgePattern.api.system.impl;

import two_test.two_BridgePattern.api.system.SystemAPI;

public class Linux implements SystemAPI {
    @Override
    public void userPlay() {
        System.out.println("Linux用户播放视频");
    }
}
