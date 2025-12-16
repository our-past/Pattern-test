package three_test.two_ObserverPattern.system.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import three_test.two_ObserverPattern.system.stock.Stock;

import java.util.HashMap;

@Data
@NoArgsConstructor
public abstract class User {
    private String name;
    private HashMap<String, Stock> observerStocks;

    public User(String name) {
        this.name = name;
        this.observerStocks = new HashMap<>();
    }

    public void addObserver(Stock stock){
        observerStocks.put(stock.getName(), stock);
        this.observerStocks.get(stock.getName()).addObserver(this);
    }

    public void removeObserver(Stock stock){
        this.observerStocks.get(stock.getName()).removeObserver(this);
        observerStocks.remove(stock.getName());
    }

    public abstract void update(String stockName );

    public abstract void notifyObserver();


}
