package two_test.two_BridgePattern.product;

import two_test.two_BridgePattern.api.system.SystemAPI;
import two_test.two_BridgePattern.api.videoFormat.VideoFormatAPI;

public abstract class VideoPlayer {
    protected SystemAPI system;
    protected VideoFormatAPI videoFormat;

    protected VideoPlayer(SystemAPI system, VideoFormatAPI videoFormat) {
        this.system = system;
        this.videoFormat = videoFormat;
    }

    // 视频播放
    public abstract void player();
}
