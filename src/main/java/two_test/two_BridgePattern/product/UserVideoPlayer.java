package two_test.two_BridgePattern.product;

import two_test.two_BridgePattern.api.system.SystemAPI;
import two_test.two_BridgePattern.api.videoFormat.VideoFormatAPI;

public class UserVideoPlayer extends VideoPlayer{

    public UserVideoPlayer(SystemAPI system, VideoFormatAPI videoFormat) {
        super(system, videoFormat);
    }

    // 视频播放
    @Override
    public void player() {
        System.out.println("用户视频播放");
        system.userPlay();
        videoFormat.player();
    }
}
