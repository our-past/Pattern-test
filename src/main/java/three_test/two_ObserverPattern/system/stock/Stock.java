package three_test.two_ObserverPattern.system.stock;

import lombok.Data;
import lombok.NoArgsConstructor;
import three_test.two_ObserverPattern.system.user.Investor;
import three_test.two_ObserverPattern.system.user.User;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class Stock {
    private String name;
    private int value;
    private List<User> ObserverInvestor;

    public Stock(String name, int value) {
        this.name = name;
        this.value = value;
        ObserverInvestor = new ArrayList<>();
    }

    public void setValue(int value){
        int oldValue = this.getValue();
        this.value = value;
        notifyObservers(oldValue);
    }

    public void addObserver(User observer){
        ObserverInvestor.add(observer);
    }

    public void removeObserver(User observer){
        ObserverInvestor.remove(observer);
    }

    public void notifyObservers(int oldValue){
        for (User observer : ObserverInvestor) {
            if (observer instanceof Investor){
                ((Investor) observer).update(this.getName(), oldValue);
            }else{
                observer.update(this.getName());
            }
        }
    }
}
