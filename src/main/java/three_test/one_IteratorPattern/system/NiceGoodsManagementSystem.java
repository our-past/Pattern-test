package three_test.one_IteratorPattern.system;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import three_test.one_IteratorPattern.system.iterator.Iterator;

@AllArgsConstructor
@NoArgsConstructor
public class NiceGoodsManagementSystem implements GoodsManagementSystem{

    String[] goods = {"商品1", "商品2", "商品3"};

    @Override
    public Iterator getIterator() {
        return new NiceGoodsIterator();
    }

    private class NiceGoodsIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < goods.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return goods[index++];
            }
            return null;
        }

        @Override
        public boolean hasBack() {
            return index > 0;
        }
        @Override
        public Object back() {
            if (hasBack()) {
                return goods[--index];
            }
            return null;
        }
    }
}
