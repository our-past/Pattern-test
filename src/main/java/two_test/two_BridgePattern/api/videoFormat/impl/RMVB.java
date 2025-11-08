package two_test.two_BridgePattern.api.videoFormat.impl;

import two_test.two_BridgePattern.api.videoFormat.VideoFormatAPI;

public class RMVB implements VideoFormatAPI {
    @Override
    public void player() {
        System.out.println("RMVB视频播放");
    }
}
