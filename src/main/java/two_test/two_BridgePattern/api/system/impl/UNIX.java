package two_test.two_BridgePattern.api.system.impl;

import two_test.two_BridgePattern.api.system.SystemAPI;

public class UNIX implements SystemAPI {
    @Override
    public void userPlay() {
        System.out.println("UNIX用户播放视频");
    }
}
