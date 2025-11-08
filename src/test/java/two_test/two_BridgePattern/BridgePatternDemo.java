package two_test.two_BridgePattern;

import two_test.two_BridgePattern.api.system.impl.UNIX;
import two_test.two_BridgePattern.api.system.impl.Windows;
import two_test.two_BridgePattern.api.videoFormat.impl.MPEG;
import two_test.two_BridgePattern.api.videoFormat.impl.RMVB;
import two_test.two_BridgePattern.product.UserVideoPlayer;

public class BridgePatternDemo {
    public static void main(String[] args) {
        UserVideoPlayer userVideoPlayer = new UserVideoPlayer( new Windows(), new RMVB());
        userVideoPlayer.player();
        UserVideoPlayer userVideoPlayer2 = new UserVideoPlayer( new UNIX(), new MPEG());
        userVideoPlayer2.player();
    }
}
