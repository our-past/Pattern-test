package three_test.one_IteratorPattern;

import three_test.one_IteratorPattern.system.iterator.Iterator;
import three_test.one_IteratorPattern.system.GoodsManagementSystem;
import three_test.one_IteratorPattern.system.NiceGoodsManagementSystem;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        GoodsManagementSystem goodsManagementSystem = new NiceGoodsManagementSystem();

        Iterator iterator = goodsManagementSystem.getIterator();
        while (iterator.hasNext()) {
            System.out.println("遍历：" + (String) iterator.next());
        }
        while (iterator.hasBack()) {
            System.out.println("回退：" + (String) iterator.back());
        }

    }
}
