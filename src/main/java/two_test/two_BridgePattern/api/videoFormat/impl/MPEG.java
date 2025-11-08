package two_test.two_BridgePattern.api.videoFormat.impl;

import two_test.two_BridgePattern.api.videoFormat.VideoFormatAPI;

public class MPEG implements VideoFormatAPI {
    @Override
    public void player() {
        System.out.println("MPEG视频播放");
    }
}
