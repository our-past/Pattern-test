package two_test.two_BridgePattern.api.videoFormat.impl;

import two_test.two_BridgePattern.api.videoFormat.VideoFormatAPI;

public class AVI implements VideoFormatAPI {
    @Override
    public void player() {
        System.out.println("AVI视频播放");
    }
}
