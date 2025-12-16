package three_test.two_ObserverPattern;

import three_test.two_ObserverPattern.system.ListenerStockSystem;
import three_test.two_ObserverPattern.system.stock.GoodStock;
import three_test.two_ObserverPattern.system.user.Investor;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ListenerStockSystem stockSystem = new ListenerStockSystem();

        stockSystem.register(new Investor("user1", 100));
        stockSystem.register(new Investor("user2", 200));
        stockSystem.register(new GoodStock("stock1", 10));
        stockSystem.register(new GoodStock("stock2", 20));

        stockSystem.purchaseStock("user1", "stock1", 5);
        stockSystem.purchaseStock("user2", "stock2", 10);

        stockSystem.changeStockPrice("stock1", 15);
        stockSystem.changeStockPrice("stock2", 25);

        stockSystem.sellStock("user1", "stock1", 2);
        stockSystem.sellStock("user2", "stock2", 10);

        stockSystem.notifyObserver();

    }
}
