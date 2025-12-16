package three_test.two_ObserverPattern.system;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import three_test.two_ObserverPattern.system.stock.Stock;
import three_test.two_ObserverPattern.system.user.Investor;
import three_test.two_ObserverPattern.system.user.User;

import java.util.HashMap;
@Slf4j
@AllArgsConstructor
public class ListenerStockSystem {
    HashMap<String, User> users;
    HashMap<String, Stock> stocks;

    public ListenerStockSystem() {
        users = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void register(User user) {
        users.put(user.getName(), user);
    }

    public void register(Stock stock) {
        stocks.put(stock.getName(), stock);
    }

     public void notifyObserver(){
        for (Stock stock : stocks.values()) {
            log.info("系统提醒：股票{}的价格为{}", stock.getName(), stock.getValue());
        }
        for (User user : users.values()) {

            if(user.getClass() == Investor.class){
                Investor investor = (Investor) user;
                log.info("系统提醒：投资者{}的余额为{}，股票价值为{}", investor.getName(), investor.getMoney(), investor.getStockValue());
                investor.notifyObserver();
            }else {
                log.info("系统提醒：用户{}", user.getName());
            }
        }
    }

    public void changeStockPrice(String stockName, int price){
        Stock stock = stocks.get(stockName);
        stock.setValue(price);
    }

    public void purchaseStock(String userName,String stockName, int price){
        if (users.get(userName).getClass() != Investor.class){
            log.info("系统提醒：用户{}不是投资者，无法购买股票", userName);
            return;
        }
        Investor investor = (Investor) users.get(userName);
        Stock stock = stocks.get(stockName);
        investor.purchaseStock(stock, price);
    }

    public void sellStock(String userName,String stockName, int num){
        if (users.get(userName).getClass() != Investor.class){
            log.info("系统提醒：用户{}不是投资者，无法卖出股票", userName);
            return;
        }
        Investor investor = (Investor) users.get(userName);
        Stock stock = stocks.get(stockName);
        investor.sellStock(stock, num);
    }

}
