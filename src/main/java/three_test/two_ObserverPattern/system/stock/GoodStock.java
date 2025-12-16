package three_test.two_ObserverPattern.system.stock;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class GoodStock extends Stock {

    public GoodStock(String name, int value) {
        super(name, value);
    }

    @Override
    public void setValue(int value){
        int oldValue = this.getValue();
        log.info("股票变动：股票{}的价格从{}改变为{}", this.getName(), oldValue, value);
        super.setValue(value);
    }
}
