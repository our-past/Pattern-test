package two_test.one_AdapterPattern;

import two_test.one_AdapterPattern.adaptee.OldDataOperation;
import two_test.one_AdapterPattern.adapter.DataOperation;

import java.util.Arrays;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        DataOperation dataOperation = new OldDataOperation();
        int[] array = {4, 1, 2, 7, 5};
        int[] sortedArray = dataOperation.sort(array,"QuickSort");
        int index = dataOperation.search(sortedArray, 4,"BinarySearch");
        System.out.println("排序后的数组为：" + Arrays.toString(sortedArray));
        if (index != -1){
            System.out.println("元素 4 存在");
        }
        else{
            System.out.println("元素 4 不存在");
        }
    }
}
