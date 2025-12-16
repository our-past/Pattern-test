package three_test.two_ObserverPattern.system.user;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import three_test.two_ObserverPattern.system.stock.Stock;

import java.util.HashMap;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
public class Investor extends User {
    private int money;
    private int stockValue;
    private HashMap<String, Integer> observerStocksValue;

    public Investor(String name, int money) {
        super(name);
        this.money = money;
        observerStocksValue = new HashMap<>();
    }

    public void purchaseStock(Stock stock, int num){
        int cost = stock.getValue() * num;
        if (money < cost){
            log.info("购买提醒：用户{}余额不足，无法购买{}股股票{}", this.getName(), num, stock.getName());
            return;
        }
        addObserver(stock);
        log.info("购买提醒：用户{}成功购买了{}股股票{}", this.getName(), num, stock.getName());
        observerStocksValue.put(stock.getName(), num);
        money -= stock.getValue() * num;
        stockValue += stock.getValue() * num;
    }

    public void sellStock(Stock stock,int num){
        if (!observerStocksValue.containsKey(stock.getName())){
            log.info("售出提醒：用户{}没有购买{}股票，无法卖出", this.getName(), stock.getName());
            return;
        }
        int numObserver = observerStocksValue.get(stock.getName());
        if (numObserver < num){
            log.info("售出提醒：用户{}购买了{}股{}股票，无法卖出{}股", this.getName(), numObserver, stock.getName(), num);
            return;
        }
        log.info("售出提醒：用户{}成功卖出了{}股股票{}", this.getName(), num, stock.getName());
        observerStocksValue.put(stock.getName(), numObserver - num);
        if (numObserver == num){
            removeObserver(stock);
            observerStocksValue.remove(stock.getName());
        }
        money += stock.getValue() * num;
        stockValue -= stock.getValue() * num;
    }

    public void update(String stockName){

    }

    public void update(String stockName, int oldValue){
        Stock stock = this.getObserverStocks().get(stockName);
        stockValue += (stock.getValue() - oldValue) * observerStocksValue.get(stockName);
        log.info("系统提醒您：您（用户{}）购买的股票{}的价格发生了改变，当前价格为{}", this.getName(), stock.getName(), stock.getValue());

    }

    public void notifyObserver(){
        log.info("用户{}账户信息如下：", this.getName());
        for (Stock stock : this.getObserverStocks().values()) {
            log.info("购买的股票{}的价格：{}，当前持仓：{}", stock.getName(), stock.getValue(), observerStocksValue.get(stock.getName()));
        }
    }
}
